#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_graphics_opengl_wrapper.h"
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

int32_t windowssys_windows_win32_graphics_opengl_choosePixelFormat(void* hdc, void* ppfd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChoosePixelFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ppfd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ppfd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_describePixelFormat(void* hdc, int32_t ipixelformat, uint32_t nbytes, void* ppfd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DescribePixelFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, ipixelformat, nbytes, ppfd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)ipixelformat;
    (void)nbytes;
    (void)ppfd;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_graphics_opengl_getEnhMetaFilePixelFormat(void* hemf, uint32_t cbbuffer, void* ppfd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFilePixelFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hemf, cbbuffer, ppfd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hemf;
    (void)cbbuffer;
    (void)ppfd;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_getPixelFormat(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPixelFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_setPixelFormat(void* hdc, int32_t format, void* ppfd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPixelFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, format, ppfd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)format;
    (void)ppfd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_swapBuffers(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwapBuffers");
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

void windowssys_windows_win32_graphics_opengl_glAccum(uint32_t op, float value) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glAccum");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(op, value);
        return;
    }
    errno = ENOSYS;
#else
    (void)op;
    (void)value;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glAlphaFunc(uint32_t func, float ref) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glAlphaFunc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(func, ref);
        return;
    }
    errno = ENOSYS;
#else
    (void)func;
    (void)ref;
    errno = ENOSYS;
#endif
}

uint8_t windowssys_windows_win32_graphics_opengl_glAreTexturesResident(int32_t n, void* textures, void* residences) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glAreTexturesResident");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(n, textures, residences);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)n;
    (void)textures;
    (void)residences;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_graphics_opengl_glArrayElement(int32_t i) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glArrayElement");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(i);
        return;
    }
    errno = ENOSYS;
#else
    (void)i;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glBegin(uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glBegin");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glBindTexture(uint32_t target, uint32_t texture) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glBindTexture");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, texture);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)texture;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glBitmap(int32_t width, int32_t height, float xorig, float yorig, float xmove, float ymove, void* bitmap) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(width, height, xorig, yorig, xmove, ymove, bitmap);
        return;
    }
    errno = ENOSYS;
#else
    (void)width;
    (void)height;
    (void)xorig;
    (void)yorig;
    (void)xmove;
    (void)ymove;
    (void)bitmap;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glBlendFunc(uint32_t sfactor, uint32_t dfactor) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glBlendFunc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sfactor, dfactor);
        return;
    }
    errno = ENOSYS;
#else
    (void)sfactor;
    (void)dfactor;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glCallList(uint32_t list) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCallList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(list);
        return;
    }
    errno = ENOSYS;
#else
    (void)list;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glCallLists(int32_t n, uint32_t type, void* lists) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCallLists");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(n, type, lists);
        return;
    }
    errno = ENOSYS;
#else
    (void)n;
    (void)type;
    (void)lists;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glClear(uint32_t mask) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClear");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mask);
        return;
    }
    errno = ENOSYS;
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glClearAccum(float red, float green, float blue, float alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClearAccum");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glClearColor(float red, float green, float blue, float alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClearColor");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glClearDepth(double depth) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClearDepth");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(depth);
        return;
    }
    errno = ENOSYS;
#else
    (void)depth;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glClearIndex(float c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClearIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glClearStencil(int32_t s) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClearStencil");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glClipPlane(uint32_t plane, void* equation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClipPlane");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(plane, equation);
        return;
    }
    errno = ENOSYS;
#else
    (void)plane;
    (void)equation;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3b(int8_t red, int8_t green, int8_t blue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t, int8_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3b");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3bv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3bv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3d(double red, double green, double blue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3f(float red, float green, float blue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3i(int32_t red, int32_t green, int32_t blue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3s(int16_t red, int16_t green, int16_t blue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3ub(uint8_t red, uint8_t green, uint8_t blue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3ub");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3ubv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3ubv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3ui(uint32_t red, uint32_t green, uint32_t blue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3ui");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3uiv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3uiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3us(uint16_t red, uint16_t green, uint16_t blue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3us");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor3usv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3usv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4b(int8_t red, int8_t green, int8_t blue, int8_t alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t, int8_t, int8_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4b");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4bv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4bv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4d(double red, double green, double blue, double alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4f(float red, float green, float blue, float alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4i(int32_t red, int32_t green, int32_t blue, int32_t alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4s(int16_t red, int16_t green, int16_t blue, int16_t alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4ub(uint8_t red, uint8_t green, uint8_t blue, uint8_t alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4ub");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4ubv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4ubv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4ui(uint32_t red, uint32_t green, uint32_t blue, uint32_t alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4ui");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4uiv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4uiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4us(uint16_t red, uint16_t green, uint16_t blue, uint16_t alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t, uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4us");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColor4usv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4usv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColorMask(uint8_t red, uint8_t green, uint8_t blue, uint8_t alpha) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColorMask");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(red, green, blue, alpha);
        return;
    }
    errno = ENOSYS;
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColorMaterial(uint32_t face, uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColorMaterial");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(face, mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)face;
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glColorPointer(int32_t size, uint32_t type, int32_t stride, void* pointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColorPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(size, type, stride, pointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)size;
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glCopyPixels(int32_t x, int32_t y, int32_t width, int32_t height, uint32_t type) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCopyPixels");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, width, height, type);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)type;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glCopyTexImage1D(uint32_t target, int32_t level, uint32_t internalformat, int32_t x, int32_t y, int32_t width, int32_t border) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCopyTexImage1D");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, internalformat, x, y, width, border);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)internalformat;
    (void)x;
    (void)y;
    (void)width;
    (void)border;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glCopyTexImage2D(uint32_t target, int32_t level, uint32_t internalformat, int32_t x, int32_t y, int32_t width, int32_t height, int32_t border) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCopyTexImage2D");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, internalformat, x, y, width, height, border);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)internalformat;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)border;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glCopyTexSubImage1D(uint32_t target, int32_t level, int32_t xoffset, int32_t x, int32_t y, int32_t width) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCopyTexSubImage1D");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, xoffset, x, y, width);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)xoffset;
    (void)x;
    (void)y;
    (void)width;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glCopyTexSubImage2D(uint32_t target, int32_t level, int32_t xoffset, int32_t yoffset, int32_t x, int32_t y, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCopyTexSubImage2D");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, xoffset, yoffset, x, y, width, height);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)xoffset;
    (void)yoffset;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glCullFace(uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCullFace");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDeleteLists(uint32_t list, int32_t range) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDeleteLists");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(list, range);
        return;
    }
    errno = ENOSYS;
#else
    (void)list;
    (void)range;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDeleteTextures(int32_t n, void* textures) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDeleteTextures");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(n, textures);
        return;
    }
    errno = ENOSYS;
#else
    (void)n;
    (void)textures;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDepthFunc(uint32_t func) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDepthFunc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(func);
        return;
    }
    errno = ENOSYS;
#else
    (void)func;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDepthMask(uint8_t flag) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDepthMask");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(flag);
        return;
    }
    errno = ENOSYS;
#else
    (void)flag;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDepthRange(double znear, double zfar) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDepthRange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(znear, zfar);
        return;
    }
    errno = ENOSYS;
#else
    (void)znear;
    (void)zfar;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDisable(uint32_t cap) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDisable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cap);
        return;
    }
    errno = ENOSYS;
#else
    (void)cap;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDisableClientState(uint32_t array) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDisableClientState");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(array);
        return;
    }
    errno = ENOSYS;
#else
    (void)array;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDrawArrays(uint32_t mode, int32_t first, int32_t count) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDrawArrays");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode, first, count);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    (void)first;
    (void)count;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDrawBuffer(uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDrawBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDrawElements(uint32_t mode, int32_t count, uint32_t type, void* indices) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDrawElements");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode, count, type, indices);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    (void)count;
    (void)type;
    (void)indices;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glDrawPixels(int32_t width, int32_t height, uint32_t format, uint32_t type, void* pixels) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDrawPixels");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(width, height, format, type, pixels);
        return;
    }
    errno = ENOSYS;
#else
    (void)width;
    (void)height;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEdgeFlag(uint8_t flag) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEdgeFlag");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(flag);
        return;
    }
    errno = ENOSYS;
#else
    (void)flag;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEdgeFlagPointer(int32_t stride, void* pointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEdgeFlagPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(stride, pointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEdgeFlagv(void* flag) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEdgeFlagv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(flag);
        return;
    }
    errno = ENOSYS;
#else
    (void)flag;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEnable(uint32_t cap) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEnable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cap);
        return;
    }
    errno = ENOSYS;
#else
    (void)cap;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEnableClientState(uint32_t array) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEnableClientState");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(array);
        return;
    }
    errno = ENOSYS;
#else
    (void)array;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEnd(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEndList(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEndList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalCoord1d(double u) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord1d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(u);
        return;
    }
    errno = ENOSYS;
#else
    (void)u;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalCoord1dv(void* u) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord1dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(u);
        return;
    }
    errno = ENOSYS;
#else
    (void)u;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalCoord1f(float u) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord1f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(u);
        return;
    }
    errno = ENOSYS;
#else
    (void)u;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalCoord1fv(void* u) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord1fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(u);
        return;
    }
    errno = ENOSYS;
#else
    (void)u;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalCoord2d(double u, double v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord2d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(u, v);
        return;
    }
    errno = ENOSYS;
#else
    (void)u;
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalCoord2dv(void* u) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord2dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(u);
        return;
    }
    errno = ENOSYS;
#else
    (void)u;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalCoord2f(float u, float v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord2f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(u, v);
        return;
    }
    errno = ENOSYS;
#else
    (void)u;
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalCoord2fv(void* u) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord2fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(u);
        return;
    }
    errno = ENOSYS;
#else
    (void)u;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalMesh1(uint32_t mode, int32_t i1, int32_t i2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalMesh1");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode, i1, i2);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    (void)i1;
    (void)i2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalMesh2(uint32_t mode, int32_t i1, int32_t i2, int32_t j1, int32_t j2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalMesh2");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode, i1, i2, j1, j2);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    (void)i1;
    (void)i2;
    (void)j1;
    (void)j2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalPoint1(int32_t i) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalPoint1");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(i);
        return;
    }
    errno = ENOSYS;
#else
    (void)i;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glEvalPoint2(int32_t i, int32_t j) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalPoint2");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(i, j);
        return;
    }
    errno = ENOSYS;
#else
    (void)i;
    (void)j;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glFeedbackBuffer(int32_t size, uint32_t type, void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFeedbackBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(size, type, buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)size;
    (void)type;
    (void)buffer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glFinish(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFinish");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glFlush(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFlush");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glFogf(uint32_t pname, float param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFogf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glFogfv(uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFogfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glFogi(uint32_t pname, int32_t param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFogi");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glFogiv(uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFogiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glFrontFace(uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFrontFace");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glFrustum(double left, double right, double bottom, double top, double znear, double zfar) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFrustum");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(left, right, bottom, top, znear, zfar);
        return;
    }
    errno = ENOSYS;
#else
    (void)left;
    (void)right;
    (void)bottom;
    (void)top;
    (void)znear;
    (void)zfar;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_graphics_opengl_glGenLists(int32_t range) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGenLists");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(range);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)range;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGenTextures(int32_t n, void* textures) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGenTextures");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(n, textures);
        return;
    }
    errno = ENOSYS;
#else
    (void)n;
    (void)textures;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetBooleanv(uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetBooleanv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetClipPlane(uint32_t plane, void* equation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetClipPlane");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(plane, equation);
        return;
    }
    errno = ENOSYS;
#else
    (void)plane;
    (void)equation;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetDoublev(uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetDoublev");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_graphics_opengl_glGetError(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetError");
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

void windowssys_windows_win32_graphics_opengl_glGetFloatv(uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetFloatv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetIntegerv(uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetIntegerv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetLightfv(uint32_t light, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetLightfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(light, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetLightiv(uint32_t light, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetLightiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(light, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetMapdv(uint32_t target, uint32_t query, void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetMapdv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, query, v);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)query;
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetMapfv(uint32_t target, uint32_t query, void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetMapfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, query, v);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)query;
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetMapiv(uint32_t target, uint32_t query, void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetMapiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, query, v);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)query;
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetMaterialfv(uint32_t face, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetMaterialfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(face, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetMaterialiv(uint32_t face, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetMaterialiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(face, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetPixelMapfv(uint32_t map, void* values) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetPixelMapfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(map, values);
        return;
    }
    errno = ENOSYS;
#else
    (void)map;
    (void)values;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetPixelMapuiv(uint32_t map, void* values) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetPixelMapuiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(map, values);
        return;
    }
    errno = ENOSYS;
#else
    (void)map;
    (void)values;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetPixelMapusv(uint32_t map, void* values) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetPixelMapusv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(map, values);
        return;
    }
    errno = ENOSYS;
#else
    (void)map;
    (void)values;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetPointerv(uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetPointerv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetPolygonStipple(void* mask) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetPolygonStipple");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mask);
        return;
    }
    errno = ENOSYS;
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_graphics_opengl_glGetString(uint32_t name) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetTexEnvfv(uint32_t target, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexEnvfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetTexEnviv(uint32_t target, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexEnviv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetTexGendv(uint32_t coord, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexGendv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coord, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetTexGenfv(uint32_t coord, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexGenfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coord, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetTexGeniv(uint32_t coord, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexGeniv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coord, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetTexImage(uint32_t target, int32_t level, uint32_t format, uint32_t type, void* pixels) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexImage");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, format, type, pixels);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetTexLevelParameterfv(uint32_t target, int32_t level, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexLevelParameterfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetTexLevelParameteriv(uint32_t target, int32_t level, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexLevelParameteriv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetTexParameterfv(uint32_t target, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexParameterfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glGetTexParameteriv(uint32_t target, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexParameteriv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glHint(uint32_t target, uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glHint");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexMask(uint32_t mask) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexMask");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mask);
        return;
    }
    errno = ENOSYS;
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexPointer(uint32_t type, int32_t stride, void* pointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(type, stride, pointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexd(double c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexd");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexdv(void* c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexdv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexf(float c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexfv(void* c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexi(int32_t c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexi");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexiv(void* c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexs(int16_t c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexs");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexsv(void* c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexsv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexub(uint8_t c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexub");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glIndexubv(void* c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexubv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glInitNames(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glInitNames");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glInterleavedArrays(uint32_t format, int32_t stride, void* pointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glInterleavedArrays");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(format, stride, pointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)format;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

uint8_t windowssys_windows_win32_graphics_opengl_glIsEnabled(uint32_t cap) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIsEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cap);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cap;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_graphics_opengl_glIsList(uint32_t list) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIsList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(list);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)list;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_graphics_opengl_glIsTexture(uint32_t texture) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIsTexture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(texture);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)texture;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLightModelf(uint32_t pname, float param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightModelf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLightModelfv(uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightModelfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLightModeli(uint32_t pname, int32_t param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightModeli");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLightModeliv(uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightModeliv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLightf(uint32_t light, uint32_t pname, float param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(light, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)light;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLightfv(uint32_t light, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(light, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLighti(uint32_t light, uint32_t pname, int32_t param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLighti");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(light, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)light;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLightiv(uint32_t light, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(light, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLineStipple(int32_t factor, uint16_t pattern) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLineStipple");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(factor, pattern);
        return;
    }
    errno = ENOSYS;
#else
    (void)factor;
    (void)pattern;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLineWidth(float width) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLineWidth");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(width);
        return;
    }
    errno = ENOSYS;
#else
    (void)width;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glListBase(uint32_t base) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glListBase");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(base);
        return;
    }
    errno = ENOSYS;
#else
    (void)base;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLoadIdentity(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLoadIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLoadMatrixd(void* m) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLoadMatrixd");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(m);
        return;
    }
    errno = ENOSYS;
#else
    (void)m;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLoadMatrixf(void* m) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLoadMatrixf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(m);
        return;
    }
    errno = ENOSYS;
#else
    (void)m;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLoadName(uint32_t name) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLoadName");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(name);
        return;
    }
    errno = ENOSYS;
#else
    (void)name;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glLogicOp(uint32_t opcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLogicOp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(opcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)opcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMap1d(uint32_t target, double u1, double u2, int32_t stride, int32_t order, void* points) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, double, double, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMap1d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, u1, u2, stride, order, points);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)u1;
    (void)u2;
    (void)stride;
    (void)order;
    (void)points;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMap1f(uint32_t target, float u1, float u2, int32_t stride, int32_t order, void* points) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMap1f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, u1, u2, stride, order, points);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)u1;
    (void)u2;
    (void)stride;
    (void)order;
    (void)points;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMap2d(uint32_t target, double u1, double u2, int32_t ustride, int32_t uorder, double v1, double v2, int32_t vstride, int32_t vorder, void* points) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, double, double, int32_t, int32_t, double, double, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMap2d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)u1;
    (void)u2;
    (void)ustride;
    (void)uorder;
    (void)v1;
    (void)v2;
    (void)vstride;
    (void)vorder;
    (void)points;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMap2f(uint32_t target, float u1, float u2, int32_t ustride, int32_t uorder, float v1, float v2, int32_t vstride, int32_t vorder, void* points) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float, float, int32_t, int32_t, float, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMap2f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)u1;
    (void)u2;
    (void)ustride;
    (void)uorder;
    (void)v1;
    (void)v2;
    (void)vstride;
    (void)vorder;
    (void)points;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMapGrid1d(int32_t un, double u1, double u2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMapGrid1d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(un, u1, u2);
        return;
    }
    errno = ENOSYS;
#else
    (void)un;
    (void)u1;
    (void)u2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMapGrid1f(int32_t un, float u1, float u2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMapGrid1f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(un, u1, u2);
        return;
    }
    errno = ENOSYS;
#else
    (void)un;
    (void)u1;
    (void)u2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMapGrid2d(int32_t un, double u1, double u2, int32_t vn, double v1, double v2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, double, double, int32_t, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMapGrid2d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(un, u1, u2, vn, v1, v2);
        return;
    }
    errno = ENOSYS;
#else
    (void)un;
    (void)u1;
    (void)u2;
    (void)vn;
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMapGrid2f(int32_t un, float u1, float u2, int32_t vn, float v1, float v2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, float, float, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMapGrid2f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(un, u1, u2, vn, v1, v2);
        return;
    }
    errno = ENOSYS;
#else
    (void)un;
    (void)u1;
    (void)u2;
    (void)vn;
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMaterialf(uint32_t face, uint32_t pname, float param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMaterialf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(face, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)face;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMaterialfv(uint32_t face, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMaterialfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(face, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMateriali(uint32_t face, uint32_t pname, int32_t param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMateriali");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(face, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)face;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMaterialiv(uint32_t face, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMaterialiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(face, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMatrixMode(uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMatrixMode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMultMatrixd(void* m) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMultMatrixd");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(m);
        return;
    }
    errno = ENOSYS;
#else
    (void)m;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glMultMatrixf(void* m) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMultMatrixf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(m);
        return;
    }
    errno = ENOSYS;
#else
    (void)m;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNewList(uint32_t list, uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNewList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(list, mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)list;
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormal3b(int8_t nx, int8_t ny, int8_t nz) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t, int8_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3b");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nx, ny, nz);
        return;
    }
    errno = ENOSYS;
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormal3bv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3bv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormal3d(double nx, double ny, double nz) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nx, ny, nz);
        return;
    }
    errno = ENOSYS;
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormal3dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormal3f(float nx, float ny, float nz) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nx, ny, nz);
        return;
    }
    errno = ENOSYS;
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormal3fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormal3i(int32_t nx, int32_t ny, int32_t nz) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nx, ny, nz);
        return;
    }
    errno = ENOSYS;
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormal3iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormal3s(int16_t nx, int16_t ny, int16_t nz) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nx, ny, nz);
        return;
    }
    errno = ENOSYS;
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormal3sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glNormalPointer(uint32_t type, int32_t stride, void* pointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormalPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(type, stride, pointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glOrtho(double left, double right, double bottom, double top, double znear, double zfar) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glOrtho");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(left, right, bottom, top, znear, zfar);
        return;
    }
    errno = ENOSYS;
#else
    (void)left;
    (void)right;
    (void)bottom;
    (void)top;
    (void)znear;
    (void)zfar;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPassThrough(float token) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPassThrough");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(token);
        return;
    }
    errno = ENOSYS;
#else
    (void)token;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPixelMapfv(uint32_t map, int32_t mapsize, void* values) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelMapfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(map, mapsize, values);
        return;
    }
    errno = ENOSYS;
#else
    (void)map;
    (void)mapsize;
    (void)values;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPixelMapuiv(uint32_t map, int32_t mapsize, void* values) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelMapuiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(map, mapsize, values);
        return;
    }
    errno = ENOSYS;
#else
    (void)map;
    (void)mapsize;
    (void)values;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPixelMapusv(uint32_t map, int32_t mapsize, void* values) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelMapusv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(map, mapsize, values);
        return;
    }
    errno = ENOSYS;
#else
    (void)map;
    (void)mapsize;
    (void)values;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPixelStoref(uint32_t pname, float param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelStoref");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPixelStorei(uint32_t pname, int32_t param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelStorei");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPixelTransferf(uint32_t pname, float param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelTransferf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPixelTransferi(uint32_t pname, int32_t param1) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelTransferi");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pname, param1);
        return;
    }
    errno = ENOSYS;
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPixelZoom(float xfactor, float yfactor) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelZoom");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(xfactor, yfactor);
        return;
    }
    errno = ENOSYS;
#else
    (void)xfactor;
    (void)yfactor;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPointSize(float size) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPointSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(size);
        return;
    }
    errno = ENOSYS;
#else
    (void)size;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPolygonMode(uint32_t face, uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPolygonMode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(face, mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)face;
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPolygonOffset(float factor, float units) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPolygonOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(factor, units);
        return;
    }
    errno = ENOSYS;
#else
    (void)factor;
    (void)units;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPolygonStipple(void* mask) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPolygonStipple");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mask);
        return;
    }
    errno = ENOSYS;
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPopAttrib(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPopAttrib");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPopClientAttrib(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPopClientAttrib");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPopMatrix(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPopMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPopName(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPopName");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPrioritizeTextures(int32_t n, void* textures, void* priorities) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPrioritizeTextures");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(n, textures, priorities);
        return;
    }
    errno = ENOSYS;
#else
    (void)n;
    (void)textures;
    (void)priorities;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPushAttrib(uint32_t mask) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPushAttrib");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mask);
        return;
    }
    errno = ENOSYS;
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPushClientAttrib(uint32_t mask) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPushClientAttrib");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mask);
        return;
    }
    errno = ENOSYS;
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPushMatrix(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPushMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glPushName(uint32_t name) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPushName");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(name);
        return;
    }
    errno = ENOSYS;
#else
    (void)name;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos2d(double x, double y) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos2dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos2f(float x, float y) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos2fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos2i(int32_t x, int32_t y) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos2iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos2s(int16_t x, int16_t y) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos2sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos3d(double x, double y, double z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos3dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos3f(float x, float y, float z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos3fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos3i(int32_t x, int32_t y, int32_t z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos3iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos3s(int16_t x, int16_t y, int16_t z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos3sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos4d(double x, double y, double z, double w) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z, w);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos4dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos4f(float x, float y, float z, float w) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z, w);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos4fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos4i(int32_t x, int32_t y, int32_t z, int32_t w) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z, w);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos4iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos4s(int16_t x, int16_t y, int16_t z, int16_t w) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z, w);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRasterPos4sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glReadBuffer(uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glReadBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glReadPixels(int32_t x, int32_t y, int32_t width, int32_t height, uint32_t format, uint32_t type, void* pixels) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glReadPixels");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, width, height, format, type, pixels);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRectd(double x1, double y1, double x2, double y2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectd");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x1, y1, x2, y2);
        return;
    }
    errno = ENOSYS;
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRectdv(void* v1, void* v2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectdv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v1, v2);
        return;
    }
    errno = ENOSYS;
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRectf(float x1, float y1, float x2, float y2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x1, y1, x2, y2);
        return;
    }
    errno = ENOSYS;
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRectfv(void* v1, void* v2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v1, v2);
        return;
    }
    errno = ENOSYS;
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRecti(int32_t x1, int32_t y1, int32_t x2, int32_t y2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRecti");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x1, y1, x2, y2);
        return;
    }
    errno = ENOSYS;
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRectiv(void* v1, void* v2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectiv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v1, v2);
        return;
    }
    errno = ENOSYS;
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRects(int16_t x1, int16_t y1, int16_t x2, int16_t y2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRects");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x1, y1, x2, y2);
        return;
    }
    errno = ENOSYS;
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRectsv(void* v1, void* v2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectsv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v1, v2);
        return;
    }
    errno = ENOSYS;
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_glRenderMode(uint32_t mode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRenderMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRotated(double angle, double x, double y, double z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRotated");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(angle, x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)angle;
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glRotatef(float angle, float x, float y, float z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRotatef");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(angle, x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)angle;
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glScaled(double x, double y, double z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glScaled");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glScalef(float x, float y, float z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glScalef");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glScissor(int32_t x, int32_t y, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glScissor");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, width, height);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glSelectBuffer(int32_t size, void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glSelectBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(size, buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)size;
    (void)buffer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glShadeModel(uint32_t mode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glShadeModel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mode);
        return;
    }
    errno = ENOSYS;
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glStencilFunc(uint32_t func, int32_t ref, uint32_t mask) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glStencilFunc");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(func, ref, mask);
        return;
    }
    errno = ENOSYS;
#else
    (void)func;
    (void)ref;
    (void)mask;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glStencilMask(uint32_t mask) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glStencilMask");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(mask);
        return;
    }
    errno = ENOSYS;
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glStencilOp(uint32_t fail, uint32_t zfail, uint32_t zpass) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glStencilOp");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fail, zfail, zpass);
        return;
    }
    errno = ENOSYS;
#else
    (void)fail;
    (void)zfail;
    (void)zpass;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord1d(double s) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord1dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord1f(float s) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord1fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord1i(int32_t s) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord1iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord1s(int16_t s) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord1sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord2d(double s, double t) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord2dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord2f(float s, float t) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord2fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord2i(int32_t s, int32_t t) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord2iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord2s(int16_t s, int16_t t) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord2sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord3d(double s, double t, double r) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t, r);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord3dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord3f(float s, float t, float r) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t, r);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord3fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord3i(int32_t s, int32_t t, int32_t r) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t, r);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord3iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord3s(int16_t s, int16_t t, int16_t r) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t, r);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord3sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord4d(double s, double t, double r, double q) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t, r, q);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord4dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord4f(float s, float t, float r, float q) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t, r, q);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord4fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord4i(int32_t s, int32_t t, int32_t r, int32_t q) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t, r, q);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord4iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord4s(int16_t s, int16_t t, int16_t r, int16_t q) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(s, t, r, q);
        return;
    }
    errno = ENOSYS;
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoord4sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexCoordPointer(int32_t size, uint32_t type, int32_t stride, void* pointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoordPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(size, type, stride, pointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)size;
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexEnvf(uint32_t target, uint32_t pname, float param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexEnvf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexEnvfv(uint32_t target, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexEnvfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexEnvi(uint32_t target, uint32_t pname, int32_t param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexEnvi");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexEnviv(uint32_t target, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexEnviv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexGend(uint32_t coord, uint32_t pname, double param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGend");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coord, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)coord;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexGendv(uint32_t coord, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGendv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coord, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexGenf(uint32_t coord, uint32_t pname, float param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGenf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coord, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)coord;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexGenfv(uint32_t coord, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGenfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coord, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexGeni(uint32_t coord, uint32_t pname, int32_t param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGeni");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coord, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)coord;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexGeniv(uint32_t coord, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGeniv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coord, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexImage1D(uint32_t target, int32_t level, int32_t internalformat, int32_t width, int32_t border, uint32_t format, uint32_t type, void* pixels) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexImage1D");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, internalformat, width, border, format, type, pixels);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)internalformat;
    (void)width;
    (void)border;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexImage2D(uint32_t target, int32_t level, int32_t internalformat, int32_t width, int32_t height, int32_t border, uint32_t format, uint32_t type, void* pixels) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexImage2D");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, internalformat, width, height, border, format, type, pixels);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)internalformat;
    (void)width;
    (void)height;
    (void)border;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexParameterf(uint32_t target, uint32_t pname, float param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexParameterf");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexParameterfv(uint32_t target, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexParameterfv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexParameteri(uint32_t target, uint32_t pname, int32_t param2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexParameteri");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, param2);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexParameteriv(uint32_t target, uint32_t pname, void* params) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexParameteriv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, pname, params);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexSubImage1D(uint32_t target, int32_t level, int32_t xoffset, int32_t width, uint32_t format, uint32_t type, void* pixels) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexSubImage1D");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, xoffset, width, format, type, pixels);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)xoffset;
    (void)width;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTexSubImage2D(uint32_t target, int32_t level, int32_t xoffset, int32_t yoffset, int32_t width, int32_t height, uint32_t format, uint32_t type, void* pixels) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexSubImage2D");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(target, level, xoffset, yoffset, width, height, format, type, pixels);
        return;
    }
    errno = ENOSYS;
#else
    (void)target;
    (void)level;
    (void)xoffset;
    (void)yoffset;
    (void)width;
    (void)height;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTranslated(double x, double y, double z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTranslated");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glTranslatef(float x, float y, float z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTranslatef");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex2d(double x, double y) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex2dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex2f(float x, float y) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex2fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex2i(int32_t x, int32_t y) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex2iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex2s(int16_t x, int16_t y) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex2sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex3d(double x, double y, double z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex3dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex3f(float x, float y, float z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex3fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex3i(int32_t x, int32_t y, int32_t z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex3iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex3s(int16_t x, int16_t y, int16_t z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex3sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex4d(double x, double y, double z, double w) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4d");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z, w);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex4dv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4dv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex4f(float x, float y, float z, float w) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4f");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z, w);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex4fv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4fv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex4i(int32_t x, int32_t y, int32_t z, int32_t w) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4i");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z, w);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex4iv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4iv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex4s(int16_t x, int16_t y, int16_t z, int16_t w) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4s");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, z, w);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertex4sv(void* v) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4sv");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(v);
        return;
    }
    errno = ENOSYS;
#else
    (void)v;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glVertexPointer(int32_t size, uint32_t type, int32_t stride, void* pointer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertexPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(size, type, stride, pointer);
        return;
    }
    errno = ENOSYS;
#else
    (void)size;
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_glViewport(int32_t x, int32_t y, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glViewport");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, width, height);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluBeginCurve(void* nobj) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBeginCurve");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluBeginPolygon(void* tess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBeginPolygon");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluBeginSurface(void* nobj) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBeginSurface");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluBeginTrim(void* nobj) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBeginTrim");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_gluBuild1DMipmaps(uint32_t target, int32_t components, int32_t width, uint32_t format, uint32_t type, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBuild1DMipmaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(target, components, width, format, type, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)target;
    (void)components;
    (void)width;
    (void)format;
    (void)type;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_gluBuild2DMipmaps(uint32_t target, int32_t components, int32_t width, int32_t height, uint32_t format, uint32_t type, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBuild2DMipmaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(target, components, width, height, format, type, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)target;
    (void)components;
    (void)width;
    (void)height;
    (void)format;
    (void)type;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluCylinder(void* qobj, double baseradius, double topradius, double height, int32_t slices, int32_t stacks) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, double, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluCylinder");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(qobj, baseradius, topradius, height, slices, stacks);
        return;
    }
    errno = ENOSYS;
#else
    (void)qobj;
    (void)baseradius;
    (void)topradius;
    (void)height;
    (void)slices;
    (void)stacks;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluDeleteNurbsRenderer(void* nobj) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluDeleteNurbsRenderer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluDeleteQuadric(void* state) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluDeleteQuadric");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(state);
        return;
    }
    errno = ENOSYS;
#else
    (void)state;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluDeleteTess(void* tess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluDeleteTess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluDisk(void* qobj, double innerradius, double outerradius, int32_t slices, int32_t loops) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(qobj, innerradius, outerradius, slices, loops);
        return;
    }
    errno = ENOSYS;
#else
    (void)qobj;
    (void)innerradius;
    (void)outerradius;
    (void)slices;
    (void)loops;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluEndCurve(void* nobj) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluEndCurve");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluEndPolygon(void* tess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluEndPolygon");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluEndSurface(void* nobj) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluEndSurface");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluEndTrim(void* nobj) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluEndTrim");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_graphics_opengl_gluErrorString(uint32_t errcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluErrorString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)errcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_graphics_opengl_gluErrorUnicodeStringEXT(uint32_t errcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluErrorUnicodeStringEXT");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(errcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)errcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluGetNurbsProperty(void* nobj, uint32_t property, void* value) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluGetNurbsProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj, property, value);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    (void)property;
    (void)value;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_graphics_opengl_gluGetString(uint32_t name) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluGetString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluGetTessProperty(void* tess, uint32_t which, void* value) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluGetTessProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess, which, value);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    (void)which;
    (void)value;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluLoadSamplingMatrices(void* nobj, void* modelmatrix, void* projmatrix, void* viewport) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluLoadSamplingMatrices");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj, modelmatrix, projmatrix, viewport);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    (void)modelmatrix;
    (void)projmatrix;
    (void)viewport;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluLookAt(double eyex, double eyey, double eyez, double centerx, double centery, double centerz, double upx, double upy, double upz) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, double, double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluLookAt");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(eyex, eyey, eyez, centerx, centery, centerz, upx, upy, upz);
        return;
    }
    errno = ENOSYS;
#else
    (void)eyex;
    (void)eyey;
    (void)eyez;
    (void)centerx;
    (void)centery;
    (void)centerz;
    (void)upx;
    (void)upy;
    (void)upz;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_graphics_opengl_gluNewNurbsRenderer(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNewNurbsRenderer");
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

void* windowssys_windows_win32_graphics_opengl_gluNewQuadric(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNewQuadric");
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

void* windowssys_windows_win32_graphics_opengl_gluNewTess(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNewTess");
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

void windowssys_windows_win32_graphics_opengl_gluNextContour(void* tess, uint32_t type) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNextContour");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess, type);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    (void)type;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluNurbsCallback(void* nobj, uint32_t which, int64_t fn) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNurbsCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj, which, fn);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    (void)which;
    (void)fn;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluNurbsCurve(void* nobj, int32_t nknots, void* knot, int32_t stride, void* ctlarray, int32_t order, uint32_t type) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNurbsCurve");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj, nknots, knot, stride, ctlarray, order, type);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    (void)nknots;
    (void)knot;
    (void)stride;
    (void)ctlarray;
    (void)order;
    (void)type;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluNurbsProperty(void* nobj, uint32_t property, float value) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNurbsProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj, property, value);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    (void)property;
    (void)value;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluNurbsSurface(void* nobj, int32_t sknot_count, void* sknot, int32_t tknot_count, void* tknot, int32_t s_stride, int32_t t_stride, void* ctlarray, int32_t sorder, int32_t torder, uint32_t type) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNurbsSurface");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj, sknot_count, sknot, tknot_count, tknot, s_stride, t_stride, ctlarray, sorder, torder, type);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    (void)sknot_count;
    (void)sknot;
    (void)tknot_count;
    (void)tknot;
    (void)s_stride;
    (void)t_stride;
    (void)ctlarray;
    (void)sorder;
    (void)torder;
    (void)type;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluOrtho2D(double left, double right, double bottom, double top) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluOrtho2D");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(left, right, bottom, top);
        return;
    }
    errno = ENOSYS;
#else
    (void)left;
    (void)right;
    (void)bottom;
    (void)top;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluPartialDisk(void* qobj, double innerradius, double outerradius, int32_t slices, int32_t loops, double startangle, double sweepangle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, int32_t, int32_t, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluPartialDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(qobj, innerradius, outerradius, slices, loops, startangle, sweepangle);
        return;
    }
    errno = ENOSYS;
#else
    (void)qobj;
    (void)innerradius;
    (void)outerradius;
    (void)slices;
    (void)loops;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluPerspective(double fovy, double aspect, double znear, double zfar) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluPerspective");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fovy, aspect, znear, zfar);
        return;
    }
    errno = ENOSYS;
#else
    (void)fovy;
    (void)aspect;
    (void)znear;
    (void)zfar;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluPickMatrix(double x, double y, double width, double height, void* viewport) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluPickMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(x, y, width, height, viewport);
        return;
    }
    errno = ENOSYS;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)viewport;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_gluProject(double objx, double objy, double objz, void* modelmatrix, void* projmatrix, void* viewport, void* winx, void* winy, void* winz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, double, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluProject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objx, objy, objz, modelmatrix, projmatrix, viewport, winx, winy, winz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objx;
    (void)objy;
    (void)objz;
    (void)modelmatrix;
    (void)projmatrix;
    (void)viewport;
    (void)winx;
    (void)winy;
    (void)winz;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluPwlCurve(void* nobj, int32_t count, void* array, int32_t stride, uint32_t type) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluPwlCurve");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nobj, count, array, stride, type);
        return;
    }
    errno = ENOSYS;
#else
    (void)nobj;
    (void)count;
    (void)array;
    (void)stride;
    (void)type;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluQuadricCallback(void* qobj, uint32_t which, int64_t fn) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluQuadricCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(qobj, which, fn);
        return;
    }
    errno = ENOSYS;
#else
    (void)qobj;
    (void)which;
    (void)fn;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluQuadricDrawStyle(void* quadobject, uint32_t drawstyle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluQuadricDrawStyle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(quadobject, drawstyle);
        return;
    }
    errno = ENOSYS;
#else
    (void)quadobject;
    (void)drawstyle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluQuadricNormals(void* quadobject, uint32_t normals) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluQuadricNormals");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(quadobject, normals);
        return;
    }
    errno = ENOSYS;
#else
    (void)quadobject;
    (void)normals;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluQuadricOrientation(void* quadobject, uint32_t orientation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluQuadricOrientation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(quadobject, orientation);
        return;
    }
    errno = ENOSYS;
#else
    (void)quadobject;
    (void)orientation;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluQuadricTexture(void* quadobject, uint8_t texturecoords) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluQuadricTexture");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(quadobject, texturecoords);
        return;
    }
    errno = ENOSYS;
#else
    (void)quadobject;
    (void)texturecoords;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_gluScaleImage(uint32_t format, int32_t widthin, int32_t heightin, uint32_t typein, void* datain, int32_t widthout, int32_t heightout, uint32_t typeout, void* dataout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, uint32_t, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluScaleImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, widthin, heightin, typein, datain, widthout, heightout, typeout, dataout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)widthin;
    (void)heightin;
    (void)typein;
    (void)datain;
    (void)widthout;
    (void)heightout;
    (void)typeout;
    (void)dataout;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluSphere(void* qobj, double radius, int32_t slices, int32_t stacks) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluSphere");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(qobj, radius, slices, stacks);
        return;
    }
    errno = ENOSYS;
#else
    (void)qobj;
    (void)radius;
    (void)slices;
    (void)stacks;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluTessBeginContour(void* tess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessBeginContour");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluTessBeginPolygon(void* tess, void* polygon_data) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessBeginPolygon");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess, polygon_data);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    (void)polygon_data;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluTessCallback(void* tess, uint32_t which, int64_t fn) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess, which, fn);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    (void)which;
    (void)fn;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluTessEndContour(void* tess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessEndContour");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluTessEndPolygon(void* tess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessEndPolygon");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluTessNormal(void* tess, double x, double y, double z) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessNormal");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess, x, y, z);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluTessProperty(void* tess, uint32_t which, double value) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess, which, value);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    (void)which;
    (void)value;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_graphics_opengl_gluTessVertex(void* tess, void* coords, void* data) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessVertex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tess, coords, data);
        return;
    }
    errno = ENOSYS;
#else
    (void)tess;
    (void)coords;
    (void)data;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_gluUnProject(double winx, double winy, double winz, void* modelmatrix, void* projmatrix, void* viewport, void* objx, void* objy, void* objz) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, double, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluUnProject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(winx, winy, winz, modelmatrix, projmatrix, viewport, objx, objy, objz);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)winx;
    (void)winy;
    (void)winz;
    (void)modelmatrix;
    (void)projmatrix;
    (void)viewport;
    (void)objx;
    (void)objy;
    (void)objz;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_wglCopyContext(void* param0, void* param1, uint32_t param2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglCopyContext");
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

void* windowssys_windows_win32_graphics_opengl_wglCreateContext(void* param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglCreateContext");
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

void* windowssys_windows_win32_graphics_opengl_wglCreateLayerContext(void* param0, int32_t param1) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglCreateLayerContext");
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

int32_t windowssys_windows_win32_graphics_opengl_wglDeleteContext(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglDeleteContext");
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

int32_t windowssys_windows_win32_graphics_opengl_wglDescribeLayerPlane(void* param0, int32_t param1, int32_t param2, uint32_t param3, void* param4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglDescribeLayerPlane");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_opengl_wglGetCurrentContext(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglGetCurrentContext");
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

void* windowssys_windows_win32_graphics_opengl_wglGetCurrentDC(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglGetCurrentDC");
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

int32_t windowssys_windows_win32_graphics_opengl_wglGetLayerPaletteEntries(void* param0, int32_t param1, int32_t param2, int32_t param3, void* param4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglGetLayerPaletteEntries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_graphics_opengl_wglGetProcAddress(void* param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglGetProcAddress");
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

int32_t windowssys_windows_win32_graphics_opengl_wglMakeCurrent(void* param0, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglMakeCurrent");
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

int32_t windowssys_windows_win32_graphics_opengl_wglRealizeLayerPalette(void* param0, int32_t param1, int32_t param2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglRealizeLayerPalette");
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

int32_t windowssys_windows_win32_graphics_opengl_wglSetLayerPaletteEntries(void* param0, int32_t param1, int32_t param2, int32_t param3, void* param4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglSetLayerPaletteEntries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_wglShareLists(void* param0, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglShareLists");
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

int32_t windowssys_windows_win32_graphics_opengl_wglSwapLayerBuffers(void* param0, uint32_t param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglSwapLayerBuffers");
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

int32_t windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsA(void* param0, uint32_t param1, uint32_t param2, uint32_t param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglUseFontBitmapsA");
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

int32_t windowssys_windows_win32_graphics_opengl_wglUseFontBitmapsW(void* param0, uint32_t param1, uint32_t param2, uint32_t param3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglUseFontBitmapsW");
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

int32_t windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesA(void* param0, uint32_t param1, uint32_t param2, uint32_t param3, float param4, float param5, int32_t param6, void* param7) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, float, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglUseFontOutlinesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5, param6, param7);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_graphics_opengl_wglUseFontOutlinesW(void* param0, uint32_t param1, uint32_t param2, uint32_t param3, float param4, float param5, int32_t param6, void* param7) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, float, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglUseFontOutlinesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5, param6, param7);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    errno = ENOSYS;
    return -1;
#endif
}

