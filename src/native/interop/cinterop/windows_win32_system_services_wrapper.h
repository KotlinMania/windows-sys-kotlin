#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SERVICES_WINDOWS_WIN32_SYSTEM_SERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SERVICES_WINDOWS_WIN32_SYSTEM_SERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_services_ChangeServiceConfig2A(void* hservice, uint32_t dwinfolevel, void* lpinfo);
int32_t windowssys_windows_win32_system_services_ChangeServiceConfig2W(void* hservice, uint32_t dwinfolevel, void* lpinfo);
int32_t windowssys_windows_win32_system_services_ChangeServiceConfigA(void* hservice, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword, void* lpdisplayname);
int32_t windowssys_windows_win32_system_services_ChangeServiceConfigW(void* hservice, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword, void* lpdisplayname);
int32_t windowssys_windows_win32_system_services_CloseServiceHandle(void* hscobject);
int32_t windowssys_windows_win32_system_services_ControlService(void* hservice, uint32_t dwcontrol, void* lpservicestatus);
int32_t windowssys_windows_win32_system_services_ControlServiceExA(void* hservice, uint32_t dwcontrol, uint32_t dwinfolevel, void* pcontrolparams);
int32_t windowssys_windows_win32_system_services_ControlServiceExW(void* hservice, uint32_t dwcontrol, uint32_t dwinfolevel, void* pcontrolparams);
void* windowssys_windows_win32_system_services_CreateServiceA(void* hscmanager, void* lpservicename, void* lpdisplayname, uint32_t dwdesiredaccess, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword);
void* windowssys_windows_win32_system_services_CreateServiceW(void* hscmanager, void* lpservicename, void* lpdisplayname, uint32_t dwdesiredaccess, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword);
int32_t windowssys_windows_win32_system_services_DeleteService(void* hservice);
int32_t windowssys_windows_win32_system_services_EnumDependentServicesA(void* hservice, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned);
int32_t windowssys_windows_win32_system_services_EnumDependentServicesW(void* hservice, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned);
int32_t windowssys_windows_win32_system_services_EnumServicesStatusA(void* hscmanager, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle);
int32_t windowssys_windows_win32_system_services_EnumServicesStatusExA(void* hscmanager, int32_t infolevel, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle, void* pszgroupname);
int32_t windowssys_windows_win32_system_services_EnumServicesStatusExW(void* hscmanager, int32_t infolevel, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle, void* pszgroupname);
int32_t windowssys_windows_win32_system_services_EnumServicesStatusW(void* hscmanager, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle);
uint32_t windowssys_windows_win32_system_services_GetServiceDirectory(void* hservicestatus, int32_t edirectorytype, void* lppathbuffer, uint32_t cchpathbufferlength, void* lpcchrequiredbufferlength);
int32_t windowssys_windows_win32_system_services_GetServiceDisplayNameA(void* hscmanager, void* lpservicename, void* lpdisplayname, void* lpcchbuffer);
int32_t windowssys_windows_win32_system_services_GetServiceDisplayNameW(void* hscmanager, void* lpservicename, void* lpdisplayname, void* lpcchbuffer);
int32_t windowssys_windows_win32_system_services_GetServiceKeyNameA(void* hscmanager, void* lpdisplayname, void* lpservicename, void* lpcchbuffer);
int32_t windowssys_windows_win32_system_services_GetServiceKeyNameW(void* hscmanager, void* lpdisplayname, void* lpservicename, void* lpcchbuffer);
uint32_t windowssys_windows_win32_system_services_GetServiceRegistryStateKey(void* servicestatushandle, int32_t statetype, uint32_t accessmask, void* servicestatekey);
uint32_t windowssys_windows_win32_system_services_GetSharedServiceDirectory(void* servicehandle, int32_t directorytype, void* pathbuffer, uint32_t pathbufferlength, void* requiredbufferlength);
uint32_t windowssys_windows_win32_system_services_GetSharedServiceRegistryStateKey(void* servicehandle, int32_t statetype, uint32_t accessmask, void* servicestatekey);
void* windowssys_windows_win32_system_services_LockServiceDatabase(void* hscmanager);
int32_t windowssys_windows_win32_system_services_NotifyBootConfigStatus(int32_t bootacceptable);
uint32_t windowssys_windows_win32_system_services_NotifyServiceStatusChangeA(void* hservice, uint32_t dwnotifymask, void* pnotifybuffer);
uint32_t windowssys_windows_win32_system_services_NotifyServiceStatusChangeW(void* hservice, uint32_t dwnotifymask, void* pnotifybuffer);
void* windowssys_windows_win32_system_services_OpenSCManagerA(void* lpmachinename, void* lpdatabasename, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_services_OpenSCManagerW(void* lpmachinename, void* lpdatabasename, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_services_OpenServiceA(void* hscmanager, void* lpservicename, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_services_OpenServiceW(void* hscmanager, void* lpservicename, uint32_t dwdesiredaccess);
int32_t windowssys_windows_win32_system_services_QueryServiceConfig2A(void* hservice, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_QueryServiceConfig2W(void* hservice, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_QueryServiceConfigA(void* hservice, void* lpserviceconfig, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_QueryServiceConfigW(void* hservice, void* lpserviceconfig, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_QueryServiceDynamicInformation(void* hservicestatus, uint32_t dwinfolevel, void* ppdynamicinfo);
int32_t windowssys_windows_win32_system_services_QueryServiceLockStatusA(void* hscmanager, void* lplockstatus, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_QueryServiceLockStatusW(void* hscmanager, void* lplockstatus, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_QueryServiceObjectSecurity(void* hservice, uint32_t dwsecurityinformation, void* lpsecuritydescriptor, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_QueryServiceStatus(void* hservice, void* lpservicestatus);
int32_t windowssys_windows_win32_system_services_QueryServiceStatusEx(void* hservice, int32_t infolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
void* windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerA(void* lpservicename, void* lphandlerproc);
void* windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerExA(void* lpservicename, void* lphandlerproc, void* lpcontext);
void* windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerExW(void* lpservicename, void* lphandlerproc, void* lpcontext);
void* windowssys_windows_win32_system_services_RegisterServiceCtrlHandlerW(void* lpservicename, void* lphandlerproc);
int32_t windowssys_windows_win32_system_services_SetServiceBits(void* hservicestatus, uint32_t dwservicebits, int32_t bsetbitson, int32_t bupdateimmediately);
int32_t windowssys_windows_win32_system_services_SetServiceObjectSecurity(void* hservice, uint32_t dwsecurityinformation, void* lpsecuritydescriptor);
int32_t windowssys_windows_win32_system_services_SetServiceStatus(void* hservicestatus, void* lpservicestatus);
int32_t windowssys_windows_win32_system_services_StartServiceA(void* hservice, uint32_t dwnumserviceargs, void* lpserviceargvectors);
int32_t windowssys_windows_win32_system_services_StartServiceCtrlDispatcherA(void* lpservicestarttable);
int32_t windowssys_windows_win32_system_services_StartServiceCtrlDispatcherW(void* lpservicestarttable);
int32_t windowssys_windows_win32_system_services_StartServiceW(void* hservice, uint32_t dwnumserviceargs, void* lpserviceargvectors);
uint32_t windowssys_windows_win32_system_services_SubscribeServiceChangeNotifications(void* hservice, int32_t eeventtype, void* pcallback, void* pcallbackcontext, void* psubscription);
int32_t windowssys_windows_win32_system_services_UnlockServiceDatabase(void* sclock);
void windowssys_windows_win32_system_services_UnsubscribeServiceChangeNotifications(int64_t psubscription);
uint32_t windowssys_windows_win32_system_services_WaitServiceState(void* hservice, uint32_t dwnotify, uint32_t dwtimeout, void* hcancelevent);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SERVICES_WINDOWS_WIN32_SYSTEM_SERVICES_WRAPPER_H */
