/**
 * Refactor until there is no else, you think the code is clean, and all the tests pass.
 */

#include "Stage2.hpp"
int Stage2::computeScore(int dice1, int dice2, int dice3) {
  int score;
  if (dice1 == dice2 && dice1 == dice3) {
    score = 0;
  } else {
    if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
      score = (dice1 + dice2 + dice3) * 2;
    } else {
      if (dice1 == 1 && dice2 == 2 && dice3 == 3) {
        score = 100;
      } else {
        if (dice1 == 1 && dice2 == 3 && dice3 == 2) {
          score = 100;
        } else {
          if (dice1 == 2 && dice2 == 1 && dice3 == 3) {
            score = 100;
          } else {
            if (dice1 == 2 && dice2 == 3 && dice3 == 1) {
              score = 100;
            } else {
              if (dice1 == 3 && dice2 == 1 && dice3 == 2) {
                score = 100;
              } else {
                if (dice1 == 3 && dice2 == 2 && dice3 == 1) {
                  score = 100;
                } else {
                  score = dice1 + dice2 + dice3;
                }
              }
            }
          }
        }
      }
    }
  }
  return score;
}
