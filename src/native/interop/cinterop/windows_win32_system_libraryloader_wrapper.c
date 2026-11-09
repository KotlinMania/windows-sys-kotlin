#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_libraryloader_wrapper.h"
#include <errno.h>
#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#include <windows.h>
#else
#include <dlfcn.h>
#ifndef RTLD_DEFAULT
#define RTLD_DEFAULT ((void*)0)
#endif
#endif

void* windowssys_windows_win32_system_libraryloader_AddDllDirectory(void* newdirectory) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddDllDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(newdirectory);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)newdirectory;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_BeginUpdateResourceA(void* pfilename, int32_t bdeleteexistingresources) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginUpdateResourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfilename, bdeleteexistingresources);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pfilename;
    (void)bdeleteexistingresources;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_BeginUpdateResourceW(void* pfilename, int32_t bdeleteexistingresources) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginUpdateResourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfilename, bdeleteexistingresources);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pfilename;
    (void)bdeleteexistingresources;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_DisableThreadLibraryCalls(void* hlibmodule) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisableThreadLibraryCalls");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlibmodule);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlibmodule;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EndUpdateResourceA(void* hupdate, int32_t fdiscard) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndUpdateResourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hupdate, fdiscard);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hupdate;
    (void)fdiscard;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EndUpdateResourceW(void* hupdate, int32_t fdiscard) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndUpdateResourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hupdate, fdiscard);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hupdate;
    (void)fdiscard;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesA(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceLanguagesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lptype, lpname, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExA(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceLanguagesExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lptype, lpname, lpenumfunc, lparam, dwflags, langid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesExW(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceLanguagesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lptype, lpname, lpenumfunc, lparam, dwflags, langid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceLanguagesW(void* hmodule, void* lptype, void* lpname, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceLanguagesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lptype, lpname, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceNamesA(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceNamesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lptype, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lptype;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceNamesExA(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceNamesExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lptype, lpenumfunc, lparam, dwflags, langid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lptype;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceNamesExW(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceNamesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lptype, lpenumfunc, lparam, dwflags, langid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lptype;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceNamesW(void* hmodule, void* lptype, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceNamesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lptype, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lptype;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceTypesA(void* hmodule, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceTypesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceTypesExA(void* hmodule, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceTypesExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lpenumfunc, lparam, dwflags, langid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceTypesExW(void* hmodule, void* lpenumfunc, int64_t lparam, uint32_t dwflags, uint16_t langid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceTypesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lpenumfunc, lparam, dwflags, langid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lpenumfunc;
    (void)lparam;
    (void)dwflags;
    (void)langid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_EnumResourceTypesW(void* hmodule, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumResourceTypesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmodule;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_libraryloader_FindResourceA(void* hmodule, void* lpname, void* lptype) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindResourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lpname, lptype);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hmodule;
    (void)lpname;
    (void)lptype;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_FindResourceExA(void* hmodule, void* lptype, void* lpname, uint16_t wlanguage) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindResourceExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lptype, lpname, wlanguage);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)wlanguage;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_FindResourceExW(void* hmodule, void* lptype, void* lpname, uint16_t wlanguage) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindResourceExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lptype, lpname, wlanguage);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hmodule;
    (void)lptype;
    (void)lpname;
    (void)wlanguage;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_FindResourceW(void* hmodule, void* lpname, void* lptype) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindResourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lpname, lptype);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hmodule;
    (void)lpname;
    (void)lptype;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_system_libraryloader_FreeLibraryAndExitThread(void* hlibmodule, uint32_t dwexitcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeLibraryAndExitThread");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hlibmodule, dwexitcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)hlibmodule;
    (void)dwexitcode;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_FreeResource(void* hresdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hresdata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_libraryloader_GetDllDirectoryA(uint32_t nbufferlength, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDllDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nbufferlength, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_libraryloader_GetDllDirectoryW(uint32_t nbufferlength, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDllDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nbufferlength, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_libraryloader_GetModuleFileNameA(void* hmodule, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_libraryloader_GetModuleFileNameW(void* hmodule, void* lpfilename, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, lpfilename, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmodule;
    (void)lpfilename;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_libraryloader_GetModuleHandleA(void* lpmodulename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleHandleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmodulename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpmodulename;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_GetModuleHandleExA(uint32_t dwflags, void* lpmodulename, void* phmodule) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleHandleExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpmodulename, phmodule);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpmodulename;
    (void)phmodule;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_GetModuleHandleExW(uint32_t dwflags, void* lpmodulename, void* phmodule) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleHandleExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpmodulename, phmodule);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpmodulename;
    (void)phmodule;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_libraryloader_GetModuleHandleW(void* lpmodulename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetModuleHandleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmodulename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpmodulename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_LoadLibraryA(void* lplibfilename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadLibraryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplibfilename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lplibfilename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_LoadLibraryExA(void* lplibfilename, void* hfile, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadLibraryExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplibfilename, hfile, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lplibfilename;
    (void)hfile;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_LoadLibraryExW(void* lplibfilename, void* hfile, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadLibraryExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplibfilename, hfile, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lplibfilename;
    (void)hfile;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_LoadLibraryW(void* lplibfilename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadLibraryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplibfilename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lplibfilename;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_libraryloader_LoadModule(void* lpmodulename, void* lpparameterblock) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadModule");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmodulename, lpparameterblock);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpmodulename;
    (void)lpparameterblock;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_system_libraryloader_LoadPackagedLibrary(void* lpwlibfilename, uint32_t reserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadPackagedLibrary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwlibfilename, reserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpwlibfilename;
    (void)reserved;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_LoadResource(void* hmodule, void* hresinfo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, hresinfo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hmodule;
    (void)hresinfo;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_libraryloader_LockResource(void* hresdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hresdata;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_QueryOptionalDelayLoadedAPI(void* hparentmodule, void* lpdllname, void* lpprocname, uint32_t reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-libraryloader-l2-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryOptionalDelayLoadedAPI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hparentmodule, lpdllname, lpprocname, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hparentmodule;
    (void)lpdllname;
    (void)lpprocname;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_RemoveDllDirectory(void* cookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDllDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_SetDefaultDllDirectories(uint32_t directoryflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDefaultDllDirectories");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(directoryflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)directoryflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_SetDllDirectoryA(void* lppathname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDllDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_SetDllDirectoryW(void* lppathname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDllDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_libraryloader_SizeofResource(void* hmodule, void* hresinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SizeofResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmodule, hresinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmodule;
    (void)hresinfo;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_UpdateResourceA(void* hupdate, void* lptype, void* lpname, uint16_t wlanguage, void* lpdata, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateResourceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hupdate, lptype, lpname, wlanguage, lpdata, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hupdate;
    (void)lptype;
    (void)lpname;
    (void)wlanguage;
    (void)lpdata;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_libraryloader_UpdateResourceW(void* hupdate, void* lptype, void* lpname, uint16_t wlanguage, void* lpdata, uint32_t cb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateResourceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hupdate, lptype, lpname, wlanguage, lpdata, cb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hupdate;
    (void)lptype;
    (void)lpname;
    (void)wlanguage;
    (void)lpdata;
    (void)cb;
    errno = ENOSYS;
    return -1;
#endif
}

