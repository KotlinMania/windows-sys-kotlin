#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PIPES_WINDOWS_WIN32_SYSTEM_PIPES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PIPES_WINDOWS_WIN32_SYSTEM_PIPES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_pipes_CallNamedPipeA(void* lpnamedpipename, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, uint32_t ntimeout);
int32_t windowssys_windows_win32_system_pipes_CallNamedPipeW(void* lpnamedpipename, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, uint32_t ntimeout);
int32_t windowssys_windows_win32_system_pipes_ConnectNamedPipe(void* hnamedpipe, void* lpoverlapped);
void* windowssys_windows_win32_system_pipes_CreateNamedPipeA(void* lpname, uint32_t dwopenmode, uint32_t dwpipemode, uint32_t nmaxinstances, uint32_t noutbuffersize, uint32_t ninbuffersize, uint32_t ndefaulttimeout, void* lpsecurityattributes);
void* windowssys_windows_win32_system_pipes_CreateNamedPipeW(void* lpname, uint32_t dwopenmode, uint32_t dwpipemode, uint32_t nmaxinstances, uint32_t noutbuffersize, uint32_t ninbuffersize, uint32_t ndefaulttimeout, void* lpsecurityattributes);
int32_t windowssys_windows_win32_system_pipes_CreatePipe(void* hreadpipe, void* hwritepipe, void* lppipeattributes, uint32_t nsize);
int32_t windowssys_windows_win32_system_pipes_DisconnectNamedPipe(void* hnamedpipe);
int32_t windowssys_windows_win32_system_pipes_GetNamedPipeClientComputerNameA(void* arg_0_pipe, void* clientcomputername, uint32_t clientcomputernamelength);
int32_t windowssys_windows_win32_system_pipes_GetNamedPipeClientComputerNameW(void* arg_0_pipe, void* clientcomputername, uint32_t clientcomputernamelength);
int32_t windowssys_windows_win32_system_pipes_GetNamedPipeClientProcessId(void* arg_0_pipe, void* clientprocessid);
int32_t windowssys_windows_win32_system_pipes_GetNamedPipeClientSessionId(void* arg_0_pipe, void* clientsessionid);
int32_t windowssys_windows_win32_system_pipes_GetNamedPipeHandleStateA(void* hnamedpipe, void* lpstate, void* lpcurinstances, void* lpmaxcollectioncount, void* lpcollectdatatimeout, void* lpusername, uint32_t nmaxusernamesize);
int32_t windowssys_windows_win32_system_pipes_GetNamedPipeHandleStateW(void* hnamedpipe, void* lpstate, void* lpcurinstances, void* lpmaxcollectioncount, void* lpcollectdatatimeout, void* lpusername, uint32_t nmaxusernamesize);
int32_t windowssys_windows_win32_system_pipes_GetNamedPipeInfo(void* hnamedpipe, void* lpflags, void* lpoutbuffersize, void* lpinbuffersize, void* lpmaxinstances);
int32_t windowssys_windows_win32_system_pipes_GetNamedPipeServerProcessId(void* arg_0_pipe, void* serverprocessid);
int32_t windowssys_windows_win32_system_pipes_GetNamedPipeServerSessionId(void* arg_0_pipe, void* serversessionid);
int32_t windowssys_windows_win32_system_pipes_ImpersonateNamedPipeClient(void* hnamedpipe);
int32_t windowssys_windows_win32_system_pipes_PeekNamedPipe(void* hnamedpipe, void* lpbuffer, uint32_t nbuffersize, void* lpbytesread, void* lptotalbytesavail, void* lpbytesleftthismessage);
int32_t windowssys_windows_win32_system_pipes_SetNamedPipeHandleState(void* hnamedpipe, void* lpmode, void* lpmaxcollectioncount, void* lpcollectdatatimeout);
int32_t windowssys_windows_win32_system_pipes_TransactNamedPipe(void* hnamedpipe, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, void* lpoverlapped);
int32_t windowssys_windows_win32_system_pipes_WaitNamedPipeA(void* lpnamedpipename, uint32_t ntimeout);
int32_t windowssys_windows_win32_system_pipes_WaitNamedPipeW(void* lpnamedpipename, uint32_t ntimeout);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PIPES_WINDOWS_WIN32_SYSTEM_PIPES_WRAPPER_H */
