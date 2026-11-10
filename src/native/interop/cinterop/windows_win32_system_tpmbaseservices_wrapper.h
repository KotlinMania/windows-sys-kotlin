#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_tpmbaseservices_getDeviceID(void* pbwindowsaik, uint32_t cbwindowsaik, void* pcbresult, void* pfprotectedbytpm);
int32_t windowssys_windows_win32_system_tpmbaseservices_getDeviceIDString(void* pszwindowsaik, uint32_t cchwindowsaik, void* pcchresult, void* pfprotectedbytpm);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiContextCreate(void* pcontextparams, void* phcontext);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiCreateWindowsKey(uint32_t keyhandle);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiGetDeviceInfo(uint32_t size, void* info);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiGetOwnerAuth(void* hcontext, uint32_t ownerauthtype, void* poutputbuf, void* poutputbuflen);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLog(void* hcontext, void* poutputbuf, void* poutputbuflen);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiGetTcgLogEx(uint32_t logtype, void* pboutput, void* pcboutput);
int32_t windowssys_windows_win32_system_tpmbaseservices_tbsiIsTpmPresent(void);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiPhysicalPresenceCommand(void* hcontext, void* pabinput, uint32_t cbinput, void* paboutput, void* pcboutput);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsiRevokeAttestation(void);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsipCancelCommands(void* hcontext);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsipContextClose(void* hcontext);
uint32_t windowssys_windows_win32_system_tpmbaseservices_tbsipSubmitCommand(void* hcontext, uint32_t locality, uint32_t priority, void* pabcommand, uint32_t cbcommand, void* pabresult, void* pcbresult);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WRAPPER_H */
