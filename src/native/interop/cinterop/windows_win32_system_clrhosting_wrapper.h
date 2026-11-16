#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemClrhostingCLRCreateInstance(void* clsid, void* riid, void* ppinterface);
int32_t windowssysWindowsWin32SystemClrhostingCallFunctionShim(void* szdllname, void* szfunctionname, void* lpvargument1, void* lpvargument2, void* szversion, void* pvreserved);
int32_t windowssysWindowsWin32SystemClrhostingClrCreateManagedInstance(void* ptypename, void* riid, void* ppobject);
int32_t windowssysWindowsWin32SystemClrhostingCorBindToCurrentRuntime(void* pwszfilename, void* rclsid, void* riid, void* ppv);
int32_t windowssysWindowsWin32SystemClrhostingCorBindToRuntime(void* pwszversion, void* pwszbuildflavor, void* rclsid, void* riid, void* ppv);
int32_t windowssysWindowsWin32SystemClrhostingCorBindToRuntimeByCfg(void* pcfgstream, uint32_t reserved, uint32_t startupflags, void* rclsid, void* riid, void* ppv);
int32_t windowssysWindowsWin32SystemClrhostingCorBindToRuntimeEx(void* pwszversion, void* pwszbuildflavor, uint32_t startupflags, void* rclsid, void* riid, void* ppv);
int32_t windowssysWindowsWin32SystemClrhostingCorBindToRuntimeHost(void* pwszversion, void* pwszbuildflavor, void* pwszhostconfigfile, void* preserved, uint32_t startupflags, void* rclsid, void* riid, void* ppv);
void windowssysWindowsWin32SystemClrhostingCorExitProcess(int32_t exitcode);
int32_t windowssysWindowsWin32SystemClrhostingCorLaunchApplication(int32_t dwclickoncehost, void* pwzappfullname, uint32_t dwmanifestpaths, void* ppwzmanifestpaths, uint32_t dwactivationdata, void* ppwzactivationdata, void* lpprocessinformation);
void windowssysWindowsWin32SystemClrhostingCorMarkThreadInThreadPool(void);
int32_t windowssysWindowsWin32SystemClrhostingCreateDebuggingInterfaceFromVersion(int32_t idebuggerversion, void* szdebuggeeversion, void* ppcordb);
int32_t windowssysWindowsWin32SystemClrhostingGetCLRIdentityManager(void* riid, void* ppmanager);
int32_t windowssysWindowsWin32SystemClrhostingGetCORRequiredVersion(void* pbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssysWindowsWin32SystemClrhostingGetCORSystemDirectory(void* pbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssysWindowsWin32SystemClrhostingGetCORVersion(void* pbbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssysWindowsWin32SystemClrhostingGetFileVersion(void* szfilename, void* szbuffer, uint32_t cchbuffer, void* dwlength);
int32_t windowssysWindowsWin32SystemClrhostingGetRealProcAddress(void* pwszprocname, void* ppv);
int32_t windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeInfo(void* pexe, void* pwszversion, void* pconfigurationfile, uint32_t startupflags, uint32_t runtimeinfoflags, void* pdirectory, uint32_t dwdirectory, void* dwdirectorylength, void* pversion, uint32_t cchbuffer, void* dwlength);
int32_t windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersion(void* pexe, void* pversion, uint32_t cchbuffer, void* dwlength);
int32_t windowssysWindowsWin32SystemClrhostingGetRequestedRuntimeVersionForCLSID(void* rclsid, void* pversion, uint32_t cchbuffer, void* dwlength, int32_t dwresolutionflags);
int32_t windowssysWindowsWin32SystemClrhostingGetVersionFromProcess(void* hprocess, void* pversion, uint32_t cchbuffer, void* dwlength);
int32_t windowssysWindowsWin32SystemClrhostingLoadLibraryShim(void* szdllname, void* szversion, void* pvreserved, void* phmoddll);
int32_t windowssysWindowsWin32SystemClrhostingLoadStringRC(uint32_t iresouceid, void* szbuffer, int32_t imax, int32_t bquiet);
int32_t windowssysWindowsWin32SystemClrhostingLoadStringRCEx(uint32_t lcid, uint32_t iresouceid, void* szbuffer, int32_t imax, int32_t bquiet, void* pcwchused);
int32_t windowssysWindowsWin32SystemClrhostingLockClrVersion(void* hostcallback, void* pbeginhostsetup, void* pendhostsetup);
int32_t windowssysWindowsWin32SystemClrhostingRunDll32ShimW(void* hwnd, void* hinst, void* lpszcmdline, int32_t ncmdshow);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WINDOWS_WIN32_SYSTEM_CLRHOSTING_WRAPPER_H */
