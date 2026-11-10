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

int32_t windowssys_windows_win32_system_diagnostics_debug_extensions_createDataModelManager(void* debughost, void* manager) {
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

int32_t windowssys_windows_win32_system_diagnostics_debug_extensions_debugConnect(void* remoteoptions, void* interfaceid, void* arg_2_interface) {
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
        return km_fn_ptr(remoteoptions, interfaceid, arg_2_interface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)remoteoptions;
    (void)interfaceid;
    (void)arg_2_interface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_debug_extensions_debugConnectWide(void* remoteoptions, void* interfaceid, void* arg_2_interface) {
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
        return km_fn_ptr(remoteoptions, interfaceid, arg_2_interface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)remoteoptions;
    (void)interfaceid;
    (void)arg_2_interface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_debug_extensions_debugCreate(void* interfaceid, void* arg_1_interface) {
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
        return km_fn_ptr(interfaceid, arg_1_interface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfaceid;
    (void)arg_1_interface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_diagnostics_debug_extensions_debugCreateEx(void* interfaceid, uint32_t dbgengoptions, void* arg_2_interface) {
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
        return km_fn_ptr(interfaceid, dbgengoptions, arg_2_interface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interfaceid;
    (void)dbgengoptions;
    (void)arg_2_interface;
    errno = ENOSYS;
    return -1;
#endif
}

