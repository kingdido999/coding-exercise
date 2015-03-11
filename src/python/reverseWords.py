def reverseWords(s):
    res = ''
    words = s.split(' ')

    for i in range(len(words)-1, 0):
        res += words[i]
        print(res)
        if i > 0:
            res += ' '

    return res


def main():
    s1 = 'I like dog'
    print(reverseWords(s1))

if __name__ == '__main__':
    main()
