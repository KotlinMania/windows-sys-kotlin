#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTCloseProvider(JNIEnv* km_env, jclass km_clazz, jlong hprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTCloseProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider) : -1;
#else
    (void)hprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTConvertDevModeToPrintTicket(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint cbdevmode, jlong pdevmode, jint scope, jlong pprintticket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTConvertDevModeToPrintTicket");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)cbdevmode, (void*)(uintptr_t)pdevmode, (int32_t)scope, (void*)(uintptr_t)pprintticket) : -1;
#else
    (void)hprovider;
    (void)cbdevmode;
    (void)pdevmode;
    (void)scope;
    (void)pprintticket;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTConvertPrintTicketToDevMode(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong pprintticket, jint basedevmodetype, jint scope, jlong pcbdevmode, jlong ppdevmode, jlong pbstrerrormessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTConvertPrintTicketToDevMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (void*)(uintptr_t)pprintticket, (int32_t)basedevmodetype, (int32_t)scope, (void*)(uintptr_t)pcbdevmode, (void*)(uintptr_t)ppdevmode, (void*)(uintptr_t)pbstrerrormessage) : -1;
#else
    (void)hprovider;
    (void)pprintticket;
    (void)basedevmodetype;
    (void)scope;
    (void)pcbdevmode;
    (void)ppdevmode;
    (void)pbstrerrormessage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTGetPrintCapabilities(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong pprintticket, jlong pcapabilities, jlong pbstrerrormessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTGetPrintCapabilities");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (void*)(uintptr_t)pprintticket, (void*)(uintptr_t)pcapabilities, (void*)(uintptr_t)pbstrerrormessage) : -1;
#else
    (void)hprovider;
    (void)pprintticket;
    (void)pcapabilities;
    (void)pbstrerrormessage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTGetPrintDeviceCapabilities(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong pprintticket, jlong pdevicecapabilities, jlong pbstrerrormessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTGetPrintDeviceCapabilities");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (void*)(uintptr_t)pprintticket, (void*)(uintptr_t)pdevicecapabilities, (void*)(uintptr_t)pbstrerrormessage) : -1;
#else
    (void)hprovider;
    (void)pprintticket;
    (void)pdevicecapabilities;
    (void)pbstrerrormessage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTGetPrintDeviceResources(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong pszlocalename, jlong pprintticket, jlong pdeviceresources, jlong pbstrerrormessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTGetPrintDeviceResources");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (void*)(uintptr_t)pszlocalename, (void*)(uintptr_t)pprintticket, (void*)(uintptr_t)pdeviceresources, (void*)(uintptr_t)pbstrerrormessage) : -1;
#else
    (void)hprovider;
    (void)pszlocalename;
    (void)pprintticket;
    (void)pdeviceresources;
    (void)pbstrerrormessage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTMergeAndValidatePrintTicket(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong pbaseticket, jlong pdeltaticket, jint scope, jlong presultticket, jlong pbstrerrormessage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTMergeAndValidatePrintTicket");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (void*)(uintptr_t)pbaseticket, (void*)(uintptr_t)pdeltaticket, (int32_t)scope, (void*)(uintptr_t)presultticket, (void*)(uintptr_t)pbstrerrormessage) : -1;
#else
    (void)hprovider;
    (void)pbaseticket;
    (void)pdeltaticket;
    (void)scope;
    (void)presultticket;
    (void)pbstrerrormessage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTOpenProvider(JNIEnv* km_env, jclass km_clazz, jlong pszprintername, jint dwversion, jlong phprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTOpenProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprintername, (uint32_t)dwversion, (void*)(uintptr_t)phprovider) : -1;
#else
    (void)pszprintername;
    (void)dwversion;
    (void)phprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTOpenProviderEx(JNIEnv* km_env, jclass km_clazz, jlong pszprintername, jint dwmaxversion, jint dwprefversion, jlong phprovider, jlong pusedversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTOpenProviderEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprintername, (uint32_t)dwmaxversion, (uint32_t)dwprefversion, (void*)(uintptr_t)phprovider, (void*)(uintptr_t)pusedversion) : -1;
#else
    (void)pszprintername;
    (void)dwmaxversion;
    (void)dwprefversion;
    (void)phprovider;
    (void)pusedversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTQuerySchemaVersionSupport(JNIEnv* km_env, jclass km_clazz, jlong pszprintername, jlong pmaxversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTQuerySchemaVersionSupport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprintername, (void*)(uintptr_t)pmaxversion) : -1;
#else
    (void)pszprintername;
    (void)pmaxversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_printing_printticket_WindowsWin32GraphicsPrintingPrintticketJniBridge_windowssys_1windows_1win32_1graphics_1printing_1printticket_1pTReleaseMemory(JNIEnv* km_env, jclass km_clazz, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("prntvpt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PTReleaseMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbuffer) : -1;
#else
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

