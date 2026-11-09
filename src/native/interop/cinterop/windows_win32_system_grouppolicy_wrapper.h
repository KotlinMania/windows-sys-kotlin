#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_grouppolicy_BrowseForGPO(void* lpbrowseinfo);
uint32_t windowssys_windows_win32_system_grouppolicy_CommandLineFromMsiDescriptor(void* descriptor, void* commandline, void* commandlinelength);
int32_t windowssys_windows_win32_system_grouppolicy_CreateGPOLink(void* lpgpo, void* lpcontainer, int32_t fhighpriority);
int32_t windowssys_windows_win32_system_grouppolicy_DeleteAllGPOLinks(void* lpcontainer);
int32_t windowssys_windows_win32_system_grouppolicy_DeleteGPOLink(void* lpgpo, void* lpcontainer);
void* windowssys_windows_win32_system_grouppolicy_EnterCriticalPolicySection(int32_t bmachine);
int32_t windowssys_windows_win32_system_grouppolicy_ExportRSoPData(void* lpnamespace, void* lpfilename);
int32_t windowssys_windows_win32_system_grouppolicy_FreeGPOListA(void* pgpolist);
int32_t windowssys_windows_win32_system_grouppolicy_FreeGPOListW(void* pgpolist);
uint32_t windowssys_windows_win32_system_grouppolicy_GenerateGPNotification(int32_t bmachine, void* lpwszmgmtproduct, uint32_t dwmgmtproductoptions);
uint32_t windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListA(uint32_t dwflags, void* pmachinename, void* psiduser, void* pguidextension, void* ppgpolist);
uint32_t windowssys_windows_win32_system_grouppolicy_GetAppliedGPOListW(uint32_t dwflags, void* pmachinename, void* psiduser, void* pguidextension, void* ppgpolist);
int32_t windowssys_windows_win32_system_grouppolicy_GetGPOListA(void* htoken, void* lpname, void* lphostname, void* lpcomputername, uint32_t dwflags, void* pgpolist);
int32_t windowssys_windows_win32_system_grouppolicy_GetGPOListW(void* htoken, void* lpname, void* lphostname, void* lpcomputername, uint32_t dwflags, void* pgpolist);
void windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplicationData(void* productcode, void* displayname, void* supporturl);
uint32_t windowssys_windows_win32_system_grouppolicy_GetLocalManagedApplications(int32_t buserapps, void* pdwapps, void* prglocalapps);
uint32_t windowssys_windows_win32_system_grouppolicy_GetManagedApplicationCategories(uint32_t dwreserved, void* pappcategory);
uint32_t windowssys_windows_win32_system_grouppolicy_GetManagedApplications(void* pcategory, uint32_t dwqueryflags, uint32_t dwinfolevel, void* pdwapps, void* prgmanagedapps);
int32_t windowssys_windows_win32_system_grouppolicy_ImportRSoPData(void* lpnamespace, void* lpfilename);
uint32_t windowssys_windows_win32_system_grouppolicy_InstallApplication(void* pinstallinfo);
int32_t windowssys_windows_win32_system_grouppolicy_LeaveCriticalPolicySection(void* hsection);
uint32_t windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompleted(void* extensionid, uint64_t pasynchandle, uint32_t dwstatus);
uint32_t windowssys_windows_win32_system_grouppolicy_ProcessGroupPolicyCompletedEx(void* extensionid, uint64_t pasynchandle, uint32_t dwstatus, int32_t rsopstatus);
int32_t windowssys_windows_win32_system_grouppolicy_RefreshPolicy(int32_t bmachine);
int32_t windowssys_windows_win32_system_grouppolicy_RefreshPolicyEx(int32_t bmachine, uint32_t dwoptions);
int32_t windowssys_windows_win32_system_grouppolicy_RegisterGPNotification(void* hevent, int32_t bmachine);
int32_t windowssys_windows_win32_system_grouppolicy_RsopAccessCheckByType(void* psecuritydescriptor, void* pprincipalselfsid, void* prsoptoken, uint32_t dwdesiredaccessmask, void* pobjecttypelist, uint32_t objecttypelistlength, void* pgenericmapping, void* pprivilegeset, void* pdwprivilegesetlength, void* pdwgrantedaccessmask, void* pbaccessstatus);
int32_t windowssys_windows_win32_system_grouppolicy_RsopFileAccessCheck(void* pszfilename, void* prsoptoken, uint32_t dwdesiredaccessmask, void* pdwgrantedaccessmask, void* pbaccessstatus);
int32_t windowssys_windows_win32_system_grouppolicy_RsopResetPolicySettingStatus(uint32_t dwflags, void* pservices, void* psettinginstance);
int32_t windowssys_windows_win32_system_grouppolicy_RsopSetPolicySettingStatus(uint32_t dwflags, void* pservices, void* psettinginstance, uint32_t ninfo, void* pstatus);
uint32_t windowssys_windows_win32_system_grouppolicy_UninstallApplication(void* productcode, uint32_t dwstatus);
int32_t windowssys_windows_win32_system_grouppolicy_UnregisterGPNotification(void* hevent);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WRAPPER_H */
