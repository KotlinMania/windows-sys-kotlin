#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssysWindowsWin32SystemLibraryloaderAddDllDirectory(void* newdirectory);
void* windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceA(void* pfilename, int32_t bdeleteexistingresources);
void* windowssysWindowsWin32SystemLibraryloaderBeginUpdateResourceW(void* pfilename, int32_t bdeleteexistingresources);
int32_t windowssysWindowsWin32SystemLibraryloaderDisableThreadLibraryCalls(void* hlibmodule);
int32_t windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceA(void* hupdate, int32_t fdiscard);
int32_t windowssysWindowsWin32SystemLibraryloaderEndUpdateResourceW(void* hupdate, int32_t fdiscard);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesA(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExA(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesExW(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceLanguagesW(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesA(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExA(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesExW(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceNamesW(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesA(void* hmodule, void* lpenumfunc, int64_t lparam);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExA(void* hmodule, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesExW(void* hmodule, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssysWindowsWin32SystemLibraryloaderEnumResourceTypesW(void* hmodule, void* lpenumfunc, int64_t lparam);
void* windowssysWindowsWin32SystemLibraryloaderFindResourceA(void* hmodule, void* lpname, void* lptype);
void* windowssysWindowsWin32SystemLibraryloaderFindResourceExA(void* hmodule, void* lptype, void* lpname, uint16_t wlanguage);
void* windowssysWindowsWin32SystemLibraryloaderFindResourceExW(void* hmodule, void* lptype, void* lpname, uint16_t wlanguage);
void* windowssysWindowsWin32SystemLibraryloaderFindResourceW(void* hmodule, void* lpname, void* lptype);
void windowssysWindowsWin32SystemLibraryloaderFreeLibraryAndExitThread(void* hlibmodule, uint32_t dwexitcode);
int32_t windowssysWindowsWin32SystemLibraryloaderFreeResource(void* hresdata);
uint32_t windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryA(uint32_t nbufferlength, void* lpbuffer);
uint32_t windowssysWindowsWin32SystemLibraryloaderGetDllDirectoryW(uint32_t nbufferlength, void* lpbuffer);
uint32_t windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameA(void* hmodule, void* lpfilename, uint32_t nsize);
uint32_t windowssysWindowsWin32SystemLibraryloaderGetModuleFileNameW(void* hmodule, void* lpfilename, uint32_t nsize);
void* windowssysWindowsWin32SystemLibraryloaderGetModuleHandleA(void* lpmodulename);
int32_t windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExA(uint32_t dwflags, void* lpmodulename, void* phmodule);
int32_t windowssysWindowsWin32SystemLibraryloaderGetModuleHandleExW(uint32_t dwflags, void* lpmodulename, void* phmodule);
void* windowssysWindowsWin32SystemLibraryloaderGetModuleHandleW(void* lpmodulename);
void* windowssysWindowsWin32SystemLibraryloaderLoadLibraryA(void* lplibfilename);
void* windowssysWindowsWin32SystemLibraryloaderLoadLibraryExA(void* lplibfilename, void* hfile, uint32_t dwflags);
void* windowssysWindowsWin32SystemLibraryloaderLoadLibraryExW(void* lplibfilename, void* hfile, uint32_t dwflags);
void* windowssysWindowsWin32SystemLibraryloaderLoadLibraryW(void* lplibfilename);
uint32_t windowssysWindowsWin32SystemLibraryloaderLoadModule(void* lpmodulename, void* lpparameterblock);
void* windowssysWindowsWin32SystemLibraryloaderLoadPackagedLibrary(void* lpwlibfilename, uint32_t reserved);
void* windowssysWindowsWin32SystemLibraryloaderLoadResource(void* hmodule, void* hresinfo);
void* windowssysWindowsWin32SystemLibraryloaderLockResource(void* hresdata);
int32_t windowssysWindowsWin32SystemLibraryloaderQueryOptionalDelayLoadedAPI(void* hparentmodule, void* lpdllname, void* lpprocname, uint32_t reserved);
int32_t windowssysWindowsWin32SystemLibraryloaderRemoveDllDirectory(void* cookie);
int32_t windowssysWindowsWin32SystemLibraryloaderSetDefaultDllDirectories(uint32_t directoryflags);
int32_t windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryA(void* lppathname);
int32_t windowssysWindowsWin32SystemLibraryloaderSetDllDirectoryW(void* lppathname);
uint32_t windowssysWindowsWin32SystemLibraryloaderSizeofResource(void* hmodule, void* hresinfo);
int32_t windowssysWindowsWin32SystemLibraryloaderUpdateResourceA(void* hupdate, void* lptype, void* lpname, uint16_t wlanguage, void* lpdata, uint32_t cb);
int32_t windowssysWindowsWin32SystemLibraryloaderUpdateResourceW(void* hupdate, void* lptype, void* lpname, uint16_t wlanguage, void* lpdata, uint32_t cb);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WRAPPER_H */
