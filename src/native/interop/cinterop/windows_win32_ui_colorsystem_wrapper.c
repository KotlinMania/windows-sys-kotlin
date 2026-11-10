#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_colorsystem_wrapper.h"
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

int32_t windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceA(void* pmachinename, void* pprofilename, void* pdevicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssociateColorProfileWithDeviceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, pprofilename, pdevicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceW(void* pmachinename, void* pprofilename, void* pdevicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssociateColorProfileWithDeviceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, pprofilename, pdevicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMCheckColors(int64_t hcmtransform, void* lpainputcolors, uint32_t ncolors, int32_t ctinput, void* lparesult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCheckColors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcmtransform, lpainputcolors, ncolors, ctinput, lparesult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcmtransform;
    (void)lpainputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)lparesult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMCheckColorsInGamut(int64_t hcmtransform, void* lpargbtriple, void* lparesult, uint32_t ncount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCheckColorsInGamut");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcmtransform, lpargbtriple, lparesult, ncount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcmtransform;
    (void)lpargbtriple;
    (void)lparesult;
    (void)ncount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMCheckRGBs(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* lparesult, void* pfncallback, int64_t ulcallbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCheckRGBs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcmtransform, lpsrcbits, bminput, dwwidth, dwheight, dwstride, lparesult, pfncallback, ulcallbackdata);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMConvertColorNameToIndex(int64_t hprofile, void* pacolorname, void* paindex, uint32_t dwcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMConvertColorNameToIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, pacolorname, paindex, dwcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)pacolorname;
    (void)paindex;
    (void)dwcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMConvertIndexToColorName(int64_t hprofile, void* paindex, void* pacolorname, uint32_t dwcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMConvertIndexToColorName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, paindex, pacolorname, dwcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)paindex;
    (void)pacolorname;
    (void)dwcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMCreateDeviceLinkProfile(void* pahprofiles, uint32_t nprofiles, void* padwintents, uint32_t nintents, uint32_t dwflags, void* lpprofiledata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateDeviceLinkProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pahprofiles, nprofiles, padwintents, nintents, dwflags, lpprofiledata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pahprofiles;
    (void)nprofiles;
    (void)padwintents;
    (void)nintents;
    (void)dwflags;
    (void)lpprofiledata;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_cMCreateMultiProfileTransform(void* pahprofiles, uint32_t nprofiles, void* padwintents, uint32_t nintents, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateMultiProfileTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pahprofiles, nprofiles, padwintents, nintents, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pahprofiles;
    (void)nprofiles;
    (void)padwintents;
    (void)nintents;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMCreateProfile(void* lpcolorspace, void* lpprofiledata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcolorspace, lpprofiledata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcolorspace;
    (void)lpprofiledata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMCreateProfileW(void* lpcolorspace, void* lpprofiledata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcolorspace, lpprofiledata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcolorspace;
    (void)lpprofiledata;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_cMCreateTransform(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcolorspace, lpdevcharacter, lptargetdevcharacter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_cMCreateTransformExt(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateTransformExt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcolorspace, lpdevcharacter, lptargetdevcharacter, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_cMCreateTransformExtW(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateTransformExtW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcolorspace, lpdevcharacter, lptargetdevcharacter, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_cMCreateTransformW(void* lpcolorspace, void* lpdevcharacter, void* lptargetdevcharacter) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMCreateTransformW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcolorspace, lpdevcharacter, lptargetdevcharacter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcolorspace;
    (void)lpdevcharacter;
    (void)lptargetdevcharacter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMDeleteTransform(int64_t hcmtransform) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMDeleteTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcmtransform);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcmtransform;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_colorsystem_cMGetInfo(uint32_t dwinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwinfo;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMGetNamedProfileInfo(int64_t hprofile, void* pnamedprofileinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMGetNamedProfileInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, pnamedprofileinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)pnamedprofileinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMIsProfileValid(int64_t hprofile, void* lpbvalid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMIsProfileValid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, lpbvalid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)lpbvalid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMTranslateColors(int64_t hcmtransform, void* lpainputcolors, uint32_t ncolors, int32_t ctinput, void* lpaoutputcolors, int32_t ctoutput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMTranslateColors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcmtransform, lpainputcolors, ncolors, ctinput, lpaoutputcolors, ctoutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcmtransform;
    (void)lpainputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)lpaoutputcolors;
    (void)ctoutput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMTranslateRGB(int64_t hcmtransform, uint32_t colorref, void* lpcolorref, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMTranslateRGB");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcmtransform, colorref, lpcolorref, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcmtransform;
    (void)colorref;
    (void)lpcolorref;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMTranslateRGBs(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* lpdestbits, int32_t bmoutput, uint32_t dwtranslatedirection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMTranslateRGBs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcmtransform, lpsrcbits, bminput, dwwidth, dwheight, dwstride, lpdestbits, bmoutput, dwtranslatedirection);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_cMTranslateRGBsExt(int64_t hcmtransform, void* lpsrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwinputstride, void* lpdestbits, int32_t bmoutput, uint32_t dwoutputstride, void* lpfncallback, int64_t ulcallbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, int32_t, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMTranslateRGBsExt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcmtransform, lpsrcbits, bminput, dwwidth, dwheight, dwinputstride, lpdestbits, bmoutput, dwoutputstride, lpfncallback, ulcallbackdata);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_checkBitmapBits(int64_t hcolortransform, void* psrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwstride, void* paresult, void* pfncallback, int64_t lpcallbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckBitmapBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcolortransform, psrcbits, bminput, dwwidth, dwheight, dwstride, paresult, pfncallback, lpcallbackdata);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_checkColors(int64_t hcolortransform, void* painputcolors, uint32_t ncolors, int32_t ctinput, void* paresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckColors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcolortransform, painputcolors, ncolors, ctinput, paresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcolortransform;
    (void)painputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)paresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_checkColorsInGamut(void* hdc, void* lprgbtriple, void* dlpbuffer, uint32_t ncount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckColorsInGamut");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lprgbtriple, dlpbuffer, ncount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lprgbtriple;
    (void)dlpbuffer;
    (void)ncount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_closeColorProfile(int64_t hprofile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseColorProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_colorCorrectPalette(void* hdc, void* hpal, uint32_t defirst, uint32_t num) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ColorCorrectPalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hpal, defirst, num);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hpal;
    (void)defirst;
    (void)num;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_colorMatchToTarget(void* hdc, void* hdctarget, uint32_t action) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ColorMatchToTarget");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hdctarget, action);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hdctarget;
    (void)action;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_convertColorNameToIndex(int64_t hprofile, void* pacolorname, void* paindex, uint32_t dwcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertColorNameToIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, pacolorname, paindex, dwcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)pacolorname;
    (void)paindex;
    (void)dwcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_convertIndexToColorName(int64_t hprofile, void* paindex, void* pacolorname, uint32_t dwcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertIndexToColorName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, paindex, pacolorname, dwcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)paindex;
    (void)pacolorname;
    (void)dwcount;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_colorsystem_createColorSpaceA(void* lplcs) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateColorSpaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplcs);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lplcs;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_colorsystem_createColorSpaceW(void* lplcs) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateColorSpaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplcs);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lplcs;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_createColorTransformA(void* plogcolorspace, int64_t hdestprofile, int64_t htargetprofile, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateColorTransformA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plogcolorspace, hdestprofile, htargetprofile, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plogcolorspace;
    (void)hdestprofile;
    (void)htargetprofile;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_createColorTransformW(void* plogcolorspace, int64_t hdestprofile, int64_t htargetprofile, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateColorTransformW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plogcolorspace, hdestprofile, htargetprofile, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plogcolorspace;
    (void)hdestprofile;
    (void)htargetprofile;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_createDeviceLinkProfile(void* hprofile, uint32_t nprofiles, void* padwintent, uint32_t nintents, uint32_t dwflags, void* pprofiledata, uint32_t indexpreferredcmm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDeviceLinkProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, nprofiles, padwintent, nintents, dwflags, pprofiledata, indexpreferredcmm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)nprofiles;
    (void)padwintent;
    (void)nintents;
    (void)dwflags;
    (void)pprofiledata;
    (void)indexpreferredcmm;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_createMultiProfileTransform(void* pahprofiles, uint32_t nprofiles, void* padwintent, uint32_t nintents, uint32_t dwflags, uint32_t indexpreferredcmm) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMultiProfileTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pahprofiles, nprofiles, padwintent, nintents, dwflags, indexpreferredcmm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pahprofiles;
    (void)nprofiles;
    (void)padwintent;
    (void)nintents;
    (void)dwflags;
    (void)indexpreferredcmm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceA(void* plogcolorspace, void* pprofile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProfileFromLogColorSpaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plogcolorspace, pprofile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plogcolorspace;
    (void)pprofile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceW(void* plogcolorspace, void* pprofile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProfileFromLogColorSpaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plogcolorspace, pprofile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plogcolorspace;
    (void)pprofile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_deleteColorSpace(void* hcs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteColorSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_deleteColorTransform(int64_t hxform) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteColorTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hxform);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hxform;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceA(void* pmachinename, void* pprofilename, void* pdevicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisassociateColorProfileFromDeviceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, pprofilename, pdevicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceW(void* pmachinename, void* pprofilename, void* pdevicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisassociateColorProfileFromDeviceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, pprofilename, pdevicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_enumColorProfilesA(void* pmachinename, void* penumrecord, void* penumerationbuffer, void* pdwsizeofenumerationbuffer, void* pnprofiles) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumColorProfilesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, penumrecord, penumerationbuffer, pdwsizeofenumerationbuffer, pnprofiles);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)penumrecord;
    (void)penumerationbuffer;
    (void)pdwsizeofenumerationbuffer;
    (void)pnprofiles;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_enumColorProfilesW(void* pmachinename, void* penumrecord, void* penumerationbuffer, void* pdwsizeofenumerationbuffer, void* pnprofiles) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumColorProfilesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, penumrecord, penumerationbuffer, pdwsizeofenumerationbuffer, pnprofiles);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)penumrecord;
    (void)penumerationbuffer;
    (void)pdwsizeofenumerationbuffer;
    (void)pnprofiles;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_enumICMProfilesA(void* hdc, void* proc, int64_t param2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumICMProfilesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, proc, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)proc;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_enumICMProfilesW(void* hdc, void* proc, int64_t param2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumICMProfilesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, proc, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)proc;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_colorsystem_getCMMInfo(int64_t hcolortransform, uint32_t param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCMMInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcolortransform, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcolortransform;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getColorDirectoryA(void* pmachinename, void* pbuffer, void* pdwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, pbuffer, pdwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getColorDirectoryW(void* pmachinename, void* pbuffer, void* pdwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, pbuffer, pdwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)pbuffer;
    (void)pdwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getColorProfileElement(int64_t hprofile, uint32_t tag, uint32_t dwoffset, void* pcbelement, void* pelement, void* pbreference) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorProfileElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, tag, dwoffset, pcbelement, pelement, pbreference);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)tag;
    (void)dwoffset;
    (void)pcbelement;
    (void)pelement;
    (void)pbreference;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getColorProfileElementTag(int64_t hprofile, uint32_t dwindex, void* ptag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorProfileElementTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, dwindex, ptag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)dwindex;
    (void)ptag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getColorProfileFromHandle(int64_t hprofile, void* pprofile, void* pcbprofile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorProfileFromHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, pprofile, pcbprofile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)pprofile;
    (void)pcbprofile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getColorProfileHeader(int64_t hprofile, void* pheader) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorProfileHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, pheader);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)pheader;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_colorsystem_getColorSpace(void* hdc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetColorSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getCountColorProfileElements(int64_t hprofile, void* pnelementcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCountColorProfileElements");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, pnelementcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)pnelementcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getDeviceGammaRamp(void* hdc, void* lpramp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceGammaRamp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpramp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpramp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getICMProfileA(void* hdc, void* pbufsize, void* pszfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetICMProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pbufsize, pszfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pbufsize;
    (void)pszfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getICMProfileW(void* hdc, void* pbufsize, void* pszfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetICMProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pbufsize, pszfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pbufsize;
    (void)pszfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getLogColorSpaceA(void* hcolorspace, void* lpbuffer, uint32_t nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogColorSpaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcolorspace, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcolorspace;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getLogColorSpaceW(void* hcolorspace, void* lpbuffer, uint32_t nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogColorSpaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcolorspace, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcolorspace;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getNamedProfileInfo(int64_t hprofile, void* pnamedprofileinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedProfileInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, pnamedprofileinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)pnamedprofileinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingDictionary(int64_t hprofile, uint32_t dwintent, void* pps2colorrenderingdictionary, void* pcbps2colorrenderingdictionary, void* pbbinary) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPS2ColorRenderingDictionary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, dwintent, pps2colorrenderingdictionary, pcbps2colorrenderingdictionary, pbbinary);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)dwintent;
    (void)pps2colorrenderingdictionary;
    (void)pcbps2colorrenderingdictionary;
    (void)pbbinary;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingIntent(int64_t hprofile, uint32_t dwintent, void* pbuffer, void* pcbps2colorrenderingintent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPS2ColorRenderingIntent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, dwintent, pbuffer, pcbps2colorrenderingintent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)dwintent;
    (void)pbuffer;
    (void)pcbps2colorrenderingintent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getPS2ColorSpaceArray(int64_t hprofile, uint32_t dwintent, uint32_t dwcsatype, void* pps2colorspacearray, void* pcbps2colorspacearray, void* pbbinary) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPS2ColorSpaceArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, dwintent, dwcsatype, pps2colorspacearray, pcbps2colorspacearray, pbbinary);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)dwintent;
    (void)dwcsatype;
    (void)pps2colorspacearray;
    (void)pcbps2colorspacearray;
    (void)pbbinary;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileA(void* pmachinename, uint32_t dwscs, void* pbuffer, void* pcbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStandardColorSpaceProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, dwscs, pbuffer, pcbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)dwscs;
    (void)pbuffer;
    (void)pcbsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileW(void* pmachinename, uint32_t dwscs, void* pbuffer, void* pcbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStandardColorSpaceProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, dwscs, pbuffer, pcbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)dwscs;
    (void)pbuffer;
    (void)pcbsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_installColorProfileA(void* pmachinename, void* pprofilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallColorProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, pprofilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_installColorProfileW(void* pmachinename, void* pprofilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallColorProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, pprofilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_isColorProfileTagPresent(int64_t hprofile, uint32_t tag, void* pbpresent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsColorProfileTagPresent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, tag, pbpresent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)tag;
    (void)pbpresent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_isColorProfileValid(int64_t hprofile, void* pbvalid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsColorProfileValid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, pbvalid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)pbvalid;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_openColorProfileA(void* pprofile, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwcreationmode) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenColorProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprofile, dwdesiredaccess, dwsharemode, dwcreationmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprofile;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_openColorProfileW(void* pprofile, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwcreationmode) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenColorProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprofile, dwdesiredaccess, dwsharemode, dwcreationmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprofile;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_registerCMMA(void* pmachinename, uint32_t cmmid, void* pcmmdll) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterCMMA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, cmmid, pcmmdll);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)cmmid;
    (void)pcmmdll;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_registerCMMW(void* pmachinename, uint32_t cmmid, void* pcmmdll) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterCMMW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, cmmid, pcmmdll);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)cmmid;
    (void)pcmmdll;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_selectCMM(uint32_t dwcmmtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectCMM");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcmmtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcmmtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setColorProfileElement(int64_t hprofile, uint32_t tag, uint32_t dwoffset, void* pcbelement, void* pelement) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorProfileElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, tag, dwoffset, pcbelement, pelement);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)tag;
    (void)dwoffset;
    (void)pcbelement;
    (void)pelement;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setColorProfileElementReference(int64_t hprofile, uint32_t newtag, uint32_t reftag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorProfileElementReference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, newtag, reftag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)newtag;
    (void)reftag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setColorProfileElementSize(int64_t hprofile, uint32_t tagtype, uint32_t pcbelement) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorProfileElementSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, tagtype, pcbelement);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)tagtype;
    (void)pcbelement;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setColorProfileHeader(int64_t hprofile, void* pheader) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorProfileHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprofile, pheader);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprofile;
    (void)pheader;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_colorsystem_setColorSpace(void* hdc, void* hcs) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetColorSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hcs);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdc;
    (void)hcs;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setDeviceGammaRamp(void* hdc, void* lpramp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDeviceGammaRamp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpramp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpramp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setICMMode(void* hdc, int32_t mode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetICMMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setICMProfileA(void* hdc, void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetICMProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setICMProfileW(void* hdc, void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetICMProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileA(void* pmachinename, uint32_t dwprofileid, void* pprofilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStandardColorSpaceProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, dwprofileid, pprofilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)dwprofileid;
    (void)pprofilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileW(void* pmachinename, uint32_t dwprofileid, void* pprofilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStandardColorSpaceProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, dwprofileid, pprofilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)dwprofileid;
    (void)pprofilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setupColorMatchingA(void* pcms) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icmui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupColorMatchingA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcms);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcms;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_setupColorMatchingW(void* pcms) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icmui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupColorMatchingW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcms);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcms;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_translateBitmapBits(int64_t hcolortransform, void* psrcbits, int32_t bminput, uint32_t dwwidth, uint32_t dwheight, uint32_t dwinputstride, void* pdestbits, int32_t bmoutput, uint32_t dwoutputstride, void* pfncallback, int64_t ulcallbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, uint32_t, uint32_t, uint32_t, void*, int32_t, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateBitmapBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcolortransform, psrcbits, bminput, dwwidth, dwheight, dwinputstride, pdestbits, bmoutput, dwoutputstride, pfncallback, ulcallbackdata);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_translateColors(int64_t hcolortransform, void* painputcolors, uint32_t ncolors, int32_t ctinput, void* paoutputcolors, int32_t ctoutput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateColors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcolortransform, painputcolors, ncolors, ctinput, paoutputcolors, ctoutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcolortransform;
    (void)painputcolors;
    (void)ncolors;
    (void)ctinput;
    (void)paoutputcolors;
    (void)ctoutput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_uninstallColorProfileA(void* pmachinename, void* pprofilename, int32_t bdelete) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UninstallColorProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, pprofilename, bdelete);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)bdelete;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_uninstallColorProfileW(void* pmachinename, void* pprofilename, int32_t bdelete) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UninstallColorProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, pprofilename, bdelete);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)pprofilename;
    (void)bdelete;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_unregisterCMMA(void* pmachinename, uint32_t cmmid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterCMMA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, cmmid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)cmmid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_unregisterCMMW(void* pmachinename, uint32_t cmmid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterCMMW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pmachinename, cmmid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pmachinename;
    (void)cmmid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_updateICMRegKeyA(uint32_t reserved, void* lpszcmid, void* lpszfilename, uint32_t command) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateICMRegKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, lpszcmid, lpszfilename, command);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reserved;
    (void)lpszcmid;
    (void)lpszfilename;
    (void)command;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_updateICMRegKeyW(uint32_t reserved, void* lpszcmid, void* lpszfilename, uint32_t command) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateICMRegKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, lpszcmid, lpszfilename, command);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reserved;
    (void)lpszcmid;
    (void)lpszfilename;
    (void)command;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsAssociateColorProfileWithDevice(int32_t scope, void* pprofilename, void* pdevicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsAssociateColorProfileWithDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scope, pprofilename, pdevicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)scope;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsCheckColors(int64_t hcolortransform, uint32_t ncolors, uint32_t ninputchannels, int32_t cdtinput, uint32_t cbinput, void* pinputdata, void* paresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsCheckColors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcolortransform, ncolors, ninputchannels, cdtinput, cbinput, pinputdata, paresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcolortransform;
    (void)ncolors;
    (void)ninputchannels;
    (void)cdtinput;
    (void)cbinput;
    (void)pinputdata;
    (void)paresult;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_wcsCreateIccProfile(int64_t hwcsprofile, uint32_t dwoptions) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsCreateIccProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwcsprofile, dwoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwcsprofile;
    (void)dwoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsDisassociateColorProfileFromDevice(int32_t scope, void* pprofilename, void* pdevicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsDisassociateColorProfileFromDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scope, pprofilename, pdevicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)scope;
    (void)pprofilename;
    (void)pdevicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfiles(int32_t scope, void* penumrecord, void* pbuffer, uint32_t dwsize, void* pnprofiles) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsEnumColorProfiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scope, penumrecord, pbuffer, dwsize, pnprofiles);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)scope;
    (void)penumrecord;
    (void)pbuffer;
    (void)dwsize;
    (void)pnprofiles;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfilesSize(int32_t scope, void* penumrecord, void* pdwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsEnumColorProfilesSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scope, penumrecord, pdwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)scope;
    (void)penumrecord;
    (void)pdwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsGetCalibrationManagementState(void* pbisenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsGetCalibrationManagementState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbisenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbisenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfile(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, uint32_t cbprofilename, void* pprofilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsGetDefaultColorProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scope, pdevicename, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, cbprofilename, pprofilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)scope;
    (void)pdevicename;
    (void)cptcolorprofiletype;
    (void)cpstcolorprofilesubtype;
    (void)dwprofileid;
    (void)cbprofilename;
    (void)pprofilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfileSize(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, void* pcbprofilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsGetDefaultColorProfileSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scope, pdevicename, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, pcbprofilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)scope;
    (void)pdevicename;
    (void)cptcolorprofiletype;
    (void)cpstcolorprofilesubtype;
    (void)dwprofileid;
    (void)pcbprofilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsGetDefaultRenderingIntent(int32_t scope, void* pdwrenderingintent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsGetDefaultRenderingIntent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scope, pdwrenderingintent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)scope;
    (void)pdwrenderingintent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsGetUsePerUserProfiles(void* pdevicename, uint32_t dwdeviceclass, void* puseperuserprofiles) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsGetUsePerUserProfiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdevicename, dwdeviceclass, puseperuserprofiles);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdevicename;
    (void)dwdeviceclass;
    (void)puseperuserprofiles;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileA(void* pcdmpprofile, void* pcampprofile, void* pgmmpprofile, uint32_t dwdesireaccess, uint32_t dwsharemode, uint32_t dwcreationmode, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsOpenColorProfileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcdmpprofile, pcampprofile, pgmmpprofile, dwdesireaccess, dwsharemode, dwcreationmode, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcdmpprofile;
    (void)pcampprofile;
    (void)pgmmpprofile;
    (void)dwdesireaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileW(void* pcdmpprofile, void* pcampprofile, void* pgmmpprofile, uint32_t dwdesireaccess, uint32_t dwsharemode, uint32_t dwcreationmode, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsOpenColorProfileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcdmpprofile, pcampprofile, pgmmpprofile, dwdesireaccess, dwsharemode, dwcreationmode, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcdmpprofile;
    (void)pcampprofile;
    (void)pgmmpprofile;
    (void)dwdesireaccess;
    (void)dwsharemode;
    (void)dwcreationmode;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsSetCalibrationManagementState(int32_t bisenabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsSetCalibrationManagementState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bisenabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bisenabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsSetDefaultColorProfile(int32_t scope, void* pdevicename, int32_t cptcolorprofiletype, int32_t cpstcolorprofilesubtype, uint32_t dwprofileid, void* pprofilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsSetDefaultColorProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scope, pdevicename, cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, pprofilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)scope;
    (void)pdevicename;
    (void)cptcolorprofiletype;
    (void)cpstcolorprofilesubtype;
    (void)dwprofileid;
    (void)pprofilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsSetDefaultRenderingIntent(int32_t scope, uint32_t dwrenderingintent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsSetDefaultRenderingIntent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scope, dwrenderingintent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)scope;
    (void)dwrenderingintent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsSetUsePerUserProfiles(void* pdevicename, uint32_t dwdeviceclass, int32_t useperuserprofiles) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsSetUsePerUserProfiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdevicename, dwdeviceclass, useperuserprofiles);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdevicename;
    (void)dwdeviceclass;
    (void)useperuserprofiles;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_colorsystem_wcsTranslateColors(int64_t hcolortransform, uint32_t ncolors, uint32_t ninputchannels, int32_t cdtinput, uint32_t cbinput, void* pinputdata, uint32_t noutputchannels, int32_t cdtoutput, uint32_t cboutput, void* poutputdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, int32_t, uint32_t, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mscms.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WcsTranslateColors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcolortransform, ncolors, ninputchannels, cdtinput, cbinput, pinputdata, noutputchannels, cdtoutput, cboutput, poutputdata);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

