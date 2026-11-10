#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_networkmanagement_multicast_mcastApiCleanup(void);
uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastApiStartup(void* version);
uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastEnumerateScopes(uint16_t addrfamily, int32_t requery, void* pscopelist, void* pscopelen, void* pscopecount);
uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastGenUID(void* prequestid);
uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastReleaseAddress(uint16_t addrfamily, void* prequestid, void* preleaserequest);
uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastRenewAddress(uint16_t addrfamily, void* prequestid, void* prenewrequest, void* prenewresponse);
uint32_t windowssys_windows_win32_networkmanagement_multicast_mcastRequestAddress(uint16_t addrfamily, void* prequestid, void* pscopectx, void* paddrrequest, void* paddrresponse);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WRAPPER_H */
