#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTNOTIFICATIONSERVICE_WINDOWS_WIN32_SYSTEM_EVENTNOTIFICATIONSERVICE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTNOTIFICATIONSERVICE_WINDOWS_WIN32_SYSTEM_EVENTNOTIFICATIONSERVICE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableA(void* lpszdestination, void* lpqocinfo);
int32_t windowssysWindowsWin32SystemEventnotificationserviceIsDestinationReachableW(void* lpszdestination, void* lpqocinfo);
int32_t windowssysWindowsWin32SystemEventnotificationserviceIsNetworkAlive(void* lpdwflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_EVENTNOTIFICATIONSERVICE_WINDOWS_WIN32_SYSTEM_EVENTNOTIFICATIONSERVICE_WRAPPER_H */
