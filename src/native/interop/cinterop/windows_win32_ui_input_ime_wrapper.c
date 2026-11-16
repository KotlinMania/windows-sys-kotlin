#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_input_ime_wrapper.h"
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

void* windowssysWindowsWin32UiInputImeImmAssociateContext(void* param0, void* param1) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmAssociateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmAssociateContextEx(void* param0, void* param1, uint32_t param2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmAssociateContextEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmConfigureIMEA(void* param0, void* param1, uint32_t param2, void* param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmConfigureIMEA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmConfigureIMEW(void* param0, void* param1, uint32_t param2, void* param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmConfigureIMEW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32UiInputImeImmCreateContext(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmCreateContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32UiInputImeImmCreateIMCC(uint32_t param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmCreateIMCC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32UiInputImeImmCreateSoftKeyboard(uint32_t param0, void* param1, int32_t param2, int32_t param3) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmCreateSoftKeyboard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmDestroyContext(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDestroyContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32UiInputImeImmDestroyIMCC(void* param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDestroyIMCC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmDestroySoftKeyboard(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDestroySoftKeyboard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmDisableIME(uint32_t param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDisableIME");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmDisableLegacyIME(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDisableLegacyIME");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmDisableTextFrameService(uint32_t idthread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmDisableTextFrameService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idthread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idthread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmEnumInputContext(uint32_t idthread, void* lpfn, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmEnumInputContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idthread, lpfn, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idthread;
    (void)lpfn;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmEnumRegisterWordA(void* param0, void* param1, void* lpszreading, uint32_t param3, void* lpszregister, void* param5) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmEnumRegisterWordA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, lpszreading, param3, lpszregister, param5);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)lpszreading;
    (void)param3;
    (void)lpszregister;
    (void)param5;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmEnumRegisterWordW(void* param0, void* param1, void* lpszreading, uint32_t param3, void* lpszregister, void* param5) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmEnumRegisterWordW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, lpszreading, param3, lpszregister, param5);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)lpszreading;
    (void)param3;
    (void)lpszregister;
    (void)param5;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssysWindowsWin32UiInputImeImmEscapeA(void* param0, void* param1, uint32_t param2, void* param3) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmEscapeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWin32UiInputImeImmEscapeW(void* param0, void* param1, uint32_t param2, void* param3) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmEscapeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGenerateMessage(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGenerateMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetCandidateListA(void* param0, uint32_t deindex, void* lpcandlist, uint32_t dwbuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCandidateListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, deindex, lpcandlist, dwbuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)deindex;
    (void)lpcandlist;
    (void)dwbuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetCandidateListCountA(void* param0, void* lpdwlistcount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCandidateListCountA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpdwlistcount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)lpdwlistcount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetCandidateListCountW(void* param0, void* lpdwlistcount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCandidateListCountW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpdwlistcount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)lpdwlistcount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetCandidateListW(void* param0, uint32_t deindex, void* lpcandlist, uint32_t dwbuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCandidateListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, deindex, lpcandlist, dwbuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)deindex;
    (void)lpcandlist;
    (void)dwbuflen;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGetCandidateWindow(void* param0, uint32_t param1, void* lpcandidate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCandidateWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, lpcandidate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)lpcandidate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGetCompositionFontA(void* param0, void* lplf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCompositionFontA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lplf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lplf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGetCompositionFontW(void* param0, void* lplf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCompositionFontW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lplf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lplf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGetCompositionStringA(void* param0, uint32_t param1, void* lpbuf, uint32_t dwbuflen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCompositionStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, lpbuf, dwbuflen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)lpbuf;
    (void)dwbuflen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGetCompositionStringW(void* param0, uint32_t param1, void* lpbuf, uint32_t dwbuflen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCompositionStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, lpbuf, dwbuflen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)lpbuf;
    (void)dwbuflen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGetCompositionWindow(void* param0, void* lpcompform) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetCompositionWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpcompform);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpcompform;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32UiInputImeImmGetContext(void* param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetConversionListA(void* param0, void* param1, void* lpsrc, void* lpdst, uint32_t dwbuflen, uint32_t uflag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetConversionListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, lpsrc, lpdst, dwbuflen, uflag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)lpsrc;
    (void)lpdst;
    (void)dwbuflen;
    (void)uflag;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetConversionListW(void* param0, void* param1, void* lpsrc, void* lpdst, uint32_t dwbuflen, uint32_t uflag) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetConversionListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, lpsrc, lpdst, dwbuflen, uflag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)lpsrc;
    (void)lpdst;
    (void)dwbuflen;
    (void)uflag;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGetConversionStatus(void* param0, void* lpfdwconversion, void* lpfdwsentence) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetConversionStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpfdwconversion, lpfdwsentence);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpfdwconversion;
    (void)lpfdwsentence;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd(void* param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetDefaultIMEWnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetDescriptionA(void* param0, void* lpszdescription, uint32_t ubuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetDescriptionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpszdescription, ubuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)lpszdescription;
    (void)ubuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetDescriptionW(void* param0, void* lpszdescription, uint32_t ubuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetDescriptionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpszdescription, ubuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)lpszdescription;
    (void)ubuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetGuideLineA(void* param0, uint32_t dwindex, void* lpbuf, uint32_t dwbuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetGuideLineA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, dwindex, lpbuf, dwbuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)dwindex;
    (void)lpbuf;
    (void)dwbuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetGuideLineW(void* param0, uint32_t dwindex, void* lpbuf, uint32_t dwbuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetGuideLineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, dwindex, lpbuf, dwbuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)dwindex;
    (void)lpbuf;
    (void)dwbuflen;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGetHotKey(uint32_t param0, void* lpumodifiers, void* lpuvkey, void* phkl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetHotKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpumodifiers, lpuvkey, phkl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpumodifiers;
    (void)lpuvkey;
    (void)phkl;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetIMCCLockCount(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetIMCCLockCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetIMCCSize(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetIMCCSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetIMCLockCount(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetIMCLockCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetIMEFileNameA(void* param0, void* lpszfilename, uint32_t ubuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetIMEFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpszfilename, ubuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)lpszfilename;
    (void)ubuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetIMEFileNameW(void* param0, void* lpszfilename, uint32_t ubuflen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetIMEFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpszfilename, ubuflen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)lpszfilename;
    (void)ubuflen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetImeMenuItemsA(void* param0, uint32_t param1, uint32_t param2, void* lpimeparentmenu, void* lpimemenu, uint32_t dwsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetImeMenuItemsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, lpimeparentmenu, lpimemenu, dwsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)lpimeparentmenu;
    (void)lpimemenu;
    (void)dwsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetImeMenuItemsW(void* param0, uint32_t param1, uint32_t param2, void* lpimeparentmenu, void* lpimemenu, uint32_t dwsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetImeMenuItemsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, lpimeparentmenu, lpimemenu, dwsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)lpimeparentmenu;
    (void)lpimemenu;
    (void)dwsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGetOpenStatus(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetOpenStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetProperty(void* param0, uint32_t param1) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA(void* param0, uint32_t nitem, void* lpstylebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetRegisterWordStyleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, nitem, lpstylebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)nitem;
    (void)lpstylebuf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW(void* param0, uint32_t nitem, void* lpstylebuf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetRegisterWordStyleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, nitem, lpstylebuf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    (void)nitem;
    (void)lpstylebuf;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmGetStatusWindowPos(void* param0, void* lpptpos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetStatusWindowPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpptpos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpptpos;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32UiInputImeImmGetVirtualKey(void* param0) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmGetVirtualKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32UiInputImeImmInstallIMEA(void* lpszimefilename, void* lpszlayouttext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmInstallIMEA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszimefilename, lpszlayouttext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszimefilename;
    (void)lpszlayouttext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32UiInputImeImmInstallIMEW(void* lpszimefilename, void* lpszlayouttext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmInstallIMEW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszimefilename, lpszlayouttext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszimefilename;
    (void)lpszlayouttext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmIsIME(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmIsIME");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmIsUIMessageA(void* param0, uint32_t param1, uint64_t param2, int64_t param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmIsUIMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmIsUIMessageW(void* param0, uint32_t param1, uint64_t param2, int64_t param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmIsUIMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32UiInputImeImmLockIMC(void* param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmLockIMC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32UiInputImeImmLockIMCC(void* param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmLockIMCC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmNotifyIME(void* param0, uint32_t dwaction, uint32_t dwindex, uint32_t dwvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmNotifyIME");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, dwaction, dwindex, dwvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)dwaction;
    (void)dwindex;
    (void)dwvalue;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32UiInputImeImmReSizeIMCC(void* param0, uint32_t param1) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmReSizeIMCC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmRegisterWordA(void* param0, void* lpszreading, uint32_t param2, void* lpszregister) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmRegisterWordA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpszreading, param2, lpszregister);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpszreading;
    (void)param2;
    (void)lpszregister;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmRegisterWordW(void* param0, void* lpszreading, uint32_t param2, void* lpszregister) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmRegisterWordW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpszreading, param2, lpszregister);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpszreading;
    (void)param2;
    (void)lpszregister;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmReleaseContext(void* param0, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmReleaseContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWin32UiInputImeImmRequestMessageA(void* param0, uint64_t param1, int64_t param2) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmRequestMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWin32UiInputImeImmRequestMessageW(void* param0, uint64_t param1, int64_t param2) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmRequestMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSetCandidateWindow(void* param0, void* lpcandidate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCandidateWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpcandidate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpcandidate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSetCompositionFontA(void* param0, void* lplf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCompositionFontA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lplf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lplf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSetCompositionFontW(void* param0, void* lplf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCompositionFontW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lplf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lplf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSetCompositionStringA(void* param0, uint32_t dwindex, void* lpcomp, uint32_t dwcomplen, void* lpread, uint32_t dwreadlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCompositionStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, dwindex, lpcomp, dwcomplen, lpread, dwreadlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)dwindex;
    (void)lpcomp;
    (void)dwcomplen;
    (void)lpread;
    (void)dwreadlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSetCompositionStringW(void* param0, uint32_t dwindex, void* lpcomp, uint32_t dwcomplen, void* lpread, uint32_t dwreadlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCompositionStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, dwindex, lpcomp, dwcomplen, lpread, dwreadlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)dwindex;
    (void)lpcomp;
    (void)dwcomplen;
    (void)lpread;
    (void)dwreadlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSetCompositionWindow(void* param0, void* lpcompform) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetCompositionWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpcompform);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpcompform;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSetConversionStatus(void* param0, uint32_t param1, uint32_t param2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetConversionStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSetHotKey(uint32_t param0, uint32_t param1, uint32_t param2, void* param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetHotKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSetOpenStatus(void* param0, int32_t param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetOpenStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSetStatusWindowPos(void* param0, void* lpptpos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSetStatusWindowPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpptpos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpptpos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmShowSoftKeyboard(void* param0, int32_t param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmShowSoftKeyboard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmSimulateHotKey(void* param0, uint32_t param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmSimulateHotKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmUnlockIMC(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmUnlockIMC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmUnlockIMCC(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmUnlockIMCC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmUnregisterWordA(void* param0, void* lpszreading, uint32_t param2, void* lpszunregister) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmUnregisterWordA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpszreading, param2, lpszunregister);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpszreading;
    (void)param2;
    (void)lpszunregister;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInputImeImmUnregisterWordW(void* param0, void* lpszreading, uint32_t param2, void* lpszunregister) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImmUnregisterWordW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, lpszreading, param2, lpszunregister);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)lpszreading;
    (void)param2;
    (void)lpszunregister;
    errno = ENOSYS;
    return -1;
#endif
}

