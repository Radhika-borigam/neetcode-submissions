class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        mp = {}

        for i in range(len(order)):
            mp[order[i]] = i

        for i in range(len(words) - 1):
            wrd1 = words[i]
            wrd2 = words[i + 1]

            j = 0

            while j < len(wrd1) and j < len(wrd2):

                if wrd1[j] != wrd2[j]:

                    if mp[wrd1[j]] > mp[wrd2[j]]:
                        return False

                    break

                j += 1

            # Prefix case
            if j == len(wrd2) and len(wrd1) > len(wrd2):
                return False

        return True