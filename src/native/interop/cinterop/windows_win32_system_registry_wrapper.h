#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REGISTRY_WINDOWS_WIN32_SYSTEM_REGISTRY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REGISTRY_WINDOWS_WIN32_SYSTEM_REGISTRY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32SystemRegistryGetRegistryValueWithFallbackW(void* hkeyprimary, void* pwszprimarysubkey, void* hkeyfallback, void* pwszfallbacksubkey, void* pwszvalue, uint32_t dwflags, void* pdwtype, void* pvdata, uint32_t cbdatain, void* pcbdataout);
uint32_t windowssysWindowsWin32SystemRegistryRegCloseKey(void* hkey);
uint32_t windowssysWindowsWin32SystemRegistryRegConnectRegistryA(void* lpmachinename, void* hkey, void* phkresult);
int32_t windowssysWindowsWin32SystemRegistryRegConnectRegistryExA(void* lpmachinename, void* hkey, uint32_t flags, void* phkresult);
int32_t windowssysWindowsWin32SystemRegistryRegConnectRegistryExW(void* lpmachinename, void* hkey, uint32_t flags, void* phkresult);
uint32_t windowssysWindowsWin32SystemRegistryRegConnectRegistryW(void* lpmachinename, void* hkey, void* phkresult);
uint32_t windowssysWindowsWin32SystemRegistryRegCopyTreeA(void* hkeysrc, void* lpsubkey, void* hkeydest);
uint32_t windowssysWindowsWin32SystemRegistryRegCopyTreeW(void* hkeysrc, void* lpsubkey, void* hkeydest);
uint32_t windowssysWindowsWin32SystemRegistryRegCreateKeyA(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssysWindowsWin32SystemRegistryRegCreateKeyExA(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition);
uint32_t windowssysWindowsWin32SystemRegistryRegCreateKeyExW(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition);
uint32_t windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedA(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* htransaction, void* pextendedparemeter);
uint32_t windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedW(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* htransaction, void* pextendedparemeter);
uint32_t windowssysWindowsWin32SystemRegistryRegCreateKeyW(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteKeyA(void* hkey, void* lpsubkey);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteKeyExA(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteKeyExW(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedA(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved, void* htransaction, void* pextendedparameter);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedW(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved, void* htransaction, void* pextendedparameter);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteKeyValueA(void* hkey, void* lpsubkey, void* lpvaluename);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteKeyValueW(void* hkey, void* lpsubkey, void* lpvaluename);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteKeyW(void* hkey, void* lpsubkey);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteTreeA(void* hkey, void* lpsubkey);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteTreeW(void* hkey, void* lpsubkey);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteValueA(void* hkey, void* lpvaluename);
uint32_t windowssysWindowsWin32SystemRegistryRegDeleteValueW(void* hkey, void* lpvaluename);
uint32_t windowssysWindowsWin32SystemRegistryRegDisablePredefinedCache(void);
uint32_t windowssysWindowsWin32SystemRegistryRegDisablePredefinedCacheEx(void);
uint32_t windowssysWindowsWin32SystemRegistryRegDisableReflectionKey(void* hbase);
uint32_t windowssysWindowsWin32SystemRegistryRegEnableReflectionKey(void* hbase);
uint32_t windowssysWindowsWin32SystemRegistryRegEnumKeyA(void* hkey, uint32_t dwindex, void* lpname, uint32_t cchname);
uint32_t windowssysWindowsWin32SystemRegistryRegEnumKeyExA(void* hkey, uint32_t dwindex, void* lpname, void* lpcchname, void* lpreserved, void* lpclass, void* lpcchclass, void* lpftlastwritetime);
uint32_t windowssysWindowsWin32SystemRegistryRegEnumKeyExW(void* hkey, uint32_t dwindex, void* lpname, void* lpcchname, void* lpreserved, void* lpclass, void* lpcchclass, void* lpftlastwritetime);
uint32_t windowssysWindowsWin32SystemRegistryRegEnumKeyW(void* hkey, uint32_t dwindex, void* lpname, uint32_t cchname);
uint32_t windowssysWindowsWin32SystemRegistryRegEnumValueA(void* hkey, uint32_t dwindex, void* lpvaluename, void* lpcchvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegEnumValueW(void* hkey, uint32_t dwindex, void* lpvaluename, void* lpcchvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegFlushKey(void* hkey);
uint32_t windowssysWindowsWin32SystemRegistryRegGetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor, void* lpcbsecuritydescriptor);
uint32_t windowssysWindowsWin32SystemRegistryRegGetValueA(void* hkey, void* lpsubkey, void* lpvalue, uint32_t dwflags, void* pdwtype, void* pvdata, void* pcbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegGetValueW(void* hkey, void* lpsubkey, void* lpvalue, uint32_t dwflags, void* pdwtype, void* pvdata, void* pcbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegLoadAppKeyA(void* lpfile, void* phkresult, uint32_t samdesired, uint32_t dwoptions, uint32_t reserved);
uint32_t windowssysWindowsWin32SystemRegistryRegLoadAppKeyW(void* lpfile, void* phkresult, uint32_t samdesired, uint32_t dwoptions, uint32_t reserved);
uint32_t windowssysWindowsWin32SystemRegistryRegLoadKeyA(void* hkey, void* lpsubkey, void* lpfile);
uint32_t windowssysWindowsWin32SystemRegistryRegLoadKeyW(void* hkey, void* lpsubkey, void* lpfile);
uint32_t windowssysWindowsWin32SystemRegistryRegLoadMUIStringA(void* hkey, void* pszvalue, void* pszoutbuf, uint32_t cboutbuf, void* pcbdata, uint32_t flags, void* pszdirectory);
uint32_t windowssysWindowsWin32SystemRegistryRegLoadMUIStringW(void* hkey, void* pszvalue, void* pszoutbuf, uint32_t cboutbuf, void* pcbdata, uint32_t flags, void* pszdirectory);
uint32_t windowssysWindowsWin32SystemRegistryRegNotifyChangeKeyValue(void* hkey, int32_t bwatchsubtree, uint32_t dwnotifyfilter, void* hevent, int32_t fasynchronous);
uint32_t windowssysWindowsWin32SystemRegistryRegOpenCurrentUser(uint32_t samdesired, void* phkresult);
uint32_t windowssysWindowsWin32SystemRegistryRegOpenKeyA(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssysWindowsWin32SystemRegistryRegOpenKeyExA(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult);
uint32_t windowssysWindowsWin32SystemRegistryRegOpenKeyExW(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult);
uint32_t windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedA(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult, void* htransaction, void* pextendedparemeter);
uint32_t windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedW(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult, void* htransaction, void* pextendedparemeter);
uint32_t windowssysWindowsWin32SystemRegistryRegOpenKeyW(void* hkey, void* lpsubkey, void* phkresult);
uint32_t windowssysWindowsWin32SystemRegistryRegOpenUserClassesRoot(void* htoken, uint32_t dwoptions, uint32_t samdesired, void* phkresult);
uint32_t windowssysWindowsWin32SystemRegistryRegOverridePredefKey(void* hkey, void* hnewhkey);
uint32_t windowssysWindowsWin32SystemRegistryRegQueryInfoKeyA(void* hkey, void* lpclass, void* lpcchclass, void* lpreserved, void* lpcsubkeys, void* lpcbmaxsubkeylen, void* lpcbmaxclasslen, void* lpcvalues, void* lpcbmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime);
uint32_t windowssysWindowsWin32SystemRegistryRegQueryInfoKeyW(void* hkey, void* lpclass, void* lpcchclass, void* lpreserved, void* lpcsubkeys, void* lpcbmaxsubkeylen, void* lpcbmaxclasslen, void* lpcvalues, void* lpcbmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime);
uint32_t windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesA(void* hkey, void* valList, uint32_t numVals, void* lpvaluebuf, void* ldwtotsize);
uint32_t windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesW(void* hkey, void* valList, uint32_t numVals, void* lpvaluebuf, void* ldwtotsize);
uint32_t windowssysWindowsWin32SystemRegistryRegQueryReflectionKey(void* hbase, void* bisreflectiondisabled);
uint32_t windowssysWindowsWin32SystemRegistryRegQueryValueA(void* hkey, void* lpsubkey, void* lpdata, void* lpcbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegQueryValueExA(void* hkey, void* lpvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegQueryValueExW(void* hkey, void* lpvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegQueryValueW(void* hkey, void* lpsubkey, void* lpdata, void* lpcbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegRenameKey(void* hkey, void* lpsubkeyname, void* lpnewkeyname);
uint32_t windowssysWindowsWin32SystemRegistryRegReplaceKeyA(void* hkey, void* lpsubkey, void* lpnewfile, void* lpoldfile);
uint32_t windowssysWindowsWin32SystemRegistryRegReplaceKeyW(void* hkey, void* lpsubkey, void* lpnewfile, void* lpoldfile);
uint32_t windowssysWindowsWin32SystemRegistryRegRestoreKeyA(void* hkey, void* lpfile, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemRegistryRegRestoreKeyW(void* hkey, void* lpfile, uint32_t dwflags);
uint32_t windowssysWindowsWin32SystemRegistryRegSaveKeyA(void* hkey, void* lpfile, void* lpsecurityattributes);
uint32_t windowssysWindowsWin32SystemRegistryRegSaveKeyExA(void* hkey, void* lpfile, void* lpsecurityattributes, uint32_t flags);
uint32_t windowssysWindowsWin32SystemRegistryRegSaveKeyExW(void* hkey, void* lpfile, void* lpsecurityattributes, uint32_t flags);
uint32_t windowssysWindowsWin32SystemRegistryRegSaveKeyW(void* hkey, void* lpfile, void* lpsecurityattributes);
uint32_t windowssysWindowsWin32SystemRegistryRegSetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor);
uint32_t windowssysWindowsWin32SystemRegistryRegSetKeyValueA(void* hkey, void* lpsubkey, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegSetKeyValueW(void* hkey, void* lpsubkey, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegSetValueA(void* hkey, void* lpsubkey, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegSetValueExA(void* hkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegSetValueExW(void* hkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegSetValueW(void* hkey, void* lpsubkey, uint32_t dwtype, void* lpdata, uint32_t cbdata);
uint32_t windowssysWindowsWin32SystemRegistryRegUnLoadKeyA(void* hkey, void* lpsubkey);
uint32_t windowssysWindowsWin32SystemRegistryRegUnLoadKeyW(void* hkey, void* lpsubkey);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REGISTRY_WINDOWS_WIN32_SYSTEM_REGISTRY_WRAPPER_H */
