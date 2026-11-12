#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemGrouppolicyBrowseForGPO(void* lpbrowseinfo);
uint32_t windowssysWindowsWin32SystemGrouppolicyCommandLineFromMsiDescriptor(void* descriptor, void* commandline, void* commandlinelength);
int32_t windowssysWindowsWin32SystemGrouppolicyCreateGPOLink(void* lpgpo, void* lpcontainer, int32_t fhighpriority);
int32_t windowssysWindowsWin32SystemGrouppolicyDeleteAllGPOLinks(void* lpcontainer);
int32_t windowssysWindowsWin32SystemGrouppolicyDeleteGPOLink(void* lpgpo, void* lpcontainer);
void* windowssysWindowsWin32SystemGrouppolicyEnterCriticalPolicySection(int32_t bmachine);
int32_t windowssysWindowsWin32SystemGrouppolicyExportRSoPData(void* lpnamespace, void* lpfilename);
int32_t windowssysWindowsWin32SystemGrouppolicyFreeGPOListA(void* pgpolist);
int32_t windowssysWindowsWin32SystemGrouppolicyFreeGPOListW(void* pgpolist);
uint32_t windowssysWindowsWin32SystemGrouppolicyGenerateGPNotification(int32_t bmachine, void* lpwszmgmtproduct, uint32_t dwmgmtproductoptions);
uint32_t windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListA(uint32_t dwflags, void* pmachinename, void* psiduser, void* pguidextension, void* ppgpolist);
uint32_t windowssysWindowsWin32SystemGrouppolicyGetAppliedGPOListW(uint32_t dwflags, void* pmachinename, void* psiduser, void* pguidextension, void* ppgpolist);
int32_t windowssysWindowsWin32SystemGrouppolicyGetGPOListA(void* htoken, void* lpname, void* lphostname, void* lpcomputername, uint32_t dwflags, void* pgpolist);
int32_t windowssysWindowsWin32SystemGrouppolicyGetGPOListW(void* htoken, void* lpname, void* lphostname, void* lpcomputername, uint32_t dwflags, void* pgpolist);
void windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplicationData(void* productcode, void* displayname, void* supporturl);
uint32_t windowssysWindowsWin32SystemGrouppolicyGetLocalManagedApplications(int32_t buserapps, void* pdwapps, void* prglocalapps);
uint32_t windowssysWindowsWin32SystemGrouppolicyGetManagedApplicationCategories(uint32_t dwreserved, void* pappcategory);
uint32_t windowssysWindowsWin32SystemGrouppolicyGetManagedApplications(void* pcategory, uint32_t dwqueryflags, uint32_t dwinfolevel, void* pdwapps, void* prgmanagedapps);
int32_t windowssysWindowsWin32SystemGrouppolicyImportRSoPData(void* lpnamespace, void* lpfilename);
uint32_t windowssysWindowsWin32SystemGrouppolicyInstallApplication(void* pinstallinfo);
int32_t windowssysWindowsWin32SystemGrouppolicyLeaveCriticalPolicySection(void* hsection);
uint32_t windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompleted(void* extensionid, uint64_t pasynchandle, uint32_t dwstatus);
uint32_t windowssysWindowsWin32SystemGrouppolicyProcessGroupPolicyCompletedEx(void* extensionid, uint64_t pasynchandle, uint32_t dwstatus, int32_t rsopstatus);
int32_t windowssysWindowsWin32SystemGrouppolicyRefreshPolicy(int32_t bmachine);
int32_t windowssysWindowsWin32SystemGrouppolicyRefreshPolicyEx(int32_t bmachine, uint32_t dwoptions);
int32_t windowssysWindowsWin32SystemGrouppolicyRegisterGPNotification(void* hevent, int32_t bmachine);
int32_t windowssysWindowsWin32SystemGrouppolicyRsopAccessCheckByType(void* psecuritydescriptor, void* pprincipalselfsid, void* prsoptoken, uint32_t dwdesiredaccessmask, void* pobjecttypelist, uint32_t objecttypelistlength, void* pgenericmapping, void* pprivilegeset, void* pdwprivilegesetlength, void* pdwgrantedaccessmask, void* pbaccessstatus);
int32_t windowssysWindowsWin32SystemGrouppolicyRsopFileAccessCheck(void* pszfilename, void* prsoptoken, uint32_t dwdesiredaccessmask, void* pdwgrantedaccessmask, void* pbaccessstatus);
int32_t windowssysWindowsWin32SystemGrouppolicyRsopResetPolicySettingStatus(uint32_t dwflags, void* pservices, void* psettinginstance);
int32_t windowssysWindowsWin32SystemGrouppolicyRsopSetPolicySettingStatus(uint32_t dwflags, void* pservices, void* psettinginstance, uint32_t ninfo, void* pstatus);
uint32_t windowssysWindowsWin32SystemGrouppolicyUninstallApplication(void* productcode, uint32_t dwstatus);
int32_t windowssysWindowsWin32SystemGrouppolicyUnregisterGPNotification(void* hevent);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WINDOWS_WIN32_SYSTEM_GROUPPOLICY_WRAPPER_H */
