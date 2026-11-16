#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemTpmbaseservicesGetDeviceID(void* pbwindowsaik, uint32_t cbwindowsaik, void* pcbresult, void* pfprotectedbytpm);
int32_t windowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString(void* pszwindowsaik, uint32_t cchwindowsaik, void* pcchresult, void* pfprotectedbytpm);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate(void* pcontextparams, void* phcontext);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(uint32_t keyhandle);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo(uint32_t size, void* info);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth(void* hcontext, uint32_t ownerauthtype, void* poutputbuf, void* poutputbuflen);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog(void* hcontext, void* poutputbuf, void* poutputbuflen);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx(uint32_t logtype, void* pboutput, void* pcboutput);
int32_t windowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent(void);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand(void* hcontext, void* pabinput, uint32_t cbinput, void* paboutput, void* pcboutput);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation(void);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands(void* hcontext);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose(void* hcontext);
uint32_t windowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand(void* hcontext, uint32_t locality, uint32_t priority, void* pabcommand, uint32_t cbcommand, void* pabresult, void* pcbresult);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WRAPPER_H */
