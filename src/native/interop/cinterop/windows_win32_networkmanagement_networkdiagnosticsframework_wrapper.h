#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETWORKDIAGNOSTICSFRAMEWORK_WINDOWS_WIN32_NETWORKMANAGEMENT_NETWORKDIAGNOSTICSFRAMEWORK_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETWORKDIAGNOSTICSFRAMEWORK_WINDOWS_WIN32_NETWORKMANAGEMENT_NETWORKDIAGNOSTICSFRAMEWORK_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident(void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident(void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident(void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident(void* hostname, uint16_t querytype, void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident(void* cloudname, void* groupname, void* identity, void* invitation, void* addresses, void* appid, void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident(void* helperclassname, uint32_t celt, void* attributes, void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident(void* cloudname, void* peername, int32_t diagnosepublish, void* appid, void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident(void* uncpath, void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident(void* url, void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx(void* url, int32_t usewinhttp, void* modulename, void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident(uint64_t sock, void* host, uint16_t port, void* appid, void* userid, void* handle);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident(void* handle, void* rootcausecount, void* rootcauses, uint32_t dwwait, uint32_t dwflags);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis(void* handle, void* hwnd);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile(void* handle, void* tracefilelocation);
int32_t windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident(void* handle, void* repairex, uint32_t dwwait);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETWORKDIAGNOSTICSFRAMEWORK_WINDOWS_WIN32_NETWORKMANAGEMENT_NETWORKDIAGNOSTICSFRAMEWORK_WRAPPER_H */
