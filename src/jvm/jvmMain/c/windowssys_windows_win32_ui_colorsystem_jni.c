#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong pprofilename, jlong pdevicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssociateColorProfileWithDeviceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)pprofilename, (void*)(uintptr_t)pdevicename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong pprofilename, jlong pdevicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssociateColorProfileWithDeviceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)pprofilename, (void*)(uintptr_t)pdevicename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCheckColors(JNIEnv* km_env, jclass km_clazz, jlong hcmtransform, jlong lpainputcolors, jint ncolors, jint ctinput, jlong lparesult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCheckColors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcmtransform, (void*)(uintptr_t)lpainputcolors, (uint32_t)ncolors, (int32_t)ctinput, (void*)(uintptr_t)lparesult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcmtransform;
    (void)lpainputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)lparesult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCheckColorsInGamut(JNIEnv* km_env, jclass km_clazz, jlong hcmtransform, jlong lpargbtriple, jlong lparesult, jint ncount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCheckColorsInGamut");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcmtransform, (void*)(uintptr_t)lpargbtriple, (void*)(uintptr_t)lparesult, (uint32_t)ncount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcmtransform;
    (void)lpargbtriple;
    (void)lparesult;
    (void)ncount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCheckRGBs(JNIEnv* km_env, jclass km_clazz, jlong hcmtransform, jlong lpsrcbits, jint bminput, jint dwwidth, jint dwheight, jint dwstride, jlong lparesult, jlong pfncallback, jlong ulcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCheckRGBs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcmtransform, (void*)(uintptr_t)lpsrcbits, (int32_t)bminput, (uint32_t)dwwidth, (uint32_t)dwheight, (uint32_t)dwstride, (void*)(uintptr_t)lparesult, (void*)(uintptr_t)pfncallback, (int64_t)ulcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcmtransform;
    (void)lpsrcbits;
    (void)bminput;
    (void)dwwidth;
    (void)dwheight;
    (void)dwstride;
    (void)lparesult;
    (void)pfncallback;
    (void)ulcallbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong pacolorname, jlong paindex, jint dwcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMConvertColorNameToIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)pacolorname, (void*)(uintptr_t)paindex, (uint32_t)dwcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)pacolorname;
    (void)paindex;
    (void)dwcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMConvertIndexToColorName(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong paindex, jlong pacolorname, jint dwcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMConvertIndexToColorName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)paindex, (void*)(uintptr_t)pacolorname, (uint32_t)dwcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)paindex;
    (void)pacolorname;
    (void)dwcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile(JNIEnv* km_env, jclass km_clazz, jlong pahprofiles, jint nprofiles, jlong padwintents, jint nintents, jint dwflags, jlong lpprofiledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateDeviceLinkProfile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pahprofiles, (uint32_t)nprofiles, (void*)(uintptr_t)padwintents, (uint32_t)nintents, (uint32_t)dwflags, (void*)(uintptr_t)lpprofiledata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pahprofiles;
    (void)nprofiles;
    (void)padwintents;
    (void)nintents;
    (void)dwflags;
    (void)lpprofiledata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform(JNIEnv* km_env, jclass km_clazz, jlong pahprofiles, jint nprofiles, jlong padwintents, jint nintents, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateMultiProfileTransform");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pahprofiles, (uint32_t)nprofiles, (void*)(uintptr_t)padwintents, (uint32_t)nintents, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pahprofiles;
    (void)nprofiles;
    (void)padwintents;
    (void)nintents;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCreateProfile(JNIEnv* km_env, jclass km_clazz, jlong lpcolorspace, jlong lpprofiledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateProfile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcolorspace, (void*)(uintptr_t)lpprofiledata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcolorspace;
    (void)lpprofiledata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCreateProfileW(JNIEnv* km_env, jclass km_clazz, jlong lpcolorspace, jlong lpprofiledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateProfileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcolorspace, (void*)(uintptr_t)lpprofiledata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcolorspace;
    (void)lpprofiledata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCreateTransform(JNIEnv* km_env, jclass km_clazz, jlong lpcolorspace, jlong lpdevcharacter, jlong lptargetdevcharacter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateTransform");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcolorspace, (void*)(uintptr_t)lpdevcharacter, (void*)(uintptr_t)lptargetdevcharacter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCreateTransformExt(JNIEnv* km_env, jclass km_clazz, jlong lpcolorspace, jlong lpdevcharacter, jlong lptargetdevcharacter, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateTransformExt");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcolorspace, (void*)(uintptr_t)lpdevcharacter, (void*)(uintptr_t)lptargetdevcharacter, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCreateTransformExtW(JNIEnv* km_env, jclass km_clazz, jlong lpcolorspace, jlong lpdevcharacter, jlong lptargetdevcharacter, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateTransformExtW");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcolorspace, (void*)(uintptr_t)lpdevcharacter, (void*)(uintptr_t)lptargetdevcharacter, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMCreateTransformW(JNIEnv* km_env, jclass km_clazz, jlong lpcolorspace, jlong lpdevcharacter, jlong lptargetdevcharacter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateTransformW");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcolorspace, (void*)(uintptr_t)lpdevcharacter, (void*)(uintptr_t)lptargetdevcharacter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMDeleteTransform(JNIEnv* km_env, jclass km_clazz, jlong hcmtransform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMDeleteTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcmtransform);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcmtransform;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMGetInfo(JNIEnv* km_env, jclass km_clazz, jint dwinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMGetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong pnamedprofileinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMGetNamedProfileInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)pnamedprofileinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)pnamedprofileinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMIsProfileValid(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong lpbvalid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMIsProfileValid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)lpbvalid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)lpbvalid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMTranslateColors(JNIEnv* km_env, jclass km_clazz, jlong hcmtransform, jlong lpainputcolors, jint ncolors, jint ctinput, jlong lpaoutputcolors, jint ctoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMTranslateColors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcmtransform, (void*)(uintptr_t)lpainputcolors, (uint32_t)ncolors, (int32_t)ctinput, (void*)(uintptr_t)lpaoutputcolors, (int32_t)ctoutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcmtransform;
    (void)lpainputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)lpaoutputcolors;
    (void)ctoutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMTranslateRGB(JNIEnv* km_env, jclass km_clazz, jlong hcmtransform, jint colorref, jlong lpcolorref, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMTranslateRGB");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcmtransform, (uint32_t)colorref, (void*)(uintptr_t)lpcolorref, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcmtransform;
    (void)colorref;
    (void)lpcolorref;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMTranslateRGBs(JNIEnv* km_env, jclass km_clazz, jlong hcmtransform, jlong lpsrcbits, jint bminput, jint dwwidth, jint dwheight, jint dwstride, jlong lpdestbits, jint bmoutput, jint dwtranslatedirection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMTranslateRGBs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcmtransform, (void*)(uintptr_t)lpsrcbits, (int32_t)bminput, (uint32_t)dwwidth, (uint32_t)dwheight, (uint32_t)dwstride, (void*)(uintptr_t)lpdestbits, (int32_t)bmoutput, (uint32_t)dwtranslatedirection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcmtransform;
    (void)lpsrcbits;
    (void)bminput;
    (void)dwwidth;
    (void)dwheight;
    (void)dwstride;
    (void)lpdestbits;
    (void)bmoutput;
    (void)dwtranslatedirection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCMTranslateRGBsExt(JNIEnv* km_env, jclass km_clazz, jlong hcmtransform, jlong lpsrcbits, jint bminput, jint dwwidth, jint dwheight, jint dwinputstride, jlong lpdestbits, jint bmoutput, jint dwoutputstride, jlong lpfncallback, jlong ulcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, int32_t, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMTranslateRGBsExt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcmtransform, (void*)(uintptr_t)lpsrcbits, (int32_t)bminput, (uint32_t)dwwidth, (uint32_t)dwheight, (uint32_t)dwinputstride, (void*)(uintptr_t)lpdestbits, (int32_t)bmoutput, (uint32_t)dwoutputstride, (void*)(uintptr_t)lpfncallback, (int64_t)ulcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcmtransform;
    (void)lpsrcbits;
    (void)bminput;
    (void)dwwidth;
    (void)dwheight;
    (void)dwinputstride;
    (void)lpdestbits;
    (void)bmoutput;
    (void)dwoutputstride;
    (void)lpfncallback;
    (void)ulcallbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCheckBitmapBits(JNIEnv* km_env, jclass km_clazz, jlong hcolortransform, jlong psrcbits, jint bminput, jint dwwidth, jint dwheight, jint dwstride, jlong paresult, jlong pfncallback, jlong lpcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckBitmapBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcolortransform, (void*)(uintptr_t)psrcbits, (int32_t)bminput, (uint32_t)dwwidth, (uint32_t)dwheight, (uint32_t)dwstride, (void*)(uintptr_t)paresult, (void*)(uintptr_t)pfncallback, (int64_t)lpcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcolortransform;
    (void)psrcbits;
    (void)bminput;
    (void)dwwidth;
    (void)dwheight;
    (void)dwstride;
    (void)paresult;
    (void)pfncallback;
    (void)lpcallbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCheckColors(JNIEnv* km_env, jclass km_clazz, jlong hcolortransform, jlong painputcolors, jint ncolors, jint ctinput, jlong paresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckColors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcolortransform, (void*)(uintptr_t)painputcolors, (uint32_t)ncolors, (int32_t)ctinput, (void*)(uintptr_t)paresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcolortransform;
    (void)painputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)paresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCheckColorsInGamut(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lprgbtriple, jlong dlpbuffer, jint ncount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckColorsInGamut");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lprgbtriple, (void*)(uintptr_t)dlpbuffer, (uint32_t)ncount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lprgbtriple;
    (void)dlpbuffer;
    (void)ncount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCloseColorProfile(JNIEnv* km_env, jclass km_clazz, jlong hprofile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseColorProfile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemColorCorrectPalette(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hpal, jint defirst, jint num) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ColorCorrectPalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hpal, (uint32_t)defirst, (uint32_t)num);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hpal;
    (void)defirst;
    (void)num;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemColorMatchToTarget(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hdctarget, jint action) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ColorMatchToTarget");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hdctarget, (uint32_t)action);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)hdctarget;
    (void)action;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemConvertColorNameToIndex(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong pacolorname, jlong paindex, jint dwcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertColorNameToIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)pacolorname, (void*)(uintptr_t)paindex, (uint32_t)dwcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)pacolorname;
    (void)paindex;
    (void)dwcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemConvertIndexToColorName(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong paindex, jlong pacolorname, jint dwcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertIndexToColorName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)paindex, (void*)(uintptr_t)pacolorname, (uint32_t)dwcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)paindex;
    (void)pacolorname;
    (void)dwcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCreateColorSpaceA(JNIEnv* km_env, jclass km_clazz, jlong lplcs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateColorSpaceA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lplcs);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lplcs;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCreateColorSpaceW(JNIEnv* km_env, jclass km_clazz, jlong lplcs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateColorSpaceW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lplcs);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lplcs;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCreateColorTransformA(JNIEnv* km_env, jclass km_clazz, jlong plogcolorspace, jlong hdestprofile, jlong htargetprofile, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateColorTransformA");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plogcolorspace, (int64_t)hdestprofile, (int64_t)htargetprofile, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plogcolorspace;
    (void)hdestprofile;
    (void)htargetprofile;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCreateColorTransformW(JNIEnv* km_env, jclass km_clazz, jlong plogcolorspace, jlong hdestprofile, jlong htargetprofile, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateColorTransformW");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plogcolorspace, (int64_t)hdestprofile, (int64_t)htargetprofile, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plogcolorspace;
    (void)hdestprofile;
    (void)htargetprofile;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jint nprofiles, jlong padwintent, jint nintents, jint dwflags, jlong pprofiledata, jint indexpreferredcmm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDeviceLinkProfile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprofile, (uint32_t)nprofiles, (void*)(uintptr_t)padwintent, (uint32_t)nintents, (uint32_t)dwflags, (void*)(uintptr_t)pprofiledata, (uint32_t)indexpreferredcmm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)nprofiles;
    (void)padwintent;
    (void)nintents;
    (void)dwflags;
    (void)pprofiledata;
    (void)indexpreferredcmm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCreateMultiProfileTransform(JNIEnv* km_env, jclass km_clazz, jlong pahprofiles, jint nprofiles, jlong padwintent, jint nintents, jint dwflags, jint indexpreferredcmm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMultiProfileTransform");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pahprofiles, (uint32_t)nprofiles, (void*)(uintptr_t)padwintent, (uint32_t)nintents, (uint32_t)dwflags, (uint32_t)indexpreferredcmm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pahprofiles;
    (void)nprofiles;
    (void)padwintent;
    (void)nintents;
    (void)dwflags;
    (void)indexpreferredcmm;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA(JNIEnv* km_env, jclass km_clazz, jlong plogcolorspace, jlong pprofile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProfileFromLogColorSpaceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plogcolorspace, (void*)(uintptr_t)pprofile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plogcolorspace;
    (void)pprofile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW(JNIEnv* km_env, jclass km_clazz, jlong plogcolorspace, jlong pprofile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProfileFromLogColorSpaceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plogcolorspace, (void*)(uintptr_t)pprofile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plogcolorspace;
    (void)pprofile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemDeleteColorSpace(JNIEnv* km_env, jclass km_clazz, jlong hcs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteColorSpace");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcs);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcs;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemDeleteColorTransform(JNIEnv* km_env, jclass km_clazz, jlong hxform) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteColorTransform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hxform);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hxform;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong pprofilename, jlong pdevicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisassociateColorProfileFromDeviceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)pprofilename, (void*)(uintptr_t)pdevicename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong pprofilename, jlong pdevicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisassociateColorProfileFromDeviceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)pprofilename, (void*)(uintptr_t)pdevicename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemEnumColorProfilesA(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong penumrecord, jlong penumerationbuffer, jlong pdwsizeofenumerationbuffer, jlong pnprofiles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumColorProfilesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)penumrecord, (void*)(uintptr_t)penumerationbuffer, (void*)(uintptr_t)pdwsizeofenumerationbuffer, (void*)(uintptr_t)pnprofiles);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)penumrecord;
    (void)penumerationbuffer;
    (void)pdwsizeofenumerationbuffer;
    (void)pnprofiles;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemEnumColorProfilesW(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong penumrecord, jlong penumerationbuffer, jlong pdwsizeofenumerationbuffer, jlong pnprofiles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumColorProfilesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)penumrecord, (void*)(uintptr_t)penumerationbuffer, (void*)(uintptr_t)pdwsizeofenumerationbuffer, (void*)(uintptr_t)pnprofiles);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)penumrecord;
    (void)penumerationbuffer;
    (void)pdwsizeofenumerationbuffer;
    (void)pnprofiles;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemEnumICMProfilesA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong proc, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumICMProfilesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)proc, (int64_t)param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)proc;
    (void)param2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemEnumICMProfilesW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong proc, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumICMProfilesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)proc, (int64_t)param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)proc;
    (void)param2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetCMMInfo(JNIEnv* km_env, jclass km_clazz, jlong hcolortransform, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCMMInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcolortransform, (uint32_t)param1);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hcolortransform;
    (void)param1;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetColorDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong pbuffer, jlong pdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorDirectoryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pdwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetColorDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong pbuffer, jlong pdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorDirectoryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pdwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetColorProfileElement(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jint tag, jint dwoffset, jlong pcbelement, jlong pelement, jlong pbreference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorProfileElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (uint32_t)tag, (uint32_t)dwoffset, (void*)(uintptr_t)pcbelement, (void*)(uintptr_t)pelement, (void*)(uintptr_t)pbreference);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)tag;
    (void)dwoffset;
    (void)pcbelement;
    (void)pelement;
    (void)pbreference;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetColorProfileElementTag(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jint dwindex, jlong ptag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorProfileElementTag");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (uint32_t)dwindex, (void*)(uintptr_t)ptag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)dwindex;
    (void)ptag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetColorProfileFromHandle(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong pprofile, jlong pcbprofile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorProfileFromHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)pprofile, (void*)(uintptr_t)pcbprofile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)pprofile;
    (void)pcbprofile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetColorProfileHeader(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong pheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorProfileHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)pheader);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)pheader;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetColorSpace(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorSpace");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetCountColorProfileElements(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong pnelementcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCountColorProfileElements");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)pnelementcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)pnelementcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetDeviceGammaRamp(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpramp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceGammaRamp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpramp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpramp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetICMProfileA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pbufsize, jlong pszfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetICMProfileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pbufsize, (void*)(uintptr_t)pszfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)pbufsize;
    (void)pszfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetICMProfileW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pbufsize, jlong pszfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetICMProfileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pbufsize, (void*)(uintptr_t)pszfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)pbufsize;
    (void)pszfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetLogColorSpaceA(JNIEnv* km_env, jclass km_clazz, jlong hcolorspace, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogColorSpaceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcolorspace, (void*)(uintptr_t)lpbuffer, (uint32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcolorspace;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetLogColorSpaceW(JNIEnv* km_env, jclass km_clazz, jlong hcolorspace, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogColorSpaceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcolorspace, (void*)(uintptr_t)lpbuffer, (uint32_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcolorspace;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetNamedProfileInfo(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong pnamedprofileinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedProfileInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)pnamedprofileinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)pnamedprofileinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jint dwintent, jlong pps2colorrenderingdictionary, jlong pcbps2colorrenderingdictionary, jlong pbbinary) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPS2ColorRenderingDictionary");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (uint32_t)dwintent, (void*)(uintptr_t)pps2colorrenderingdictionary, (void*)(uintptr_t)pcbps2colorrenderingdictionary, (void*)(uintptr_t)pbbinary);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)dwintent;
    (void)pps2colorrenderingdictionary;
    (void)pcbps2colorrenderingdictionary;
    (void)pbbinary;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jint dwintent, jlong pbuffer, jlong pcbps2colorrenderingintent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPS2ColorRenderingIntent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (uint32_t)dwintent, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pcbps2colorrenderingintent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)dwintent;
    (void)pbuffer;
    (void)pcbps2colorrenderingintent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jint dwintent, jint dwcsatype, jlong pps2colorspacearray, jlong pcbps2colorspacearray, jlong pbbinary) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPS2ColorSpaceArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (uint32_t)dwintent, (uint32_t)dwcsatype, (void*)(uintptr_t)pps2colorspacearray, (void*)(uintptr_t)pcbps2colorspacearray, (void*)(uintptr_t)pbbinary);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)dwintent;
    (void)dwcsatype;
    (void)pps2colorspacearray;
    (void)pcbps2colorspacearray;
    (void)pbbinary;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jint dwscs, jlong pbuffer, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStandardColorSpaceProfileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (uint32_t)dwscs, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pcbsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)dwscs;
    (void)pbuffer;
    (void)pcbsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jint dwscs, jlong pbuffer, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStandardColorSpaceProfileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (uint32_t)dwscs, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pcbsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)dwscs;
    (void)pbuffer;
    (void)pcbsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemInstallColorProfileA(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong pprofilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallColorProfileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)pprofilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)pprofilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemInstallColorProfileW(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong pprofilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallColorProfileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)pprofilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)pprofilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemIsColorProfileTagPresent(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jint tag, jlong pbpresent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsColorProfileTagPresent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (uint32_t)tag, (void*)(uintptr_t)pbpresent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)tag;
    (void)pbpresent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemIsColorProfileValid(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong pbvalid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsColorProfileValid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)pbvalid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)pbvalid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemOpenColorProfileA(JNIEnv* km_env, jclass km_clazz, jlong pprofile, jint dwdesiredaccess, jint dwsharemode, jint dwcreationmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenColorProfileA");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pprofile, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (uint32_t)dwcreationmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pprofile;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemOpenColorProfileW(JNIEnv* km_env, jclass km_clazz, jlong pprofile, jint dwdesiredaccess, jint dwsharemode, jint dwcreationmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenColorProfileW");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pprofile, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (uint32_t)dwcreationmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pprofile;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemRegisterCMMA(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jint cmmid, jlong pcmmdll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterCMMA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (uint32_t)cmmid, (void*)(uintptr_t)pcmmdll);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)cmmid;
    (void)pcmmdll;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemRegisterCMMW(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jint cmmid, jlong pcmmdll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterCMMW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (uint32_t)cmmid, (void*)(uintptr_t)pcmmdll);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)cmmid;
    (void)pcmmdll;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSelectCMM(JNIEnv* km_env, jclass km_clazz, jint dwcmmtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectCMM");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcmmtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcmmtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetColorProfileElement(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jint tag, jint dwoffset, jlong pcbelement, jlong pelement) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorProfileElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (uint32_t)tag, (uint32_t)dwoffset, (void*)(uintptr_t)pcbelement, (void*)(uintptr_t)pelement);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)tag;
    (void)dwoffset;
    (void)pcbelement;
    (void)pelement;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetColorProfileElementReference(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jint newtag, jint reftag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorProfileElementReference");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (uint32_t)newtag, (uint32_t)reftag);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)newtag;
    (void)reftag;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetColorProfileElementSize(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jint tagtype, jint pcbelement) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorProfileElementSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (uint32_t)tagtype, (uint32_t)pcbelement);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)tagtype;
    (void)pcbelement;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetColorProfileHeader(JNIEnv* km_env, jclass km_clazz, jlong hprofile, jlong pheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorProfileHeader");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hprofile, (void*)(uintptr_t)pheader);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprofile;
    (void)pheader;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetColorSpace(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong hcs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorSpace");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)hcs);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hdc;
    (void)hcs;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetDeviceGammaRamp(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpramp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDeviceGammaRamp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpramp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpramp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetICMMode(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetICMMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetICMProfileA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetICMProfileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetICMProfileW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetICMProfileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)lpfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)lpfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jint dwprofileid, jlong pprofilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStandardColorSpaceProfileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (uint32_t)dwprofileid, (void*)(uintptr_t)pprofilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)dwprofileid;
    (void)pprofilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jint dwprofileid, jlong pprofilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStandardColorSpaceProfileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (uint32_t)dwprofileid, (void*)(uintptr_t)pprofilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)dwprofileid;
    (void)pprofilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetupColorMatchingA(JNIEnv* km_env, jclass km_clazz, jlong pcms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icmui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupColorMatchingA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcms);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcms;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemSetupColorMatchingW(JNIEnv* km_env, jclass km_clazz, jlong pcms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icmui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupColorMatchingW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcms);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcms;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemTranslateBitmapBits(JNIEnv* km_env, jclass km_clazz, jlong hcolortransform, jlong psrcbits, jint bminput, jint dwwidth, jint dwheight, jint dwinputstride, jlong pdestbits, jint bmoutput, jint dwoutputstride, jlong pfncallback, jlong ulcallbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, int32_t, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateBitmapBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcolortransform, (void*)(uintptr_t)psrcbits, (int32_t)bminput, (uint32_t)dwwidth, (uint32_t)dwheight, (uint32_t)dwinputstride, (void*)(uintptr_t)pdestbits, (int32_t)bmoutput, (uint32_t)dwoutputstride, (void*)(uintptr_t)pfncallback, (int64_t)ulcallbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcolortransform;
    (void)psrcbits;
    (void)bminput;
    (void)dwwidth;
    (void)dwheight;
    (void)dwinputstride;
    (void)pdestbits;
    (void)bmoutput;
    (void)dwoutputstride;
    (void)pfncallback;
    (void)ulcallbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemTranslateColors(JNIEnv* km_env, jclass km_clazz, jlong hcolortransform, jlong painputcolors, jint ncolors, jint ctinput, jlong paoutputcolors, jint ctoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateColors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcolortransform, (void*)(uintptr_t)painputcolors, (uint32_t)ncolors, (int32_t)ctinput, (void*)(uintptr_t)paoutputcolors, (int32_t)ctoutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcolortransform;
    (void)painputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)paoutputcolors;
    (void)ctoutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemUninstallColorProfileA(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong pprofilename, jint bdelete) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UninstallColorProfileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)pprofilename, (int32_t)bdelete);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)bdelete;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemUninstallColorProfileW(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jlong pprofilename, jint bdelete) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UninstallColorProfileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (void*)(uintptr_t)pprofilename, (int32_t)bdelete);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)bdelete;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemUnregisterCMMA(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jint cmmid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterCMMA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (uint32_t)cmmid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)cmmid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemUnregisterCMMW(JNIEnv* km_env, jclass km_clazz, jlong pmachinename, jint cmmid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterCMMW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pmachinename, (uint32_t)cmmid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pmachinename;
    (void)cmmid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemUpdateICMRegKeyA(JNIEnv* km_env, jclass km_clazz, jint reserved, jlong lpszcmid, jlong lpszfilename, jint command) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateICMRegKeyA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)reserved, (void*)(uintptr_t)lpszcmid, (void*)(uintptr_t)lpszfilename, (uint32_t)command);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reserved;
    (void)lpszcmid;
    (void)lpszfilename;
    (void)command;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemUpdateICMRegKeyW(JNIEnv* km_env, jclass km_clazz, jint reserved, jlong lpszcmid, jlong lpszfilename, jint command) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateICMRegKeyW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)reserved, (void*)(uintptr_t)lpszcmid, (void*)(uintptr_t)lpszfilename, (uint32_t)command);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reserved;
    (void)lpszcmid;
    (void)lpszfilename;
    (void)command;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice(JNIEnv* km_env, jclass km_clazz, jint scope, jlong pprofilename, jlong pdevicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsAssociateColorProfileWithDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)scope, (void*)(uintptr_t)pprofilename, (void*)(uintptr_t)pdevicename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)scope;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsCheckColors(JNIEnv* km_env, jclass km_clazz, jlong hcolortransform, jint ncolors, jint ninputchannels, jint cdtinput, jint cbinput, jlong pinputdata, jlong paresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsCheckColors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcolortransform, (uint32_t)ncolors, (uint32_t)ninputchannels, (int32_t)cdtinput, (uint32_t)cbinput, (void*)(uintptr_t)pinputdata, (void*)(uintptr_t)paresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcolortransform;
    (void)ncolors;
    (void)ninputchannels;
    (void)cdtinput;
    (void)cbinput;
    (void)pinputdata;
    (void)paresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsCreateIccProfile(JNIEnv* km_env, jclass km_clazz, jlong hwcsprofile, jint dwoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsCreateIccProfile");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hwcsprofile, (uint32_t)dwoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwcsprofile;
    (void)dwoptions;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice(JNIEnv* km_env, jclass km_clazz, jint scope, jlong pprofilename, jlong pdevicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsDisassociateColorProfileFromDevice");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)scope, (void*)(uintptr_t)pprofilename, (void*)(uintptr_t)pdevicename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)scope;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsEnumColorProfiles(JNIEnv* km_env, jclass km_clazz, jint scope, jlong penumrecord, jlong pbuffer, jint dwsize, jlong pnprofiles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsEnumColorProfiles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)scope, (void*)(uintptr_t)penumrecord, (void*)(uintptr_t)pbuffer, (uint32_t)dwsize, (void*)(uintptr_t)pnprofiles);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)scope;
    (void)penumrecord;
    (void)pbuffer;
    (void)dwsize;
    (void)pnprofiles;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize(JNIEnv* km_env, jclass km_clazz, jint scope, jlong penumrecord, jlong pdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsEnumColorProfilesSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)scope, (void*)(uintptr_t)penumrecord, (void*)(uintptr_t)pdwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)scope;
    (void)penumrecord;
    (void)pdwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState(JNIEnv* km_env, jclass km_clazz, jlong pbisenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsGetCalibrationManagementState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbisenabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbisenabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile(JNIEnv* km_env, jclass km_clazz, jint scope, jlong pdevicename, jint cptcolorprofiletype, jint cpstcolorprofilesubtype, jint dwprofileid, jint cbprofilename, jlong pprofilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsGetDefaultColorProfile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)scope, (void*)(uintptr_t)pdevicename, (int32_t)cptcolorprofiletype, (int32_t)cpstcolorprofilesubtype, (uint32_t)dwprofileid, (uint32_t)cbprofilename, (void*)(uintptr_t)pprofilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)scope;
    (void)pdevicename;
    (void)cptcolorprofiletype;
    (void)cpstcolorprofilesubtype;
    (void)dwprofileid;
    (void)cbprofilename;
    (void)pprofilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize(JNIEnv* km_env, jclass km_clazz, jint scope, jlong pdevicename, jint cptcolorprofiletype, jint cpstcolorprofilesubtype, jint dwprofileid, jlong pcbprofilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsGetDefaultColorProfileSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)scope, (void*)(uintptr_t)pdevicename, (int32_t)cptcolorprofiletype, (int32_t)cpstcolorprofilesubtype, (uint32_t)dwprofileid, (void*)(uintptr_t)pcbprofilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)scope;
    (void)pdevicename;
    (void)cptcolorprofiletype;
    (void)cpstcolorprofilesubtype;
    (void)dwprofileid;
    (void)pcbprofilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent(JNIEnv* km_env, jclass km_clazz, jint scope, jlong pdwrenderingintent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsGetDefaultRenderingIntent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)scope, (void*)(uintptr_t)pdwrenderingintent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)scope;
    (void)pdwrenderingintent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles(JNIEnv* km_env, jclass km_clazz, jlong pdevicename, jint dwdeviceclass, jlong puseperuserprofiles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsGetUsePerUserProfiles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdevicename, (uint32_t)dwdeviceclass, (void*)(uintptr_t)puseperuserprofiles);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdevicename;
    (void)dwdeviceclass;
    (void)puseperuserprofiles;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsOpenColorProfileA(JNIEnv* km_env, jclass km_clazz, jlong pcdmpprofile, jlong pcampprofile, jlong pgmmpprofile, jint dwdesireaccess, jint dwsharemode, jint dwcreationmode, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsOpenColorProfileA");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcdmpprofile, (void*)(uintptr_t)pcampprofile, (void*)(uintptr_t)pgmmpprofile, (uint32_t)dwdesireaccess, (uint32_t)dwsharemode, (uint32_t)dwcreationmode, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcdmpprofile;
    (void)pcampprofile;
    (void)pgmmpprofile;
    (void)dwdesireaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsOpenColorProfileW(JNIEnv* km_env, jclass km_clazz, jlong pcdmpprofile, jlong pcampprofile, jlong pgmmpprofile, jint dwdesireaccess, jint dwsharemode, jint dwcreationmode, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsOpenColorProfileW");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcdmpprofile, (void*)(uintptr_t)pcampprofile, (void*)(uintptr_t)pgmmpprofile, (uint32_t)dwdesireaccess, (uint32_t)dwsharemode, (uint32_t)dwcreationmode, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcdmpprofile;
    (void)pcampprofile;
    (void)pgmmpprofile;
    (void)dwdesireaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    (void)dwflags;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(JNIEnv* km_env, jclass km_clazz, jint bisenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsSetCalibrationManagementState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)bisenabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bisenabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile(JNIEnv* km_env, jclass km_clazz, jint scope, jlong pdevicename, jint cptcolorprofiletype, jint cpstcolorprofilesubtype, jint dwprofileid, jlong pprofilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsSetDefaultColorProfile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)scope, (void*)(uintptr_t)pdevicename, (int32_t)cptcolorprofiletype, (int32_t)cpstcolorprofilesubtype, (uint32_t)dwprofileid, (void*)(uintptr_t)pprofilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)scope;
    (void)pdevicename;
    (void)cptcolorprofiletype;
    (void)cpstcolorprofilesubtype;
    (void)dwprofileid;
    (void)pprofilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(JNIEnv* km_env, jclass km_clazz, jint scope, jint dwrenderingintent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsSetDefaultRenderingIntent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)scope, (uint32_t)dwrenderingintent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)scope;
    (void)dwrenderingintent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles(JNIEnv* km_env, jclass km_clazz, jlong pdevicename, jint dwdeviceclass, jint useperuserprofiles) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsSetUsePerUserProfiles");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdevicename, (uint32_t)dwdeviceclass, (int32_t)useperuserprofiles);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdevicename;
    (void)dwdeviceclass;
    (void)useperuserprofiles;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_colorsystem_WindowsWin32UiColorsystemJniBridge_windowssysWindowsWin32UiColorsystemWcsTranslateColors(JNIEnv* km_env, jclass km_clazz, jlong hcolortransform, jint ncolors, jint ninputchannels, jint cdtinput, jint cbinput, jlong pinputdata, jint noutputchannels, jint cdtoutput, jint cboutput, jlong poutputdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, int32_t, uint32_t, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsTranslateColors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hcolortransform, (uint32_t)ncolors, (uint32_t)ninputchannels, (int32_t)cdtinput, (uint32_t)cbinput, (void*)(uintptr_t)pinputdata, (uint32_t)noutputchannels, (int32_t)cdtoutput, (uint32_t)cboutput, (void*)(uintptr_t)poutputdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcolortransform;
    (void)ncolors;
    (void)ninputchannels;
    (void)cdtinput;
    (void)cbinput;
    (void)pinputdata;
    (void)noutputchannels;
    (void)cdtoutput;
    (void)cboutput;
    (void)poutputdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

