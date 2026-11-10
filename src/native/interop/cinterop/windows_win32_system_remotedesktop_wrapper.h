#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_remotedesktop_processIdToSessionId(uint32_t dwprocessid, void* psessionid);
void windowssys_windows_win32_system_remotedesktop_wTSCloseServer(void* hserver);
int32_t windowssys_windows_win32_system_remotedesktop_wTSConnectSessionA(uint32_t logonid, uint32_t targetlogonid, void* ppassword, int32_t bwait);
int32_t windowssys_windows_win32_system_remotedesktop_wTSConnectSessionW(uint32_t logonid, uint32_t targetlogonid, void* ppassword, int32_t bwait);
int32_t windowssys_windows_win32_system_remotedesktop_wTSCreateListenerA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer, uint32_t flag);
int32_t windowssys_windows_win32_system_remotedesktop_wTSCreateListenerW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer, uint32_t flag);
int32_t windowssys_windows_win32_system_remotedesktop_wTSDisconnectSession(void* hserver, uint32_t sessionid, int32_t bwait);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnableChildSessions(int32_t benable);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersA(void* hserver, void* preserved, uint32_t reserved, void* plisteners, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersW(void* hserver, void* preserved, uint32_t reserved, void* plisteners, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesA(void* hserver, uint32_t reserved, uint32_t version, void* ppprocessinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExA(void* hserver, void* plevel, uint32_t sessionid, void* ppprocessinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExW(void* hserver, void* plevel, uint32_t sessionid, void* ppprocessinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesW(void* hserver, uint32_t reserved, uint32_t version, void* ppprocessinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersA(void* pdomainname, uint32_t reserved, uint32_t version, void* ppserverinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersW(void* pdomainname, uint32_t reserved, uint32_t version, void* ppserverinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsA(void* hserver, uint32_t reserved, uint32_t version, void* ppsessioninfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExA(void* hserver, void* plevel, uint32_t filter, void* ppsessioninfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExW(void* hserver, void* plevel, uint32_t filter, void* ppsessioninfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsW(void* hserver, uint32_t reserved, uint32_t version, void* ppsessioninfo, void* pcount);
void windowssys_windows_win32_system_remotedesktop_wTSFreeMemory(void* pmemory);
int32_t windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExA(int32_t wtstypeclass, void* pmemory, uint32_t numberofentries);
int32_t windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExW(int32_t wtstypeclass, void* pmemory, uint32_t numberofentries);
uint32_t windowssys_windows_win32_system_remotedesktop_wTSGetActiveConsoleSessionId(void);
int32_t windowssys_windows_win32_system_remotedesktop_wTSGetChildSessionId(void* psessionid);
int32_t windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_system_remotedesktop_wTSIsChildSessionsEnabled(void* pbenabled);
int32_t windowssys_windows_win32_system_remotedesktop_wTSLogoffSession(void* hserver, uint32_t sessionid, int32_t bwait);
void* windowssys_windows_win32_system_remotedesktop_wTSOpenServerA(void* pservername);
void* windowssys_windows_win32_system_remotedesktop_wTSOpenServerExA(void* pservername);
void* windowssys_windows_win32_system_remotedesktop_wTSOpenServerExW(void* pservername);
void* windowssys_windows_win32_system_remotedesktop_wTSOpenServerW(void* pservername);
int32_t windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer);
int32_t windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer);
int32_t windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationA(void* hserver, uint32_t sessionid, int32_t wtsinfoclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationW(void* hserver, uint32_t sessionid, int32_t wtsinfoclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigA(void* pservername, void* pusername, int32_t wtsconfigclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigW(void* pservername, void* pusername, int32_t wtsconfigclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssys_windows_win32_system_remotedesktop_wTSQueryUserToken(uint32_t sessionid, void* phtoken);
int32_t windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotification(void* hwnd, uint32_t dwflags);
int32_t windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotificationEx(void* hserver, void* hwnd, uint32_t dwflags);
int32_t windowssys_windows_win32_system_remotedesktop_wTSSendMessageA(void* hserver, uint32_t sessionid, void* ptitle, uint32_t titlelength, void* pmessage, uint32_t messagelength, uint32_t style, uint32_t timeout, void* presponse, int32_t bwait);
int32_t windowssys_windows_win32_system_remotedesktop_wTSSendMessageW(void* hserver, uint32_t sessionid, void* ptitle, uint32_t titlelength, void* pmessage, uint32_t messagelength, uint32_t style, uint32_t timeout, void* presponse, int32_t bwait);
int32_t windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssys_windows_win32_system_remotedesktop_wTSSetRenderHint(void* prenderhintid, void* hwndowner, uint32_t renderhinttype, uint32_t cbhintdatalength, void* phintdata);
int32_t windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigA(void* pservername, void* pusername, int32_t wtsconfigclass, void* pbuffer, uint32_t datalength);
int32_t windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigW(void* pservername, void* pusername, int32_t wtsconfigclass, void* pbuffer, uint32_t datalength);
int32_t windowssys_windows_win32_system_remotedesktop_wTSShutdownSystem(void* hserver, uint32_t shutdownflag);
int32_t windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionA(void* ptargetservername, uint32_t targetlogonid, uint8_t hotkeyvk, uint16_t hotkeymodifiers);
int32_t windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionW(void* ptargetservername, uint32_t targetlogonid, uint8_t hotkeyvk, uint16_t hotkeymodifiers);
int32_t windowssys_windows_win32_system_remotedesktop_wTSStopRemoteControlSession(uint32_t logonid);
int32_t windowssys_windows_win32_system_remotedesktop_wTSTerminateProcess(void* hserver, uint32_t processid, uint32_t exitcode);
int32_t windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotification(void* hwnd);
int32_t windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotificationEx(void* hserver, void* hwnd);
int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelClose(void* hchannelhandle);
void* windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpen(void* hserver, uint32_t sessionid, void* pvirtualname);
void* windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpenEx(uint32_t sessionid, void* pvirtualname, uint32_t flags);
int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeInput(void* hchannelhandle);
int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeOutput(void* hchannelhandle);
int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelQuery(void* hchannelhandle, int32_t param1, void* ppbuffer, void* pbytesreturned);
int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelRead(void* hchannelhandle, uint32_t timeout, void* buffer, uint32_t buffersize, void* pbytesread);
int32_t windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelWrite(void* hchannelhandle, void* buffer, uint32_t length, void* pbyteswritten);
int32_t windowssys_windows_win32_system_remotedesktop_wTSWaitSystemEvent(void* hserver, uint32_t eventmask, void* peventflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WRAPPER_H */
