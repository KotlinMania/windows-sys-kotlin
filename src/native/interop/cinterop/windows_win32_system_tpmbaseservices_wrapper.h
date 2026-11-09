#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_tpmbaseservices_GetDeviceID(void* pbwindowsaik, uint32_t cbwindowsaik, void* pcbresult, void* pfprotectedbytpm);
int32_t windowssys_windows_win32_system_tpmbaseservices_GetDeviceIDString(void* pszwindowsaik, uint32_t cchwindowsaik, void* pcchresult, void* pfprotectedbytpm);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsi_Context_Create(void* pcontextparams, void* phcontext);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsi_Create_Windows_Key(uint32_t keyhandle);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsi_GetDeviceInfo(uint32_t size, void* info);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_OwnerAuth(void* hcontext, uint32_t ownerauthtype, void* poutputbuf, void* poutputbuflen);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_TCG_Log(void* hcontext, void* poutputbuf, void* poutputbuflen);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsi_Get_TCG_Log_Ex(uint32_t logtype, void* pboutput, void* pcboutput);
int32_t windowssys_windows_win32_system_tpmbaseservices_Tbsi_Is_Tpm_Present(void);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsi_Physical_Presence_Command(void* hcontext, void* pabinput, uint32_t cbinput, void* paboutput, void* pcboutput);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsi_Revoke_Attestation(void);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsip_Cancel_Commands(void* hcontext);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsip_Context_Close(void* hcontext);
uint32_t windowssys_windows_win32_system_tpmbaseservices_Tbsip_Submit_Command(void* hcontext, uint32_t locality, uint32_t priority, void* pabcommand, uint32_t cbcommand, void* pabresult, void* pcbresult);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WINDOWS_WIN32_SYSTEM_TPMBASESERVICES_WRAPPER_H */
