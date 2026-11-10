#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REGISTRY_WINDOWS_WIN32_SYSTEM_REGISTRY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REGISTRY_WINDOWS_WIN32_SYSTEM_REGISTRY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_registry_getRegistryValueWithFallbackW(void* hkeyprimary, void* pwszprimarysubkey, void* hkeyfallback, void* pwszfallbacksubkey, void* pwszvalue, uint32_t dwflags, void* pdwtype, void* pvdata, uint32_t cbdatain, void* pcbdataout);
uint32_t windowssys_windows_win32_system_registry_regCloseKey(void* hkey);
uint32_t windowssys_windows_win32_system_registry_regConnectRegistryA(void* lpmachinename, void* hkey, void* phkresult);
int32_t windowssys_windows_win32_system_registry_regConnectRegistryExA(void* lpmachinename, void* hkey, uint32_t flags, void* phkresult);
int32_t windowssys_windows_win32_system_registry_regConnectRegistryExW(void* lpmachinename, void* hkey, uint32_t flags, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_regConnectRegistryW(void* lpmachinename, void* hkey, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_regCopyTreeA(void* hkeysrc, void* lpsubkey, void* hkeydest);
uint32_t windowssys_windows_win32_system_registry_regCopyTreeW(void* hkeysrc, void* lpsubkey, void* hkeydest);
uint32_t windowssys_windows_win32_system_registry_regCreateKeyA(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_regCreateKeyExA(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition);
uint32_t windowssys_windows_win32_system_registry_regCreateKeyExW(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition);
uint32_t windowssys_windows_win32_system_registry_regCreateKeyTransactedA(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* htransaction, void* pextendedparemeter);
uint32_t windowssys_windows_win32_system_registry_regCreateKeyTransactedW(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* htransaction, void* pextendedparemeter);
uint32_t windowssys_windows_win32_system_registry_regCreateKeyW(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_regDeleteKeyA(void* hkey, void* lpsubkey);
uint32_t windowssys_windows_win32_system_registry_regDeleteKeyExA(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved);
uint32_t windowssys_windows_win32_system_registry_regDeleteKeyExW(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved);
uint32_t windowssys_windows_win32_system_registry_regDeleteKeyTransactedA(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved, void* htransaction, void* pextendedparameter);
uint32_t windowssys_windows_win32_system_registry_regDeleteKeyTransactedW(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved, void* htransaction, void* pextendedparameter);
uint32_t windowssys_windows_win32_system_registry_regDeleteKeyValueA(void* hkey, void* lpsubkey, void* lpvaluename);
uint32_t windowssys_windows_win32_system_registry_regDeleteKeyValueW(void* hkey, void* lpsubkey, void* lpvaluename);
uint32_t windowssys_windows_win32_system_registry_regDeleteKeyW(void* hkey, void* lpsubkey);
uint32_t windowssys_windows_win32_system_registry_regDeleteTreeA(void* hkey, void* lpsubkey);
uint32_t windowssys_windows_win32_system_registry_regDeleteTreeW(void* hkey, void* lpsubkey);
uint32_t windowssys_windows_win32_system_registry_regDeleteValueA(void* hkey, void* lpvaluename);
uint32_t windowssys_windows_win32_system_registry_regDeleteValueW(void* hkey, void* lpvaluename);
uint32_t windowssys_windows_win32_system_registry_regDisablePredefinedCache(void);
uint32_t windowssys_windows_win32_system_registry_regDisablePredefinedCacheEx(void);
uint32_t windowssys_windows_win32_system_registry_regDisableReflectionKey(void* hbase);
uint32_t windowssys_windows_win32_system_registry_regEnableReflectionKey(void* hbase);
uint32_t windowssys_windows_win32_system_registry_regEnumKeyA(void* hkey, uint32_t dwindex, void* lpname, uint32_t cchname);
uint32_t windowssys_windows_win32_system_registry_regEnumKeyExA(void* hkey, uint32_t dwindex, void* lpname, void* lpcchname, void* lpreserved, void* lpclass, void* lpcchclass, void* lpftlastwritetime);
uint32_t windowssys_windows_win32_system_registry_regEnumKeyExW(void* hkey, uint32_t dwindex, void* lpname, void* lpcchname, void* lpreserved, void* lpclass, void* lpcchclass, void* lpftlastwritetime);
uint32_t windowssys_windows_win32_system_registry_regEnumKeyW(void* hkey, uint32_t dwindex, void* lpname, uint32_t cchname);
uint32_t windowssys_windows_win32_system_registry_regEnumValueA(void* hkey, uint32_t dwindex, void* lpvaluename, void* lpcchvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_regEnumValueW(void* hkey, uint32_t dwindex, void* lpvaluename, void* lpcchvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_regFlushKey(void* hkey);
uint32_t windowssys_windows_win32_system_registry_regGetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssys_windows_win32_system_registry_regGetValueA(void* hkey, void* lpsubkey, void* lpvalue, uint32_t dwflags, void* pdwtype, void* pvdata, void* pcbdata);
uint32_t windowssys_windows_win32_system_registry_regGetValueW(void* hkey, void* lpsubkey, void* lpvalue, uint32_t dwflags, void* pdwtype, void* pvdata, void* pcbdata);
uint32_t windowssys_windows_win32_system_registry_regLoadAppKeyA(void* lpfile, void* phkresult, uint32_t samdesired, uint32_t dwoptions, uint32_t reserved);
uint32_t windowssys_windows_win32_system_registry_regLoadAppKeyW(void* lpfile, void* phkresult, uint32_t samdesired, uint32_t dwoptions, uint32_t reserved);
uint32_t windowssys_windows_win32_system_registry_regLoadKeyA(void* hkey, void* lpsubkey, void* lpfile);
uint32_t windowssys_windows_win32_system_registry_regLoadKeyW(void* hkey, void* lpsubkey, void* lpfile);
uint32_t windowssys_windows_win32_system_registry_regLoadMUIStringA(void* hkey, void* pszvalue, void* pszoutbuf, uint32_t cboutbuf, void* pcbdata, uint32_t flags, void* pszdirectory);
uint32_t windowssys_windows_win32_system_registry_regLoadMUIStringW(void* hkey, void* pszvalue, void* pszoutbuf, uint32_t cboutbuf, void* pcbdata, uint32_t flags, void* pszdirectory);
uint32_t windowssys_windows_win32_system_registry_regNotifyChangeKeyValue(void* hkey, int32_t bwatchsubtree, uint32_t dwnotifyfilter, void* hevent, int32_t fasynchronous);
uint32_t windowssys_windows_win32_system_registry_regOpenCurrentUser(uint32_t samdesired, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_regOpenKeyA(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_regOpenKeyExA(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_regOpenKeyExW(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_regOpenKeyTransactedA(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult, void* htransaction, void* pextendedparemeter);
uint32_t windowssys_windows_win32_system_registry_regOpenKeyTransactedW(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult, void* htransaction, void* pextendedparemeter);
uint32_t windowssys_windows_win32_system_registry_regOpenKeyW(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_regOpenUserClassesRoot(void* htoken, uint32_t dwoptions, uint32_t samdesired, void* phkresult);
uint32_t windowssys_windows_win32_system_registry_regOverridePredefKey(void* hkey, void* hnewhkey);
uint32_t windowssys_windows_win32_system_registry_regQueryInfoKeyA(void* hkey, void* lpclass, void* lpcchclass, void* lpreserved, void* lpcsubkeys, void* lpcbmaxsubkeylen, void* lpcbmaxclasslen, void* lpcvalues, void* lpcbmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime);
uint32_t windowssys_windows_win32_system_registry_regQueryInfoKeyW(void* hkey, void* lpclass, void* lpcchclass, void* lpreserved, void* lpcsubkeys, void* lpcbmaxsubkeylen, void* lpcbmaxclasslen, void* lpcvalues, void* lpcbmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime);
uint32_t windowssys_windows_win32_system_registry_regQueryMultipleValuesA(void* hkey, void* val_list, uint32_t num_vals, void* lpvaluebuf, void* ldwtotsize);
uint32_t windowssys_windows_win32_system_registry_regQueryMultipleValuesW(void* hkey, void* val_list, uint32_t num_vals, void* lpvaluebuf, void* ldwtotsize);
uint32_t windowssys_windows_win32_system_registry_regQueryReflectionKey(void* hbase, void* bisreflectiondisabled);
uint32_t windowssys_windows_win32_system_registry_regQueryValueA(void* hkey, void* lpsubkey, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_regQueryValueExA(void* hkey, void* lpvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_regQueryValueExW(void* hkey, void* lpvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_regQueryValueW(void* hkey, void* lpsubkey, void* lpdata, void* lpcbdata);
uint32_t windowssys_windows_win32_system_registry_regRenameKey(void* hkey, void* lpsubkeyname, void* lpnewkeyname);
uint32_t windowssys_windows_win32_system_registry_regReplaceKeyA(void* hkey, void* lpsubkey, void* lpnewfile, void* lpoldfile);
uint32_t windowssys_windows_win32_system_registry_regReplaceKeyW(void* hkey, void* lpsubkey, void* lpnewfile, void* lpoldfile);
uint32_t windowssys_windows_win32_system_registry_regRestoreKeyA(void* hkey, void* lpfile, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_registry_regRestoreKeyW(void* hkey, void* lpfile, uint32_t dwflags);
uint32_t windowssys_windows_win32_system_registry_regSaveKeyA(void* hkey, void* lpfile, void* lpsecurityattributes);
uint32_t windowssys_windows_win32_system_registry_regSaveKeyExA(void* hkey, void* lpfile, void* lpsecurityattributes, uint32_t flags);
uint32_t windowssys_windows_win32_system_registry_regSaveKeyExW(void* hkey, void* lpfile, void* lpsecurityattributes, uint32_t flags);
uint32_t windowssys_windows_win32_system_registry_regSaveKeyW(void* hkey, void* lpfile, void* lpsecurityattributes);
uint32_t windowssys_windows_win32_system_registry_regSetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssys_windows_win32_system_registry_regSetKeyValueA(void* hkey, void* lpsubkey, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_regSetKeyValueW(void* hkey, void* lpsubkey, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_regSetValueA(void* hkey, void* lpsubkey, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_regSetValueExA(void* hkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_regSetValueExW(void* hkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_regSetValueW(void* hkey, void* lpsubkey, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssys_windows_win32_system_registry_regUnLoadKeyA(void* hkey, void* lpsubkey);
uint32_t windowssys_windows_win32_system_registry_regUnLoadKeyW(void* hkey, void* lpsubkey);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REGISTRY_WINDOWS_WIN32_SYSTEM_REGISTRY_WRAPPER_H */
