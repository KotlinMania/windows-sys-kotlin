#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_clrhosting_cLRCreateInstance(void* clsid, void* riid, void* ppinterface);
int32_t windowssys_windows_win32_system_clrhosting_callFunctionShim(void* szdllname, void* szfunctionname, void* lpvargument1, void* lpvargument2, void* szversion, void* pvreserved);
int32_t windowssys_windows_win32_system_clrhosting_clrCreateManagedInstance(void* ptypename, void* riid, void* ppobject);
int32_t windowssys_windows_win32_system_clrhosting_corBindToCurrentRuntime(void* pwszfilename, void* rclsid, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_clrhosting_corBindToRuntime(void* pwszversion, void* pwszbuildflavor, void* rclsid, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_clrhosting_corBindToRuntimeByCfg(void* pcfgstream, uint32_t reserved, uint32_t startupflags, void* rclsid, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_clrhosting_corBindToRuntimeEx(void* pwszversion, void* pwszbuildflavor, uint32_t startupflags, void* rclsid, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_clrhosting_corBindToRuntimeHost(void* pwszversion, void* pwszbuildflavor, void* pwszhostconfigfile, void* preserved, uint32_t startupflags, void* rclsid, void* riid, void* ppv);
void windowssys_windows_win32_system_clrhosting_corExitProcess(int32_t exitcode);
int32_t windowssys_windows_win32_system_clrhosting_corLaunchApplication(int32_t dwclickoncehost, void* pwzappfullname, uint32_t dwmanifestpaths, void* ppwzmanifestpaths, uint32_t dwactivationdata, void* ppwzactivationdata, void* lpprocessinformation);
void windowssys_windows_win32_system_clrhosting_corMarkThreadInThreadPool(void);
int32_t windowssys_windows_win32_system_clrhosting_createDebuggingInterfaceFromVersion(int32_t idebuggerversion, void* szdebuggeeversion, void* ppcordb);
int32_t windowssys_windows_win32_system_clrhosting_getCLRIdentityManager(void* riid, void* ppmanager);
int32_t windowssys_windows_win32_system_clrhosting_getCORRequiredVersion(void* pbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_getCORSystemDirectory(void* pbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_getCORVersion(void* pbbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_getFileVersion(void* szfilename, void* szbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_getRealProcAddress(void* pwszprocname, void* ppv);
int32_t windowssys_windows_win32_system_clrhosting_getRequestedRuntimeInfo(void* pexe, void* pwszversion, void* pconfigurationfile, uint32_t startupflags, uint32_t runtimeinfoflags, void* pdirectory, uint32_t dwdirectory, void* dwdirectorylength, void* pversion, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersion(void* pexe, void* pversion, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_getRequestedRuntimeVersionForCLSID(void* rclsid, void* pversion, uint32_t cchbuffer, void* dwlength, int32_t dwresolutionflags);
int32_t windowssys_windows_win32_system_clrhosting_getVersionFromProcess(void* hprocess, void* pversion, uint32_t cchbuffer, void* dwlength);
int32_t windowssys_windows_win32_system_clrhosting_loadLibraryShim(void* szdllname, void* szversion, void* pvreserved, void* phmoddll);
int32_t windowssys_windows_win32_system_clrhosting_loadStringRC(uint32_t iresouceid, void* szbuffer, int32_t imax, int32_t bquiet);
int32_t windowssys_windows_win32_system_clrhosting_loadStringRCEx(uint32_t lcid, uint32_t iresouceid, void* szbuffer, int32_t imax, int32_t bquiet, void* pcwchused);
int32_t windowssys_windows_win32_system_clrhosting_lockClrVersion(void* hostcallback, void* pbeginhostsetup, void* pendhostsetup);
int32_t windowssys_windows_win32_system_clrhosting_runDll32ShimW(void* hwnd, void* hinst, void* lpszcmdline, int32_t ncmdshow);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WRAPPER_H */
