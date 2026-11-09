#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_wdk_system_offlineregistry_ORCloseHive(void* handle);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORCloseKey(void* keyhandle);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORCreateHive(void* horkey);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORCreateKey(void* keyhandle, void* lpsubkey, void* lpclass, uint32_t dwoptions, void* psecuritydescriptor, void* phkresult, void* pdwdisposition);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORDeleteKey(void* handle, void* lpsubkey);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORDeleteValue(void* handle, void* lpvaluename);
uint32_t windowssys_windows_wdk_system_offlineregistry_OREnumKey(void* handle, uint32_t dwindex, void* lpname, void* lpcname, void* lpclass, void* lpcclass, void* lpftlastwritetime);
uint32_t windowssys_windows_wdk_system_offlineregistry_OREnumValue(void* handle, uint32_t dwindex, void* lpvaluename, void* lpcvaluename, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORGetKeySecurity(void* handle, uint32_t securityinformation, void* psecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORGetValue(void* handle, void* lpsubkey, void* lpvalue, void* pdwtype, void* pvdata, void* pcbdata);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORGetVersion(void* pdwmajorversion, void* pdwminorversion);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORGetVirtualFlags(void* handle, void* pdwflags);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORMergeHives(void* hivehandles, uint32_t hivecount, void* phkresult);
uint32_t windowssys_windows_wdk_system_offlineregistry_OROpenHive(void* filepath, void* horkey);
uint32_t windowssys_windows_wdk_system_offlineregistry_OROpenHiveByHandle(void* filehandle, void* horkey);
uint32_t windowssys_windows_wdk_system_offlineregistry_OROpenKey(void* handle, void* lpsubkey, void* phkresult);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORQueryInfoKey(void* handle, void* lpclass, void* lpcclass, void* lpcsubkeys, void* lpcmaxsubkeylen, void* lpcmaxclasslen, void* lpcvalues, void* lpcmaxvaluenamelen, void* lpcmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORRenameKey(void* handle, void* lpnewname);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORSaveHive(void* horkey, void* hivepath, uint32_t osmajorversion, uint32_t osminorversion);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORSetKeySecurity(void* handle, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORSetValue(void* handle, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORSetVirtualFlags(void* handle, uint32_t dwflags);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORShutdown(void);
uint32_t windowssys_windows_wdk_system_offlineregistry_ORStart(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WRAPPER_H */
