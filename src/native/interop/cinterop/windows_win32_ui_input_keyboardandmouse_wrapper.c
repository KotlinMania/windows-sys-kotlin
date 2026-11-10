#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_input_keyboardandmouse_wrapper.h"
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

void* windowssys_windows_win32_ui_input_keyboardandmouse_activateKeyboardLayout(void* hkl, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ActivateKeyboardLayout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkl, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hkl;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_blockInput(int32_t fblockit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BlockInput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fblockit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fblockit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_enableWindow(void* hwnd, int32_t benable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, benable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)benable;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_input_keyboardandmouse_getActiveWindow(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveWindow");
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

int16_t windowssys_windows_win32_ui_input_keyboardandmouse_getAsyncKeyState(int32_t vkey) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAsyncKeyState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vkey;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_input_keyboardandmouse_getCapture(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCapture");
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

uint32_t windowssys_windows_win32_ui_input_keyboardandmouse_getDoubleClickTime(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDoubleClickTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_input_keyboardandmouse_getFocus(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFocus");
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

uint32_t windowssys_windows_win32_ui_input_keyboardandmouse_getKBCodePage(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKBCodePage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextA(int32_t lparam, void* lpstring, int32_t cchsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyNameTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lparam, lpstring, cchsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lparam;
    (void)lpstring;
    (void)cchsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_getKeyNameTextW(int32_t lparam, void* lpstring, int32_t cchsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyNameTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lparam, lpstring, cchsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lparam;
    (void)lpstring;
    (void)cchsize;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssys_windows_win32_ui_input_keyboardandmouse_getKeyState(int32_t nvirtkey) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nvirtkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nvirtkey;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayout(uint32_t idthread) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardLayout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idthread);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)idthread;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutList(int32_t nbuff, void* lplist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardLayoutList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nbuff, lplist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nbuff;
    (void)lplist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameA(void* pwszklid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardLayoutNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszklid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszklid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardLayoutNameW(void* pwszklid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardLayoutNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszklid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszklid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardState(void* lpkeystate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpkeystate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpkeystate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_getKeyboardType(int32_t ntypeflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyboardType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ntypeflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ntypeflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_getLastInputInfo(void* plii) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLastInputInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plii);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plii;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_getMouseMovePointsEx(uint32_t cbsize, void* lppt, void* lpptbuf, int32_t nbufpoints, uint32_t resolution) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMouseMovePointsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cbsize, lppt, lpptbuf, nbufpoints, resolution);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cbsize;
    (void)lppt;
    (void)lpptbuf;
    (void)nbufpoints;
    (void)resolution;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_isWindowEnabled(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWindowEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutA(void* pwszklid, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadKeyboardLayoutA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszklid, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pwszklid;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_input_keyboardandmouse_loadKeyboardLayoutW(void* pwszklid, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadKeyboardLayoutW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszklid, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pwszklid;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyA(uint32_t ucode, uint32_t umaptype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapVirtualKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucode, umaptype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ucode;
    (void)umaptype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExA(uint32_t ucode, uint32_t umaptype, void* dwhkl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapVirtualKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucode, umaptype, dwhkl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ucode;
    (void)umaptype;
    (void)dwhkl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyExW(uint32_t ucode, uint32_t umaptype, void* dwhkl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapVirtualKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucode, umaptype, dwhkl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ucode;
    (void)umaptype;
    (void)dwhkl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_input_keyboardandmouse_mapVirtualKeyW(uint32_t ucode, uint32_t umaptype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapVirtualKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucode, umaptype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ucode;
    (void)umaptype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_input_keyboardandmouse_oemKeyScan(uint16_t woemchar) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OemKeyScan");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(woemchar);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)woemchar;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_registerHotKey(void* hwnd, int32_t id, uint32_t fsmodifiers, uint32_t vk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterHotKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, id, fsmodifiers, vk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)id;
    (void)fsmodifiers;
    (void)vk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_releaseCapture(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseCapture");
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

uint32_t windowssys_windows_win32_ui_input_keyboardandmouse_sendInput(uint32_t cinputs, void* pinputs, int32_t cbsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendInput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cinputs, pinputs, cbsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cinputs;
    (void)pinputs;
    (void)cbsize;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_input_keyboardandmouse_setActiveWindow(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetActiveWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_input_keyboardandmouse_setCapture(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCapture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_setDoubleClickTime(uint32_t param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDoubleClickTime");
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

void* windowssys_windows_win32_ui_input_keyboardandmouse_setFocus(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFocus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_setKeyboardState(void* lpkeystate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetKeyboardState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpkeystate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpkeystate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_swapMouseButton(int32_t fswap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwapMouseButton");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fswap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fswap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_toAscii(uint32_t uvirtkey, uint32_t uscancode, void* lpkeystate, void* lpchar, uint32_t uflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ToAscii");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uvirtkey, uscancode, lpkeystate, lpchar, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uvirtkey;
    (void)uscancode;
    (void)lpkeystate;
    (void)lpchar;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_toAsciiEx(uint32_t uvirtkey, uint32_t uscancode, void* lpkeystate, void* lpchar, uint32_t uflags, void* dwhkl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ToAsciiEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uvirtkey, uscancode, lpkeystate, lpchar, uflags, dwhkl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uvirtkey;
    (void)uscancode;
    (void)lpkeystate;
    (void)lpchar;
    (void)uflags;
    (void)dwhkl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_toUnicode(uint32_t wvirtkey, uint32_t wscancode, void* lpkeystate, void* pwszbuff, int32_t cchbuff, uint32_t wflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ToUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wvirtkey, wscancode, lpkeystate, pwszbuff, cchbuff, wflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wvirtkey;
    (void)wscancode;
    (void)lpkeystate;
    (void)pwszbuff;
    (void)cchbuff;
    (void)wflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_toUnicodeEx(uint32_t wvirtkey, uint32_t wscancode, void* lpkeystate, void* pwszbuff, int32_t cchbuff, uint32_t wflags, void* dwhkl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ToUnicodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wvirtkey, wscancode, lpkeystate, pwszbuff, cchbuff, wflags, dwhkl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wvirtkey;
    (void)wscancode;
    (void)lpkeystate;
    (void)pwszbuff;
    (void)cchbuff;
    (void)wflags;
    (void)dwhkl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_trackMouseEvent(void* lpeventtrack) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TrackMouseEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpeventtrack);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpeventtrack;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_unloadKeyboardLayout(void* hkl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnloadKeyboardLayout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_input_keyboardandmouse_unregisterHotKey(void* hwnd, int32_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterHotKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanA(int8_t ch) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VkKeyScanA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExA(int8_t ch, void* dwhkl) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VkKeyScanExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch, dwhkl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    (void)dwhkl;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanExW(uint16_t ch, void* dwhkl) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VkKeyScanExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch, dwhkl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    (void)dwhkl;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssys_windows_win32_ui_input_keyboardandmouse_vkKeyScanW(uint16_t ch) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VkKeyScanW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_input_keyboardandmouse_keybdEvent(uint8_t bvk, uint8_t bscan, uint32_t dwflags, uint64_t dwextrainfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "keybd_event");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bvk, bscan, dwflags, dwextrainfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)bvk;
    (void)bscan;
    (void)dwflags;
    (void)dwextrainfo;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_ui_input_keyboardandmouse_mouseEvent(uint32_t dwflags, int32_t dx, int32_t dy, int32_t dwdata, uint64_t dwextrainfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mouse_event");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwflags, dx, dy, dwdata, dwextrainfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwflags;
    (void)dx;
    (void)dy;
    (void)dwdata;
    (void)dwextrainfo;
    errno = ENOSYS;
#endif
}

