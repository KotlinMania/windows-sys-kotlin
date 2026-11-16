#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_diagnostics_debug_extensions_wrapper.h"
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

int32_t windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(void* debughost, void* manager) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbgmodel.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDataModelManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(debughost, manager);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)debughost;
    (void)manager;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(void* remoteoptions, void* interfaceid, void* arg2Interface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbgeng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(remoteoptions, interfaceid, arg2Interface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)remoteoptions;
    (void)interfaceid;
    (void)arg2Interface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(void* remoteoptions, void* interfaceid, void* arg2Interface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbgeng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugConnectWide");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(remoteoptions, interfaceid, arg2Interface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)remoteoptions;
    (void)interfaceid;
    (void)arg2Interface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(void* interfaceid, void* arg1Interface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbgeng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceid, arg1Interface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfaceid;
    (void)arg1Interface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(void* interfaceid, uint32_t dbgengoptions, void* arg2Interface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbgeng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugCreateEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceid, dbgengoptions, arg2Interface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfaceid;
    (void)dbgengoptions;
    (void)arg2Interface;
    errno = ENOSYS;
    return -1;
#endif
}

