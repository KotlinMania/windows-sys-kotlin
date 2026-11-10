#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SERVICES_WINDOWS_WIN32_SYSTEM_SERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SERVICES_WINDOWS_WIN32_SYSTEM_SERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_services_changeServiceConfig2A(void* hservice, uint32_t dwinfolevel, void* lpinfo);
int32_t windowssys_windows_win32_system_services_changeServiceConfig2W(void* hservice, uint32_t dwinfolevel, void* lpinfo);
int32_t windowssys_windows_win32_system_services_changeServiceConfigA(void* hservice, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword, void* lpdisplayname);
int32_t windowssys_windows_win32_system_services_changeServiceConfigW(void* hservice, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword, void* lpdisplayname);
int32_t windowssys_windows_win32_system_services_closeServiceHandle(void* hscobject);
int32_t windowssys_windows_win32_system_services_controlService(void* hservice, uint32_t dwcontrol, void* lpservicestatus);
int32_t windowssys_windows_win32_system_services_controlServiceExA(void* hservice, uint32_t dwcontrol, uint32_t dwinfolevel, void* pcontrolparams);
int32_t windowssys_windows_win32_system_services_controlServiceExW(void* hservice, uint32_t dwcontrol, uint32_t dwinfolevel, void* pcontrolparams);
void* windowssys_windows_win32_system_services_createServiceA(void* hscmanager, void* lpservicename, void* lpdisplayname, uint32_t dwdesiredaccess, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword);
void* windowssys_windows_win32_system_services_createServiceW(void* hscmanager, void* lpservicename, void* lpdisplayname, uint32_t dwdesiredaccess, uint32_t dwservicetype, uint32_t dwstarttype, uint32_t dwerrorcontrol, void* lpbinarypathname, void* lploadordergroup, void* lpdwtagid, void* lpdependencies, void* lpservicestartname, void* lppassword);
int32_t windowssys_windows_win32_system_services_deleteService(void* hservice);
int32_t windowssys_windows_win32_system_services_enumDependentServicesA(void* hservice, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned);
int32_t windowssys_windows_win32_system_services_enumDependentServicesW(void* hservice, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned);
int32_t windowssys_windows_win32_system_services_enumServicesStatusA(void* hscmanager, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle);
int32_t windowssys_windows_win32_system_services_enumServicesStatusExA(void* hscmanager, int32_t infolevel, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle, void* pszgroupname);
int32_t windowssys_windows_win32_system_services_enumServicesStatusExW(void* hscmanager, int32_t infolevel, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle, void* pszgroupname);
int32_t windowssys_windows_win32_system_services_enumServicesStatusW(void* hscmanager, uint32_t dwservicetype, uint32_t dwservicestate, void* lpservices, uint32_t cbbufsize, void* pcbbytesneeded, void* lpservicesreturned, void* lpresumehandle);
uint32_t windowssys_windows_win32_system_services_getServiceDirectory(void* hservicestatus, int32_t edirectorytype, void* lppathbuffer, uint32_t cchpathbufferlength, void* lpcchrequiredbufferlength);
int32_t windowssys_windows_win32_system_services_getServiceDisplayNameA(void* hscmanager, void* lpservicename, void* lpdisplayname, void* lpcchbuffer);
int32_t windowssys_windows_win32_system_services_getServiceDisplayNameW(void* hscmanager, void* lpservicename, void* lpdisplayname, void* lpcchbuffer);
int32_t windowssys_windows_win32_system_services_getServiceKeyNameA(void* hscmanager, void* lpdisplayname, void* lpservicename, void* lpcchbuffer);
int32_t windowssys_windows_win32_system_services_getServiceKeyNameW(void* hscmanager, void* lpdisplayname, void* lpservicename, void* lpcchbuffer);
uint32_t windowssys_windows_win32_system_services_getServiceRegistryStateKey(void* servicestatushandle, int32_t statetype, uint32_t accessmask, void* servicestatekey);
uint32_t windowssys_windows_win32_system_services_getSharedServiceDirectory(void* servicehandle, int32_t directorytype, void* pathbuffer, uint32_t pathbufferlength, void* requiredbufferlength);
uint32_t windowssys_windows_win32_system_services_getSharedServiceRegistryStateKey(void* servicehandle, int32_t statetype, uint32_t accessmask, void* servicestatekey);
void* windowssys_windows_win32_system_services_lockServiceDatabase(void* hscmanager);
int32_t windowssys_windows_win32_system_services_notifyBootConfigStatus(int32_t bootacceptable);
uint32_t windowssys_windows_win32_system_services_notifyServiceStatusChangeA(void* hservice, uint32_t dwnotifymask, void* pnotifybuffer);
uint32_t windowssys_windows_win32_system_services_notifyServiceStatusChangeW(void* hservice, uint32_t dwnotifymask, void* pnotifybuffer);
void* windowssys_windows_win32_system_services_openSCManagerA(void* lpmachinename, void* lpdatabasename, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_services_openSCManagerW(void* lpmachinename, void* lpdatabasename, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_services_openServiceA(void* hscmanager, void* lpservicename, uint32_t dwdesiredaccess);
void* windowssys_windows_win32_system_services_openServiceW(void* hscmanager, void* lpservicename, uint32_t dwdesiredaccess);
int32_t windowssys_windows_win32_system_services_queryServiceConfig2A(void* hservice, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_queryServiceConfig2W(void* hservice, uint32_t dwinfolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_queryServiceConfigA(void* hservice, void* lpserviceconfig, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_queryServiceConfigW(void* hservice, void* lpserviceconfig, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_queryServiceDynamicInformation(void* hservicestatus, uint32_t dwinfolevel, void* ppdynamicinfo);
int32_t windowssys_windows_win32_system_services_queryServiceLockStatusA(void* hscmanager, void* lplockstatus, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_queryServiceLockStatusW(void* hscmanager, void* lplockstatus, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_queryServiceObjectSecurity(void* hservice, uint32_t dwsecurityinformation, void* lpsecuritydescriptor, uint32_t cbbufsize, void* pcbbytesneeded);
int32_t windowssys_windows_win32_system_services_queryServiceStatus(void* hservice, void* lpservicestatus);
int32_t windowssys_windows_win32_system_services_queryServiceStatusEx(void* hservice, int32_t infolevel, void* lpbuffer, uint32_t cbbufsize, void* pcbbytesneeded);
void* windowssys_windows_win32_system_services_registerServiceCtrlHandlerA(void* lpservicename, void* lphandlerproc);
void* windowssys_windows_win32_system_services_registerServiceCtrlHandlerExA(void* lpservicename, void* lphandlerproc, void* lpcontext);
void* windowssys_windows_win32_system_services_registerServiceCtrlHandlerExW(void* lpservicename, void* lphandlerproc, void* lpcontext);
void* windowssys_windows_win32_system_services_registerServiceCtrlHandlerW(void* lpservicename, void* lphandlerproc);
int32_t windowssys_windows_win32_system_services_setServiceBits(void* hservicestatus, uint32_t dwservicebits, int32_t bsetbitson, int32_t bupdateimmediately);
int32_t windowssys_windows_win32_system_services_setServiceObjectSecurity(void* hservice, uint32_t dwsecurityinformation, void* lpsecuritydescriptor);
int32_t windowssys_windows_win32_system_services_setServiceStatus(void* hservicestatus, void* lpservicestatus);
int32_t windowssys_windows_win32_system_services_startServiceA(void* hservice, uint32_t dwnumserviceargs, void* lpserviceargvectors);
int32_t windowssys_windows_win32_system_services_startServiceCtrlDispatcherA(void* lpservicestarttable);
int32_t windowssys_windows_win32_system_services_startServiceCtrlDispatcherW(void* lpservicestarttable);
int32_t windowssys_windows_win32_system_services_startServiceW(void* hservice, uint32_t dwnumserviceargs, void* lpserviceargvectors);
uint32_t windowssys_windows_win32_system_services_subscribeServiceChangeNotifications(void* hservice, int32_t eeventtype, void* pcallback, void* pcallbackcontext, void* psubscription);
int32_t windowssys_windows_win32_system_services_unlockServiceDatabase(void* sclock);
void windowssys_windows_win32_system_services_unsubscribeServiceChangeNotifications(int64_t psubscription);
uint32_t windowssys_windows_win32_system_services_waitServiceState(void* hservice, uint32_t dwnotify, uint32_t dwtimeout, void* hcancelevent);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SERVICES_WINDOWS_WIN32_SYSTEM_SERVICES_WRAPPER_H */
