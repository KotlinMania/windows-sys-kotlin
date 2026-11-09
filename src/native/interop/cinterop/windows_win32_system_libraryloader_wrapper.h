#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_system_libraryloader_AddDllDirectory(void* newdirectory);
void* windowssys_windows_win32_system_libraryloader_BeginUpdateResourceA(void* pfilename, int32_t bdeleteexistingresources);
void* windowssys_windows_win32_system_libraryloader_BeginUpdateResourceW(void* pfilename, int32_t bdeleteexistingresources);
int32_t windowssys_windows_win32_system_libraryloader_DisableThreadLibraryCalls(void* hlibmodule);
int32_t windowssys_windows_win32_system_libraryloader_EndUpdateResourceA(void* hupdate, int32_t fdiscard);
int32_t windowssys_windows_win32_system_libraryloader_EndUpdateResourceW(void* hupdate, int32_t fdiscard);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesA(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExA(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExW(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesW(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceNamesA(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceNamesExA(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceNamesExW(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceNamesW(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceTypesA(void* hmodule, void* lpenumfunc, int64_t lparam);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceTypesExA(void* hmodule, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceTypesExW(void* hmodule, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid);
int32_t windowssys_windows_win32_system_libraryloader_EnumResourceTypesW(void* hmodule, void* lpenumfunc, int64_t lparam);
void* windowssys_windows_win32_system_libraryloader_FindResourceA(void* hmodule, void* lpname, void* lptype);
void* windowssys_windows_win32_system_libraryloader_FindResourceExA(void* hmodule, void* lptype, void* lpname, uint16_t wlanguage);
void* windowssys_windows_win32_system_libraryloader_FindResourceExW(void* hmodule, void* lptype, void* lpname, uint16_t wlanguage);
void* windowssys_windows_win32_system_libraryloader_FindResourceW(void* hmodule, void* lpname, void* lptype);
void windowssys_windows_win32_system_libraryloader_FreeLibraryAndExitThread(void* hlibmodule, uint32_t dwexitcode);
int32_t windowssys_windows_win32_system_libraryloader_FreeResource(void* hresdata);
uint32_t windowssys_windows_win32_system_libraryloader_GetDllDirectoryA(uint32_t nbufferlength, void* lpbuffer);
uint32_t windowssys_windows_win32_system_libraryloader_GetDllDirectoryW(uint32_t nbufferlength, void* lpbuffer);
uint32_t windowssys_windows_win32_system_libraryloader_GetModuleFileNameA(void* hmodule, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_libraryloader_GetModuleFileNameW(void* hmodule, void* lpfilename, uint32_t nsize);
void* windowssys_windows_win32_system_libraryloader_GetModuleHandleA(void* lpmodulename);
int32_t windowssys_windows_win32_system_libraryloader_GetModuleHandleExA(uint32_t dwflags, void* lpmodulename, void* phmodule);
int32_t windowssys_windows_win32_system_libraryloader_GetModuleHandleExW(uint32_t dwflags, void* lpmodulename, void* phmodule);
void* windowssys_windows_win32_system_libraryloader_GetModuleHandleW(void* lpmodulename);
void* windowssys_windows_win32_system_libraryloader_LoadLibraryA(void* lplibfilename);
void* windowssys_windows_win32_system_libraryloader_LoadLibraryExA(void* lplibfilename, void* hfile, uint32_t dwflags);
void* windowssys_windows_win32_system_libraryloader_LoadLibraryExW(void* lplibfilename, void* hfile, uint32_t dwflags);
void* windowssys_windows_win32_system_libraryloader_LoadLibraryW(void* lplibfilename);
uint32_t windowssys_windows_win32_system_libraryloader_LoadModule(void* lpmodulename, void* lpparameterblock);
void* windowssys_windows_win32_system_libraryloader_LoadPackagedLibrary(void* lpwlibfilename, uint32_t reserved);
void* windowssys_windows_win32_system_libraryloader_LoadResource(void* hmodule, void* hresinfo);
void* windowssys_windows_win32_system_libraryloader_LockResource(void* hresdata);
int32_t windowssys_windows_win32_system_libraryloader_QueryOptionalDelayLoadedAPI(void* hparentmodule, void* lpdllname, void* lpprocname, uint32_t reserved);
int32_t windowssys_windows_win32_system_libraryloader_RemoveDllDirectory(void* cookie);
int32_t windowssys_windows_win32_system_libraryloader_SetDefaultDllDirectories(uint32_t directoryflags);
int32_t windowssys_windows_win32_system_libraryloader_SetDllDirectoryA(void* lppathname);
int32_t windowssys_windows_win32_system_libraryloader_SetDllDirectoryW(void* lppathname);
uint32_t windowssys_windows_win32_system_libraryloader_SizeofResource(void* hmodule, void* hresinfo);
int32_t windowssys_windows_win32_system_libraryloader_UpdateResourceA(void* hupdate, void* lptype, void* lpname, uint16_t wlanguage, void* lpdata, uint32_t cb);
int32_t windowssys_windows_win32_system_libraryloader_UpdateResourceW(void* hupdate, void* lptype, void* lpname, uint16_t wlanguage, void* lpdata, uint32_t cb);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WINDOWS_WIN32_SYSTEM_LIBRARYLOADER_WRAPPER_H */
