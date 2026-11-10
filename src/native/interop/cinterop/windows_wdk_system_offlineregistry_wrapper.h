#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_wdk_system_offlineregistry_oRCloseHive(void* handle);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRCloseKey(void* keyhandle);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRCreateHive(void* horkey);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRCreateKey(void* keyhandle, void* lpsubkey, void* lpclass, uint32_t dwoptions, void* psecuritydescriptor, void* phkresult, void* pdwdisposition);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRDeleteKey(void* handle, void* lpsubkey);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRDeleteValue(void* handle, void* lpvaluename);
uint32_t windowssys_windows_wdk_system_offlineregistry_oREnumKey(void* handle, uint32_t dwindex, void* lpname, void* lpcname, void* lpclass, void* lpcclass, void* lpftlastwritetime);
uint32_t windowssys_windows_wdk_system_offlineregistry_oREnumValue(void* handle, uint32_t dwindex, void* lpvaluename, void* lpcvaluename, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRGetKeySecurity(void* handle, uint32_t securityinformation, void* psecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRGetValue(void* handle, void* lpsubkey, void* lpvalue, void* pdwtype, void* pvdata, void* pcbdata);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRGetVersion(void* pdwmajorversion, void* pdwminorversion);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRGetVirtualFlags(void* handle, void* pdwflags);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRMergeHives(void* hivehandles, uint32_t hivecount, void* phkresult);
uint32_t windowssys_windows_wdk_system_offlineregistry_oROpenHive(void* filepath, void* horkey);
uint32_t windowssys_windows_wdk_system_offlineregistry_oROpenHiveByHandle(void* filehandle, void* horkey);
uint32_t windowssys_windows_wdk_system_offlineregistry_oROpenKey(void* handle, void* lpsubkey, void* phkresult);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRQueryInfoKey(void* handle, void* lpclass, void* lpcclass, void* lpcsubkeys, void* lpcmaxsubkeylen, void* lpcmaxclasslen, void* lpcvalues, void* lpcmaxvaluenamelen, void* lpcmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRRenameKey(void* handle, void* lpnewname);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRSaveHive(void* horkey, void* hivepath, uint32_t osmajorversion, uint32_t osminorversion);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRSetKeySecurity(void* handle, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRSetValue(void* handle, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRSetVirtualFlags(void* handle, uint32_t dwflags);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRShutdown(void);
uint32_t windowssys_windows_wdk_system_offlineregistry_oRStart(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WRAPPER_H */
