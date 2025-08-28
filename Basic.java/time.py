function minWorkPerDay(tasks, D):
    low  = max(tasks)
    high = sum(tasks)

    while low <= high:
        mid = (low + high) / 2

        if canFinish(tasks, D, mid):
            answer = mid
            high = mid - 1   // try smaller
        else:
            low = mid + 1    // need bigger

    return answer


function canFinish(tasks, D, capacity):
    days = 1
    current = 0

    for work in tasks:
        if current + work <= capacity:
            current += work
        else:
            days += 1
            current = work
            if days > D:
                return false
    return true