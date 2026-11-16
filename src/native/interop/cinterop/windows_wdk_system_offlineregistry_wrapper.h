#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWdkSystemOfflineregistryORCloseHive(void* handle);
uint32_t windowssysWindowsWdkSystemOfflineregistryORCloseKey(void* keyhandle);
uint32_t windowssysWindowsWdkSystemOfflineregistryORCreateHive(void* horkey);
uint32_t windowssysWindowsWdkSystemOfflineregistryORCreateKey(void* keyhandle, void* lpsubkey, void* lpclass, uint32_t dwoptions, void* psecuritydescriptor, void* phkresult, void* pdwdisposition);
uint32_t windowssysWindowsWdkSystemOfflineregistryORDeleteKey(void* handle, void* lpsubkey);
uint32_t windowssysWindowsWdkSystemOfflineregistryORDeleteValue(void* handle, void* lpvaluename);
uint32_t windowssysWindowsWdkSystemOfflineregistryOREnumKey(void* handle, uint32_t dwindex, void* lpname, void* lpcname, void* lpclass, void* lpcclass, void* lpftlastwritetime);
uint32_t windowssysWindowsWdkSystemOfflineregistryOREnumValue(void* handle, uint32_t dwindex, void* lpvaluename, void* lpcvaluename, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssysWindowsWdkSystemOfflineregistryORGetKeySecurity(void* handle, uint32_t securityinformation, void* psecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssysWindowsWdkSystemOfflineregistryORGetValue(void* handle, void* lpsubkey, void* lpvalue, void* pdwtype, void* pvdata, void* pcbdata);
uint32_t windowssysWindowsWdkSystemOfflineregistryORGetVersion(void* pdwmajorversion, void* pdwminorversion);
uint32_t windowssysWindowsWdkSystemOfflineregistryORGetVirtualFlags(void* handle, void* pdwflags);
uint32_t windowssysWindowsWdkSystemOfflineregistryORMergeHives(void* hivehandles, uint32_t hivecount, void* phkresult);
uint32_t windowssysWindowsWdkSystemOfflineregistryOROpenHive(void* filepath, void* horkey);
uint32_t windowssysWindowsWdkSystemOfflineregistryOROpenHiveByHandle(void* filehandle, void* horkey);
uint32_t windowssysWindowsWdkSystemOfflineregistryOROpenKey(void* handle, void* lpsubkey, void* phkresult);
uint32_t windowssysWindowsWdkSystemOfflineregistryORQueryInfoKey(void* handle, void* lpclass, void* lpcclass, void* lpcsubkeys, void* lpcmaxsubkeylen, void* lpcmaxclasslen, void* lpcvalues, void* lpcmaxvaluenamelen, void* lpcmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime);
uint32_t windowssysWindowsWdkSystemOfflineregistryORRenameKey(void* handle, void* lpnewname);
uint32_t windowssysWindowsWdkSystemOfflineregistryORSaveHive(void* horkey, void* hivepath, uint32_t osmajorversion, uint32_t osminorversion);
uint32_t windowssysWindowsWdkSystemOfflineregistryORSetKeySecurity(void* handle, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssysWindowsWdkSystemOfflineregistryORSetValue(void* handle, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssysWindowsWdkSystemOfflineregistryORSetVirtualFlags(void* handle, uint32_t dwflags);
uint32_t windowssysWindowsWdkSystemOfflineregistryORShutdown(void);
uint32_t windowssysWindowsWdkSystemOfflineregistryORStart(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WINDOWS_WDK_SYSTEM_OFFLINEREGISTRY_WRAPPER_H */
