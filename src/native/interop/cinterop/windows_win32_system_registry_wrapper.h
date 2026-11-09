#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REGISTRY_WINDOWS_WIN32_SYSTEM_REGISTRY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REGISTRY_WINDOWS_WIN32_SYSTEM_REGISTRY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_registry_GetRegistryValueWithFallbackW(void* hkeyprimary, void* pwszprimarysubkey, void* hkeyfallback, void* pwszfallbacksubkey, void* pwszvalue, uint32_t dwflags, void* pdwtype, void* pvdata, uint32_t cbdatain, void* pcbdataout);
uint32_t windowssys_windows_win32_system_registry_RegCloseKey(void* hkey);
uint32_t windowssys_windows_win32_system_registry_RegConnectRegistryA(void* lpmachinename, void* hkey, void* phkresult);
int32_t windowssys_windows_win32_system_registry_RegConnectRegistryExA(void* lpmachinename, void* hkey, uint32_t flags, void* phkresult);
int32_t windowssys_windows_win32_system_registry_RegConnectRegistryExW(void* lpmachinename, void* hkey, uint32_t flags, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_RegConnectRegistryW(void* lpmachinename, void* hkey, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_RegCopyTreeA(void* hkeysrc, void* lpsubkey, void* hkeydest);
uint32_t windowssys_windows_win32_system_registry_RegCopyTreeW(void* hkeysrc, void* lpsubkey, void* hkeydest);
uint32_t windowssys_windows_win32_system_registry_RegCreateKeyA(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_RegCreateKeyExA(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition);
uint32_t windowssys_windows_win32_system_registry_RegCreateKeyExW(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition);
uint32_t windowssys_windows_win32_system_registry_RegCreateKeyTransactedA(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* htransaction, void* pextendedparemeter);
uint32_t windowssys_windows_win32_system_registry_RegCreateKeyTransactedW(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* htransaction, void* pextendedparemeter);
uint32_t windowssys_windows_win32_system_registry_RegCreateKeyW(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyA(void* hkey, void* lpsubkey);
uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyExA(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved);
uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyExW(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved);
uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyTransactedA(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved, void* htransaction, void* pextendedparameter);
uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyTransactedW(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved, void* htransaction, void* pextendedparameter);
uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyValueA(void* hkey, void* lpsubkey, void* lpvaluename);
uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyValueW(void* hkey, void* lpsubkey, void* lpvaluename);
uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyW(void* hkey, void* lpsubkey);
uint32_t windowssys_windows_win32_system_registry_RegDeleteTreeA(void* hkey, void* lpsubkey);
uint32_t windowssys_windows_win32_system_registry_RegDeleteTreeW(void* hkey, void* lpsubkey);
uint32_t windowssys_windows_win32_system_registry_RegDeleteValueA(void* hkey, void* lpvaluename);
uint32_t windowssys_windows_win32_system_registry_RegDeleteValueW(void* hkey, void* lpvaluename);
uint32_t windowssys_windows_win32_system_registry_RegDisablePredefinedCache(void);
uint32_t windowssys_windows_win32_system_registry_RegDisablePredefinedCacheEx(void);
uint32_t windowssys_windows_win32_system_registry_RegDisableReflectionKey(void* hbase);
uint32_t windowssys_windows_win32_system_registry_RegEnableReflectionKey(void* hbase);
uint32_t windowssys_windows_win32_system_registry_RegEnumKeyA(void* hkey, uint32_t dwindex, void* lpname, uint32_t cchname);
uint32_t windowssys_windows_win32_system_registry_RegEnumKeyExA(void* hkey, uint32_t dwindex, void* lpname, void* lpcchname, void* lpreserved, void* lpclass, void* lpcchclass, void* lpftlastwritetime);
uint32_t windowssys_windows_win32_system_registry_RegEnumKeyExW(void* hkey, uint32_t dwindex, void* lpname, void* lpcchname, void* lpreserved, void* lpclass, void* lpcchclass, void* lpftlastwritetime);
uint32_t windowssys_windows_win32_system_registry_RegEnumKeyW(void* hkey, uint32_t dwindex, void* lpname, uint32_t cchname);
uint32_t windowssys_windows_win32_system_registry_RegEnumValueA(void* hkey, uint32_t dwindex, void* lpvaluename, void* lpcchvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_RegEnumValueW(void* hkey, uint32_t dwindex, void* lpvaluename, void* lpcchvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_RegFlushKey(void* hkey);
uint32_t windowssys_windows_win32_system_registry_RegGetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssys_windows_win32_system_registry_RegGetValueA(void* hkey, void* lpsubkey, void* lpvalue, uint32_t dwflags, void* pdwtype, void* pvdata, void* pcbdata);
uint32_t windowssys_windows_win32_system_registry_RegGetValueW(void* hkey, void* lpsubkey, void* lpvalue, uint32_t dwflags, void* pdwtype, void* pvdata, void* pcbdata);
uint32_t windowssys_windows_win32_system_registry_RegLoadAppKeyA(void* lpfile, void* phkresult, uint32_t samdesired, uint32_t dwoptions, uint32_t reserved);
uint32_t windowssys_windows_win32_system_registry_RegLoadAppKeyW(void* lpfile, void* phkresult, uint32_t samdesired, uint32_t dwoptions, uint32_t reserved);
uint32_t windowssys_windows_win32_system_registry_RegLoadKeyA(void* hkey, void* lpsubkey, void* lpfile);
uint32_t windowssys_windows_win32_system_registry_RegLoadKeyW(void* hkey, void* lpsubkey, void* lpfile);
uint32_t windowssys_windows_win32_system_registry_RegLoadMUIStringA(void* hkey, void* pszvalue, void* pszoutbuf, uint32_t cboutbuf, void* pcbdata, uint32_t flags, void* pszdirectory);
uint32_t windowssys_windows_win32_system_registry_RegLoadMUIStringW(void* hkey, void* pszvalue, void* pszoutbuf, uint32_t cboutbuf, void* pcbdata, uint32_t flags, void* pszdirectory);
uint32_t windowssys_windows_win32_system_registry_RegNotifyChangeKeyValue(void* hkey, int32_t bwatchsubtree, uint32_t dwnotifyfilter, void* hevent, int32_t fasynchronous);
uint32_t windowssys_windows_win32_system_registry_RegOpenCurrentUser(uint32_t samdesired, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_RegOpenKeyA(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_RegOpenKeyExA(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_RegOpenKeyExW(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_RegOpenKeyTransactedA(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult, void* htransaction, void* pextendedparemeter);
uint32_t windowssys_windows_win32_system_registry_RegOpenKeyTransactedW(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult, void* htransaction, void* pextendedparemeter);
uint32_t windowssys_windows_win32_system_registry_RegOpenKeyW(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_RegOpenUserClassesRoot(void* htoken, uint32_t dwoptions, uint32_t samdesired, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_RegOverridePredefKey(void* hkey, void* hnewhkey);
uint32_t windowssys_windows_win32_system_registry_RegQueryInfoKeyA(void* hkey, void* lpclass, void* lpcchclass, void* lpreserved, void* lpcsubkeys, void* lpcbmaxsubkeylen, void* lpcbmaxclasslen, void* lpcvalues, void* lpcbmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime);
uint32_t windowssys_windows_win32_system_registry_RegQueryInfoKeyW(void* hkey, void* lpclass, void* lpcchclass, void* lpreserved, void* lpcsubkeys, void* lpcbmaxsubkeylen, void* lpcbmaxclasslen, void* lpcvalues, void* lpcbmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime);
uint32_t windowssys_windows_win32_system_registry_RegQueryMultipleValuesA(void* hkey, void* val_list, uint32_t num_vals, void* lpvaluebuf, void* ldwtotsize);
uint32_t windowssys_windows_win32_system_registry_RegQueryMultipleValuesW(void* hkey, void* val_list, uint32_t num_vals, void* lpvaluebuf, void* ldwtotsize);
uint32_t windowssys_windows_win32_system_registry_RegQueryReflectionKey(void* hbase, void* bisreflectiondisabled);
uint32_t windowssys_windows_win32_system_registry_RegQueryValueA(void* hkey, void* lpsubkey, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_RegQueryValueExA(void* hkey, void* lpvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_RegQueryValueExW(void* hkey, void* lpvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_RegQueryValueW(void* hkey, void* lpsubkey, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_RegRenameKey(void* hkey, void* lpsubkeyname, void* lpnewkeyname);
uint32_t windowssys_windows_win32_system_registry_RegReplaceKeyA(void* hkey, void* lpsubkey, void* lpnewfile, void* lpoldfile);
uint32_t windowssys_windows_win32_system_registry_RegReplaceKeyW(void* hkey, void* lpsubkey, void* lpnewfile, void* lpoldfile);
uint32_t windowssys_windows_win32_system_registry_RegRestoreKeyA(void* hkey, void* lpfile, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_registry_RegRestoreKeyW(void* hkey, void* lpfile, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_registry_RegSaveKeyA(void* hkey, void* lpfile, void* lpsecurityattributes);
uint32_t windowssys_windows_win32_system_registry_RegSaveKeyExA(void* hkey, void* lpfile, void* lpsecurityattributes, uint32_t flags);
uint32_t windowssys_windows_win32_system_registry_RegSaveKeyExW(void* hkey, void* lpfile, void* lpsecurityattributes, uint32_t flags);
uint32_t windowssys_windows_win32_system_registry_RegSaveKeyW(void* hkey, void* lpfile, void* lpsecurityattributes);
uint32_t windowssys_windows_win32_system_registry_RegSetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssys_windows_win32_system_registry_RegSetKeyValueA(void* hkey, void* lpsubkey, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_RegSetKeyValueW(void* hkey, void* lpsubkey, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_RegSetValueA(void* hkey, void* lpsubkey, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_RegSetValueExA(void* hkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_RegSetValueExW(void* hkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_RegSetValueW(void* hkey, void* lpsubkey, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_RegUnLoadKeyA(void* hkey, void* lpsubkey);
uint32_t windowssys_windows_win32_system_registry_RegUnLoadKeyW(void* hkey, void* lpsubkey);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REGISTRY_WINDOWS_WIN32_SYSTEM_REGISTRY_WRAPPER_H */
