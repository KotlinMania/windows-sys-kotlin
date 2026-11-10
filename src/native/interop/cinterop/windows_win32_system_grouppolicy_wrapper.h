#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_grouppolicy_browseForGPO(void* lpbrowseinfo);
uint32_t windowssys_windows_win32_system_grouppolicy_commandLineFromMsiDescriptor(void* descriptor, void* commandline, void* commandlinelength);
int32_t windowssys_windows_win32_system_grouppolicy_createGPOLink(void* lpgpo, void* lpcontainer, int32_t fhighpriority);
int32_t windowssys_windows_win32_system_grouppolicy_deleteAllGPOLinks(void* lpcontainer);
int32_t windowssys_windows_win32_system_grouppolicy_deleteGPOLink(void* lpgpo, void* lpcontainer);
void* windowssys_windows_win32_system_grouppolicy_enterCriticalPolicySection(int32_t bmachine);
int32_t windowssys_windows_win32_system_grouppolicy_exportRSoPData(void* lpnamespace, void* lpfilename);
int32_t windowssys_windows_win32_system_grouppolicy_freeGPOListA(void* pgpolist);
int32_t windowssys_windows_win32_system_grouppolicy_freeGPOListW(void* pgpolist);
uint32_t windowssys_windows_win32_system_grouppolicy_generateGPNotification(int32_t bmachine, void* lpwszmgmtproduct, uint32_t dwmgmtproductoptions);
uint32_t windowssys_windows_win32_system_grouppolicy_getAppliedGPOListA(uint32_t dwflags, void* pmachinename, void* psiduser, void* pguidextension, void* ppgpolist);
uint32_t windowssys_windows_win32_system_grouppolicy_getAppliedGPOListW(uint32_t dwflags, void* pmachinename, void* psiduser, void* pguidextension, void* ppgpolist);
int32_t windowssys_windows_win32_system_grouppolicy_getGPOListA(void* htoken, void* lpname, void* lphostname, void* lpcomputername, uint32_t dwflags, void* pgpolist);
int32_t windowssys_windows_win32_system_grouppolicy_getGPOListW(void* htoken, void* lpname, void* lphostname, void* lpcomputername, uint32_t dwflags, void* pgpolist);
void windowssys_windows_win32_system_grouppolicy_getLocalManagedApplicationData(void* productcode, void* displayname, void* supporturl);
uint32_t windowssys_windows_win32_system_grouppolicy_getLocalManagedApplications(int32_t buserapps, void* pdwapps, void* prglocalapps);
uint32_t windowssys_windows_win32_system_grouppolicy_getManagedApplicationCategories(uint32_t dwreserved, void* pappcategory);
uint32_t windowssys_windows_win32_system_grouppolicy_getManagedApplications(void* pcategory, uint32_t dwqueryflags, uint32_t dwinfolevel, void* pdwapps, void* prgmanagedapps);
int32_t windowssys_windows_win32_system_grouppolicy_importRSoPData(void* lpnamespace, void* lpfilename);
uint32_t windowssys_windows_win32_system_grouppolicy_installApplication(void* pinstallinfo);
int32_t windowssys_windows_win32_system_grouppolicy_leaveCriticalPolicySection(void* hsection);
uint32_t windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompleted(void* extensionid, uint64_t pasynchandle, uint32_t dwstatus);
uint32_t windowssys_windows_win32_system_grouppolicy_processGroupPolicyCompletedEx(void* extensionid, uint64_t pasynchandle, uint32_t dwstatus, int32_t rsopstatus);
int32_t windowssys_windows_win32_system_grouppolicy_refreshPolicy(int32_t bmachine);
int32_t windowssys_windows_win32_system_grouppolicy_refreshPolicyEx(int32_t bmachine, uint32_t dwoptions);
int32_t windowssys_windows_win32_system_grouppolicy_registerGPNotification(void* hevent, int32_t bmachine);
int32_t windowssys_windows_win32_system_grouppolicy_rsopAccessCheckByType(void* psecuritydescriptor, void* pprincipalselfsid, void* prsoptoken, uint32_t dwdesiredaccessmask, void* pobjecttypelist, uint32_t objecttypelistlength, void* pgenericmapping, void* pprivilegeset, void* pdwprivilegesetlength, void* pdwgrantedaccessmask, void* pbaccessstatus);
int32_t windowssys_windows_win32_system_grouppolicy_rsopFileAccessCheck(void* pszfilename, void* prsoptoken, uint32_t dwdesiredaccessmask, void* pdwgrantedaccessmask, void* pbaccessstatus);
int32_t windowssys_windows_win32_system_grouppolicy_rsopResetPolicySettingStatus(uint32_t dwflags, void* pservices, void* psettinginstance);
int32_t windowssys_windows_win32_system_grouppolicy_rsopSetPolicySettingStatus(uint32_t dwflags, void* pservices, void* psettinginstance, uint32_t ninfo, void* pstatus);
uint32_t windowssys_windows_win32_system_grouppolicy_uninstallApplication(void* productcode, uint32_t dwstatus);
int32_t windowssys_windows_win32_system_grouppolicy_unregisterGPNotification(void* hevent);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WRAPPER_H */
