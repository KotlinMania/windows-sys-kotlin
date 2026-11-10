#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_system_libraryloader_addDllDirectory(void* newdirectory);
void* windowssys_windows_win32_system_libraryloader_beginUpdateResourceA(void* pfilename, int32_t bdeleteexistingresources);
void* windowssys_windows_win32_system_libraryloader_beginUpdateResourceW(void* pfilename, int32_t bdeleteexistingresources);
int32_t windowssys_windows_win32_system_libraryloader_disableThreadLibraryCalls(void* hlibmodule);
int32_t windowssys_windows_win32_system_libraryloader_endUpdateResourceA(void* hupdate, int32_t fdiscard);
int32_t windowssys_windows_win32_system_libraryloader_endUpdateResourceW(void* hupdate, int32_t fdiscard);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceLanguagesA(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExA(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceLanguagesExW(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceLanguagesW(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceNamesA(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceNamesExA(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceNamesExW(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceNamesW(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceTypesA(void* hmodule, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceTypesExA(void* hmodule, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceTypesExW(void* hmodule, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_enumResourceTypesW(void* hmodule, void* lpenumfunc, int64_t lparam);
void* windowssys_windows_win32_system_libraryloader_findResourceA(void* hmodule, void* lpname, void* lptype);
void* windowssys_windows_win32_system_libraryloader_findResourceExA(void* hmodule, void* lptype, void* lpname, uint16_t wlanguage);
void* windowssys_windows_win32_system_libraryloader_findResourceExW(void* hmodule, void* lptype, void* lpname, uint16_t wlanguage);
void* windowssys_windows_win32_system_libraryloader_findResourceW(void* hmodule, void* lpname, void* lptype);
void windowssys_windows_win32_system_libraryloader_freeLibraryAndExitThread(void* hlibmodule, uint32_t dwexitcode);
int32_t windowssys_windows_win32_system_libraryloader_freeResource(void* hresdata);
uint32_t windowssys_windows_win32_system_libraryloader_getDllDirectoryA(uint32_t nbufferlength, void* lpbuffer);
uint32_t windowssys_windows_win32_system_libraryloader_getDllDirectoryW(uint32_t nbufferlength, void* lpbuffer);
uint32_t windowssys_windows_win32_system_libraryloader_getModuleFileNameA(void* hmodule, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_libraryloader_getModuleFileNameW(void* hmodule, void* lpfilename, uint32_t nsize);
void* windowssys_windows_win32_system_libraryloader_getModuleHandleA(void* lpmodulename);
int32_t windowssys_windows_win32_system_libraryloader_getModuleHandleExA(uint32_t dwflags, void* lpmodulename, void* phmodule);
int32_t windowssys_windows_win32_system_libraryloader_getModuleHandleExW(uint32_t dwflags, void* lpmodulename, void* phmodule);
void* windowssys_windows_win32_system_libraryloader_getModuleHandleW(void* lpmodulename);
void* windowssys_windows_win32_system_libraryloader_loadLibraryA(void* lplibfilename);
void* windowssys_windows_win32_system_libraryloader_loadLibraryExA(void* lplibfilename, void* hfile, uint32_t dwflags);
void* windowssys_windows_win32_system_libraryloader_loadLibraryExW(void* lplibfilename, void* hfile, uint32_t dwflags);
void* windowssys_windows_win32_system_libraryloader_loadLibraryW(void* lplibfilename);
uint32_t windowssys_windows_win32_system_libraryloader_loadModule(void* lpmodulename, void* lpparameterblock);
void* windowssys_windows_win32_system_libraryloader_loadPackagedLibrary(void* lpwlibfilename, uint32_t reserved);
void* windowssys_windows_win32_system_libraryloader_loadResource(void* hmodule, void* hresinfo);
void* windowssys_windows_win32_system_libraryloader_lockResource(void* hresdata);
int32_t windowssys_windows_win32_system_libraryloader_queryOptionalDelayLoadedAPI(void* hparentmodule, void* lpdllname, void* lpprocname, uint32_t reserved);
int32_t windowssys_windows_win32_system_libraryloader_removeDllDirectory(void* cookie);
int32_t windowssys_windows_win32_system_libraryloader_setDefaultDllDirectories(uint32_t directoryflags);
int32_t windowssys_windows_win32_system_libraryloader_setDllDirectoryA(void* lppathname);
int32_t windowssys_windows_win32_system_libraryloader_setDllDirectoryW(void* lppathname);
uint32_t windowssys_windows_win32_system_libraryloader_sizeofResource(void* hmodule, void* hresinfo);
int32_t windowssys_windows_win32_system_libraryloader_updateResourceA(void* hupdate, void* lptype, void* lpname, uint16_t wlanguage, void* lpdata, uint32_t cb);
int32_t windowssys_windows_win32_system_libraryloader_updateResourceW(void* hupdate, void* lptype, void* lpname, uint16_t wlanguage, void* lpdata, uint32_t cb);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WRAPPER_H */
