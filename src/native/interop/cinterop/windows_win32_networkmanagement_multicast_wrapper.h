#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup(void);
uint32_t windowssysWindowsWin32NetworkmanagementMulticastMcastApiStartup(void* version);
uint32_t windowssysWindowsWin32NetworkmanagementMulticastMcastEnumerateScopes(uint16_t addrfamily, int32_t requery, void* pscopelist, void* pscopelen, void* pscopecount);
uint32_t windowssysWindowsWin32NetworkmanagementMulticastMcastGenUID(void* prequestid);
uint32_t windowssysWindowsWin32NetworkmanagementMulticastMcastReleaseAddress(uint16_t addrfamily, void* prequestid, void* preleaserequest);
uint32_t windowssysWindowsWin32NetworkmanagementMulticastMcastRenewAddress(uint16_t addrfamily, void* prequestid, void* prenewrequest, void* prenewresponse);
uint32_t windowssysWindowsWin32NetworkmanagementMulticastMcastRequestAddress(uint16_t addrfamily, void* prequestid, void* pscopectx, void* paddrrequest, void* paddrresponse);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WINDOWS_WIN32_NETWORKMANAGEMENT_MULTICAST_WRAPPER_H */
