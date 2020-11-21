using System.Collections.Generic;
using System.Linq;

namespace SpeedrunKata.stage2
{
    /**
     * Refactor until there is no else, you think the code is clean, and all the tests pass.
     */
    public class Stage2
    {
        public static int ComputeScore(int dice1, int dice2, int dice3)
        {
            if (AllDicesAreTheSame(dice1, dice2, dice3))
            {
                return 0;
            }

            if (TwoDicesAreTheSame(dice1, dice2, dice3))
            {
                return (dice1 + dice2 + dice3) * 2;
            }

            if (DicesHaveSpecialCombination2(dice1, dice2, dice3))
            {
                return 100;
            }

            return dice1 + dice2 + dice3;
        }

        private static bool TwoDicesAreTheSame(int dice1, int dice2, int dice3)
        {
            return dice1 == dice2 || dice2 == dice3 || dice1 == dice3;
        }

        private static bool AllDicesAreTheSame(int dice1, int dice2, int dice3)
        {
            return dice1 == dice2 && dice1 == dice3;
        }

        private static bool DicesHaveSpecialCombination2(int dice1, int dice2, int dice3)
        {
            List<int> expectedValues, foundValues;
            NewMethod(dice1, dice2, dice3, out expectedValues, out foundValues);

            foundValues.Sort();
            if (expectedValues.SequenceEqual(foundValues))
            {
                return true;
            }

            return false;
        }

        private static void NewMethod(int dice1, int dice2, int dice3, out List<int> expectedValues, out List<int> foundValues)
        {
            expectedValues = new List<int>() { 1, 2, 3 };
            foundValues = new List<int>();
            foreach (var currentDice in new List<int>() { dice1, dice2, dice3 })
            {
                if (expectedValues.Contains(currentDice))
                {
                    foundValues.Add(currentDice);
                }
            }
        }
    }
}
