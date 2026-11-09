#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_remotedesktop_ProcessIdToSessionId(uint32_t dwprocessid, void* psessionid);
void windowssys_windows_win32_system_remotedesktop_WTSCloseServer(void* hserver);
int32_t windowssys_windows_win32_system_remotedesktop_WTSConnectSessionA(uint32_t logonid, uint32_t targetlogonid, void* ppassword, int32_t bwait);
int32_t windowssys_windows_win32_system_remotedesktop_WTSConnectSessionW(uint32_t logonid, uint32_t targetlogonid, void* ppassword, int32_t bwait);
int32_t windowssys_windows_win32_system_remotedesktop_WTSCreateListenerA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer, uint32_t flag);
int32_t windowssys_windows_win32_system_remotedesktop_WTSCreateListenerW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer, uint32_t flag);
int32_t windowssys_windows_win32_system_remotedesktop_WTSDisconnectSession(void* hserver, uint32_t sessionid, int32_t bwait);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnableChildSessions(int32_t benable);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateListenersA(void* hserver, void* preserved, uint32_t reserved, void* plisteners, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateListenersW(void* hserver, void* preserved, uint32_t reserved, void* plisteners, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesA(void* hserver, uint32_t reserved, uint32_t version, void* ppprocessinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesExA(void* hserver, void* plevel, uint32_t sessionid, void* ppprocessinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesExW(void* hserver, void* plevel, uint32_t sessionid, void* ppprocessinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesW(void* hserver, uint32_t reserved, uint32_t version, void* ppprocessinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateServersA(void* pdomainname, uint32_t reserved, uint32_t version, void* ppserverinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateServersW(void* pdomainname, uint32_t reserved, uint32_t version, void* ppserverinfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsA(void* hserver, uint32_t reserved, uint32_t version, void* ppsessioninfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsExA(void* hserver, void* plevel, uint32_t filter, void* ppsessioninfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsExW(void* hserver, void* plevel, uint32_t filter, void* ppsessioninfo, void* pcount);
int32_t windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsW(void* hserver, uint32_t reserved, uint32_t version, void* ppsessioninfo, void* pcount);
void windowssys_windows_win32_system_remotedesktop_WTSFreeMemory(void* pmemory);
int32_t windowssys_windows_win32_system_remotedesktop_WTSFreeMemoryExA(int32_t wtstypeclass, void* pmemory, uint32_t numberofentries);
int32_t windowssys_windows_win32_system_remotedesktop_WTSFreeMemoryExW(int32_t wtstypeclass, void* pmemory, uint32_t numberofentries);
uint32_t windowssys_windows_win32_system_remotedesktop_WTSGetActiveConsoleSessionId(void);
int32_t windowssys_windows_win32_system_remotedesktop_WTSGetChildSessionId(void* psessionid);
int32_t windowssys_windows_win32_system_remotedesktop_WTSGetListenerSecurityA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_system_remotedesktop_WTSGetListenerSecurityW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_system_remotedesktop_WTSIsChildSessionsEnabled(void* pbenabled);
int32_t windowssys_windows_win32_system_remotedesktop_WTSLogoffSession(void* hserver, uint32_t sessionid, int32_t bwait);
void* windowssys_windows_win32_system_remotedesktop_WTSOpenServerA(void* pservername);
void* windowssys_windows_win32_system_remotedesktop_WTSOpenServerExA(void* pservername);
void* windowssys_windows_win32_system_remotedesktop_WTSOpenServerExW(void* pservername);
void* windowssys_windows_win32_system_remotedesktop_WTSOpenServerW(void* pservername);
int32_t windowssys_windows_win32_system_remotedesktop_WTSQueryListenerConfigA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer);
int32_t windowssys_windows_win32_system_remotedesktop_WTSQueryListenerConfigW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer);
int32_t windowssys_windows_win32_system_remotedesktop_WTSQuerySessionInformationA(void* hserver, uint32_t sessionid, int32_t wtsinfoclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssys_windows_win32_system_remotedesktop_WTSQuerySessionInformationW(void* hserver, uint32_t sessionid, int32_t wtsinfoclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssys_windows_win32_system_remotedesktop_WTSQueryUserConfigA(void* pservername, void* pusername, int32_t wtsconfigclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssys_windows_win32_system_remotedesktop_WTSQueryUserConfigW(void* pservername, void* pusername, int32_t wtsconfigclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssys_windows_win32_system_remotedesktop_WTSQueryUserToken(uint32_t sessionid, void* phtoken);
int32_t windowssys_windows_win32_system_remotedesktop_WTSRegisterSessionNotification(void* hwnd, uint32_t dwflags);
int32_t windowssys_windows_win32_system_remotedesktop_WTSRegisterSessionNotificationEx(void* hserver, void* hwnd, uint32_t dwflags);
int32_t windowssys_windows_win32_system_remotedesktop_WTSSendMessageA(void* hserver, uint32_t sessionid, void* ptitle, uint32_t titlelength, void* pmessage, uint32_t messagelength, uint32_t style, uint32_t timeout, void* presponse, int32_t bwait);
int32_t windowssys_windows_win32_system_remotedesktop_WTSSendMessageW(void* hserver, uint32_t sessionid, void* ptitle, uint32_t titlelength, void* pmessage, uint32_t messagelength, uint32_t style, uint32_t timeout, void* presponse, int32_t bwait);
int32_t windowssys_windows_win32_system_remotedesktop_WTSSetListenerSecurityA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssys_windows_win32_system_remotedesktop_WTSSetListenerSecurityW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssys_windows_win32_system_remotedesktop_WTSSetRenderHint(void* prenderhintid, void* hwndowner, uint32_t renderhinttype, uint32_t cbhintdatalength, void* phintdata);
int32_t windowssys_windows_win32_system_remotedesktop_WTSSetUserConfigA(void* pservername, void* pusername, int32_t wtsconfigclass, void* pbuffer, uint32_t datalength);
int32_t windowssys_windows_win32_system_remotedesktop_WTSSetUserConfigW(void* pservername, void* pusername, int32_t wtsconfigclass, void* pbuffer, uint32_t datalength);
int32_t windowssys_windows_win32_system_remotedesktop_WTSShutdownSystem(void* hserver, uint32_t shutdownflag);
int32_t windowssys_windows_win32_system_remotedesktop_WTSStartRemoteControlSessionA(void* ptargetservername, uint32_t targetlogonid, uint8_t hotkeyvk, uint16_t hotkeymodifiers);
int32_t windowssys_windows_win32_system_remotedesktop_WTSStartRemoteControlSessionW(void* ptargetservername, uint32_t targetlogonid, uint8_t hotkeyvk, uint16_t hotkeymodifiers);
int32_t windowssys_windows_win32_system_remotedesktop_WTSStopRemoteControlSession(uint32_t logonid);
int32_t windowssys_windows_win32_system_remotedesktop_WTSTerminateProcess(void* hserver, uint32_t processid, uint32_t exitcode);
int32_t windowssys_windows_win32_system_remotedesktop_WTSUnRegisterSessionNotification(void* hwnd);
int32_t windowssys_windows_win32_system_remotedesktop_WTSUnRegisterSessionNotificationEx(void* hserver, void* hwnd);
int32_t windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelClose(void* hchannelhandle);
void* windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelOpen(void* hserver, uint32_t sessionid, void* pvirtualname);
void* windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelOpenEx(uint32_t sessionid, void* pvirtualname, uint32_t flags);
int32_t windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelPurgeInput(void* hchannelhandle);
int32_t windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelPurgeOutput(void* hchannelhandle);
int32_t windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelQuery(void* hchannelhandle, int32_t param1, void* ppbuffer, void* pbytesreturned);
int32_t windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelRead(void* hchannelhandle, uint32_t timeout, void* buffer, uint32_t buffersize, void* pbytesread);
int32_t windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelWrite(void* hchannelhandle, void* buffer, uint32_t length, void* pbyteswritten);
int32_t windowssys_windows_win32_system_remotedesktop_WTSWaitSystemEvent(void* hserver, uint32_t eventmask, void* peventflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WRAPPER_H */
