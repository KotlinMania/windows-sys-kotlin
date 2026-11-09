#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_clrhosting_CLRCreateInstance(void* clsid, void* riid, void* ppinterface);
int32_t windowssys_windows_win32_system_clrhosting_CallFunctionShim(void* szdllname, void* szfunctionname, void* lpvargument1, void* lpvargument2, void* szversion, void* pvreserved);
int32_t windowssys_windows_win32_system_clrhosting_ClrCreateManagedInstance(void* ptypename, void* riid, void* ppobject);
int32_t windowssys_windows_win32_system_clrhosting_CorBindToCurrentRuntime(void* pwszfilename, void* rclsid, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_clrhosting_CorBindToRuntime(void* pwszversion, void* pwszbuildflavor, void* rclsid, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_clrhosting_CorBindToRuntimeByCfg(void* pcfgstream, uint32_t reserved, uint32_t startupflags, void* rclsid, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_clrhosting_CorBindToRuntimeEx(void* pwszversion, void* pwszbuildflavor, uint32_t startupflags, void* rclsid, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_clrhosting_CorBindToRuntimeHost(void* pwszversion, void* pwszbuildflavor, void* pwszhostconfigfile, void* preserved, uint32_t startupflags, void* rclsid, void* riid, void* ppv);
void windowssys_windows_win32_system_clrhosting_CorExitProcess(int32_t exitcode);
int32_t windowssys_windows_win32_system_clrhosting_CorLaunchApplication(int32_t dwclickoncehost, void* pwzappfullname, uint32_t dwmanifestpaths, void* ppwzmanifestpaths, uint32_t dwactivationdata, void* ppwzactivationdata, void* lpprocessinformation);
void windowssys_windows_win32_system_clrhosting_CorMarkThreadInThreadPool(void);
int32_t windowssys_windows_win32_system_clrhosting_CreateDebuggingInterfaceFromVersion(int32_t idebuggerversion, void* szdebuggeeversion, void* ppcordb);
int32_t windowssys_windows_win32_system_clrhosting_GetCLRIdentityManager(void* riid, void* ppmanager);
int32_t windowssys_windows_win32_system_clrhosting_GetCORRequiredVersion(void* pbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_GetCORSystemDirectory(void* pbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_GetCORVersion(void* pbbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_GetFileVersion(void* szfilename, void* szbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_GetRealProcAddress(void* pwszprocname, void* ppv);
int32_t windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeInfo(void* pexe, void* pwszversion, void* pconfigurationfile, uint32_t startupflags, uint32_t runtimeinfoflags, void* pdirectory, uint32_t dwdirectory, void* dwdirectorylength, void* pversion, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersion(void* pexe, void* pversion, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_GetRequestedRuntimeVersionForCLSID(void* rclsid, void* pversion, uint32_t cchbuffer, void* dwlength, int32_t dwresolutionflags);
int32_t windowssys_windows_win32_system_clrhosting_GetVersionFromProcess(void* hprocess, void* pversion, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_LoadLibraryShim(void* szdllname, void* szversion, void* pvreserved, void* phmoddll);
int32_t windowssys_windows_win32_system_clrhosting_LoadStringRC(uint32_t iresouceid, void* szbuffer, int32_t imax, int32_t bquiet);
int32_t windowssys_windows_win32_system_clrhosting_LoadStringRCEx(uint32_t lcid, uint32_t iresouceid, void* szbuffer, int32_t imax, int32_t bquiet, void* pcwchused);
int32_t windowssys_windows_win32_system_clrhosting_LockClrVersion(void* hostcallback, void* pbeginhostsetup, void* pendhostsetup);
int32_t windowssys_windows_win32_system_clrhosting_RunDll32ShimW(void* hwnd, void* hinst, void* lpszcmdline, int32_t ncmdshow);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WRAPPER_H */
