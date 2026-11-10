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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1choosePixelFormat(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong ppfd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChoosePixelFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)ppfd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ppfd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1describePixelFormat(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint ipixelformat, jint nbytes, jlong ppfd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DescribePixelFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)ipixelformat, (uint32_t)nbytes, (void*)(uintptr_t)ppfd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)ipixelformat;
    (void)nbytes;
    (void)ppfd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1getEnhMetaFilePixelFormat(JNIEnv* km_env, jclass km_clazz, jlong hemf, jint cbbuffer, jlong ppfd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnhMetaFilePixelFormat");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hemf, (uint32_t)cbbuffer, (void*)(uintptr_t)ppfd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hemf;
    (void)cbbuffer;
    (void)ppfd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1getPixelFormat(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPixelFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1setPixelFormat(JNIEnv* km_env, jclass km_clazz, jlong hdc, jint format, jlong ppfd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPixelFormat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdc, (int32_t)format, (void*)(uintptr_t)ppfd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdc;
    (void)format;
    (void)ppfd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1swapBuffers(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwapBuffers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glAccum(JNIEnv* km_env, jclass km_clazz, jint op, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glAccum");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)op, (float)value);
    } else {
        errno = ENOSYS;
    }
#else
    (void)op;
    (void)value;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glAlphaFunc(JNIEnv* km_env, jclass km_clazz, jint func, jfloat ref) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glAlphaFunc");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)func, (float)ref);
    } else {
        errno = ENOSYS;
    }
#else
    (void)func;
    (void)ref;
    errno = ENOSYS;
#endif
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glAreTexturesResident(JNIEnv* km_env, jclass km_clazz, jint n, jlong textures, jlong residences) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glAreTexturesResident");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)n, (void*)(uintptr_t)textures, (void*)(uintptr_t)residences);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)n;
    (void)textures;
    (void)residences;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glArrayElement(JNIEnv* km_env, jclass km_clazz, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glArrayElement");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)i);
    } else {
        errno = ENOSYS;
    }
#else
    (void)i;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glBegin(JNIEnv* km_env, jclass km_clazz, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glBegin");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glBindTexture(JNIEnv* km_env, jclass km_clazz, jint target, jint texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glBindTexture");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)texture);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)texture;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glBitmap(JNIEnv* km_env, jclass km_clazz, jint width, jint height, jfloat xorig, jfloat yorig, jfloat xmove, jfloat ymove, jlong bitmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glBitmap");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)width, (int32_t)height, (float)xorig, (float)yorig, (float)xmove, (float)ymove, (void*)(uintptr_t)bitmap);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glBlendFunc(JNIEnv* km_env, jclass km_clazz, jint sfactor, jint dfactor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glBlendFunc");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)sfactor, (uint32_t)dfactor);
    } else {
        errno = ENOSYS;
    }
#else
    (void)sfactor;
    (void)dfactor;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glCallList(JNIEnv* km_env, jclass km_clazz, jint list) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCallList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)list);
    } else {
        errno = ENOSYS;
    }
#else
    (void)list;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glCallLists(JNIEnv* km_env, jclass km_clazz, jint n, jint type, jlong lists) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCallLists");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)n, (uint32_t)type, (void*)(uintptr_t)lists);
    } else {
        errno = ENOSYS;
    }
#else
    (void)n;
    (void)type;
    (void)lists;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glClear(JNIEnv* km_env, jclass km_clazz, jint mask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClear");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glClearAccum(JNIEnv* km_env, jclass km_clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClearAccum");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)red, (float)green, (float)blue, (float)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glClearColor(JNIEnv* km_env, jclass km_clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClearColor");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)red, (float)green, (float)blue, (float)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glClearDepth(JNIEnv* km_env, jclass km_clazz, jdouble depth) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClearDepth");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)depth);
    } else {
        errno = ENOSYS;
    }
#else
    (void)depth;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glClearIndex(JNIEnv* km_env, jclass km_clazz, jfloat c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClearIndex");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glClearStencil(JNIEnv* km_env, jclass km_clazz, jint s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClearStencil");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)s);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glClipPlane(JNIEnv* km_env, jclass km_clazz, jint plane, jlong equation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glClipPlane");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)plane, (void*)(uintptr_t)equation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)plane;
    (void)equation;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3b(JNIEnv* km_env, jclass km_clazz, jbyte red, jbyte green, jbyte blue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t, int8_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3b");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int8_t)red, (int8_t)green, (int8_t)blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3bv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3bv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3d(JNIEnv* km_env, jclass km_clazz, jdouble red, jdouble green, jdouble blue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)red, (double)green, (double)blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3f(JNIEnv* km_env, jclass km_clazz, jfloat red, jfloat green, jfloat blue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)red, (float)green, (float)blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3i(JNIEnv* km_env, jclass km_clazz, jint red, jint green, jint blue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)red, (int32_t)green, (int32_t)blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3s(JNIEnv* km_env, jclass km_clazz, jshort red, jshort green, jshort blue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)red, (int16_t)green, (int16_t)blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3ub(JNIEnv* km_env, jclass km_clazz, jbyte red, jbyte green, jbyte blue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3ub");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint8_t)red, (uint8_t)green, (uint8_t)blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3ubv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3ubv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3ui(JNIEnv* km_env, jclass km_clazz, jint red, jint green, jint blue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3ui");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)red, (uint32_t)green, (uint32_t)blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3uiv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3uiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3us(JNIEnv* km_env, jclass km_clazz, jshort red, jshort green, jshort blue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3us");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint16_t)red, (uint16_t)green, (uint16_t)blue);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor3usv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor3usv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4b(JNIEnv* km_env, jclass km_clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t, int8_t, int8_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4b");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int8_t)red, (int8_t)green, (int8_t)blue, (int8_t)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4bv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4bv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4d(JNIEnv* km_env, jclass km_clazz, jdouble red, jdouble green, jdouble blue, jdouble alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)red, (double)green, (double)blue, (double)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4f(JNIEnv* km_env, jclass km_clazz, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)red, (float)green, (float)blue, (float)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4i(JNIEnv* km_env, jclass km_clazz, jint red, jint green, jint blue, jint alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)red, (int32_t)green, (int32_t)blue, (int32_t)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4s(JNIEnv* km_env, jclass km_clazz, jshort red, jshort green, jshort blue, jshort alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)red, (int16_t)green, (int16_t)blue, (int16_t)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4ub(JNIEnv* km_env, jclass km_clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4ub");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint8_t)red, (uint8_t)green, (uint8_t)blue, (uint8_t)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4ubv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4ubv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4ui(JNIEnv* km_env, jclass km_clazz, jint red, jint green, jint blue, jint alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4ui");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)red, (uint32_t)green, (uint32_t)blue, (uint32_t)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4uiv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4uiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4us(JNIEnv* km_env, jclass km_clazz, jshort red, jshort green, jshort blue, jshort alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t, uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4us");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint16_t)red, (uint16_t)green, (uint16_t)blue, (uint16_t)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColor4usv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColor4usv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColorMask(JNIEnv* km_env, jclass km_clazz, jbyte red, jbyte green, jbyte blue, jbyte alpha) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t, uint8_t, uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColorMask");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint8_t)red, (uint8_t)green, (uint8_t)blue, (uint8_t)alpha);
    } else {
        errno = ENOSYS;
    }
#else
    (void)red;
    (void)green;
    (void)blue;
    (void)alpha;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColorMaterial(JNIEnv* km_env, jclass km_clazz, jint face, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColorMaterial");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)face, (uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glColorPointer(JNIEnv* km_env, jclass km_clazz, jint size, jint type, jint stride, jlong pointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glColorPointer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)size, (uint32_t)type, (int32_t)stride, (void*)(uintptr_t)pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glCopyPixels(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint width, jint height, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCopyPixels");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (uint32_t)type);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)type;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glCopyTexImage1D(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint border) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCopyTexImage1D");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (uint32_t)internalformat, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)border);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glCopyTexImage2D(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCopyTexImage2D");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (uint32_t)internalformat, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (int32_t)border);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glCopyTexSubImage1D(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint xoffset, jint x, jint y, jint width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCopyTexSubImage1D");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (int32_t)xoffset, (int32_t)x, (int32_t)y, (int32_t)width);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glCopyTexSubImage2D(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCopyTexSubImage2D");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (int32_t)xoffset, (int32_t)yoffset, (int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glCullFace(JNIEnv* km_env, jclass km_clazz, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glCullFace");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDeleteLists(JNIEnv* km_env, jclass km_clazz, jint list, jint range) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDeleteLists");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)list, (int32_t)range);
    } else {
        errno = ENOSYS;
    }
#else
    (void)list;
    (void)range;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDeleteTextures(JNIEnv* km_env, jclass km_clazz, jint n, jlong textures) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDeleteTextures");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)n, (void*)(uintptr_t)textures);
    } else {
        errno = ENOSYS;
    }
#else
    (void)n;
    (void)textures;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDepthFunc(JNIEnv* km_env, jclass km_clazz, jint func) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDepthFunc");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)func);
    } else {
        errno = ENOSYS;
    }
#else
    (void)func;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDepthMask(JNIEnv* km_env, jclass km_clazz, jbyte flag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDepthMask");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint8_t)flag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)flag;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDepthRange(JNIEnv* km_env, jclass km_clazz, jdouble znear, jdouble zfar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDepthRange");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)znear, (double)zfar);
    } else {
        errno = ENOSYS;
    }
#else
    (void)znear;
    (void)zfar;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDisable(JNIEnv* km_env, jclass km_clazz, jint cap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDisable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)cap);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cap;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDisableClientState(JNIEnv* km_env, jclass km_clazz, jint array) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDisableClientState");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)array);
    } else {
        errno = ENOSYS;
    }
#else
    (void)array;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDrawArrays(JNIEnv* km_env, jclass km_clazz, jint mode, jint first, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDrawArrays");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode, (int32_t)first, (int32_t)count);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    (void)first;
    (void)count;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDrawBuffer(JNIEnv* km_env, jclass km_clazz, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDrawBuffer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDrawElements(JNIEnv* km_env, jclass km_clazz, jint mode, jint count, jint type, jlong indices) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDrawElements");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode, (int32_t)count, (uint32_t)type, (void*)(uintptr_t)indices);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    (void)count;
    (void)type;
    (void)indices;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glDrawPixels(JNIEnv* km_env, jclass km_clazz, jint width, jint height, jint format, jint type, jlong pixels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glDrawPixels");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)width, (int32_t)height, (uint32_t)format, (uint32_t)type, (void*)(uintptr_t)pixels);
    } else {
        errno = ENOSYS;
    }
#else
    (void)width;
    (void)height;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEdgeFlag(JNIEnv* km_env, jclass km_clazz, jbyte flag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEdgeFlag");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint8_t)flag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)flag;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEdgeFlagPointer(JNIEnv* km_env, jclass km_clazz, jint stride, jlong pointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEdgeFlagPointer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)stride, (void*)(uintptr_t)pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEdgeFlagv(JNIEnv* km_env, jclass km_clazz, jlong flag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEdgeFlagv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)flag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)flag;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEnable(JNIEnv* km_env, jclass km_clazz, jint cap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEnable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)cap);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cap;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEnableClientState(JNIEnv* km_env, jclass km_clazz, jint array) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEnableClientState");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)array);
    } else {
        errno = ENOSYS;
    }
#else
    (void)array;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEnd(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEnd");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEndList(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEndList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalCoord1d(JNIEnv* km_env, jclass km_clazz, jdouble u) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord1d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalCoord1dv(JNIEnv* km_env, jclass km_clazz, jlong u) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord1dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalCoord1f(JNIEnv* km_env, jclass km_clazz, jfloat u) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord1f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalCoord1fv(JNIEnv* km_env, jclass km_clazz, jlong u) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord1fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalCoord2d(JNIEnv* km_env, jclass km_clazz, jdouble u, jdouble v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord2d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)u, (double)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalCoord2dv(JNIEnv* km_env, jclass km_clazz, jlong u) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord2dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalCoord2f(JNIEnv* km_env, jclass km_clazz, jfloat u, jfloat v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord2f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)u, (float)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalCoord2fv(JNIEnv* km_env, jclass km_clazz, jlong u) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalCoord2fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)u);
    } else {
        errno = ENOSYS;
    }
#else
    (void)u;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalMesh1(JNIEnv* km_env, jclass km_clazz, jint mode, jint i1, jint i2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalMesh1");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode, (int32_t)i1, (int32_t)i2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    (void)i1;
    (void)i2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalMesh2(JNIEnv* km_env, jclass km_clazz, jint mode, jint i1, jint i2, jint j1, jint j2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalMesh2");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode, (int32_t)i1, (int32_t)i2, (int32_t)j1, (int32_t)j2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    (void)i1;
    (void)i2;
    (void)j1;
    (void)j2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalPoint1(JNIEnv* km_env, jclass km_clazz, jint i) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalPoint1");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)i);
    } else {
        errno = ENOSYS;
    }
#else
    (void)i;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glEvalPoint2(JNIEnv* km_env, jclass km_clazz, jint i, jint j) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glEvalPoint2");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)i, (int32_t)j);
    } else {
        errno = ENOSYS;
    }
#else
    (void)i;
    (void)j;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glFeedbackBuffer(JNIEnv* km_env, jclass km_clazz, jint size, jint type, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFeedbackBuffer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)size, (uint32_t)type, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    (void)type;
    (void)buffer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glFinish(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFinish");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glFlush(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFlush");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glFogf(JNIEnv* km_env, jclass km_clazz, jint pname, jfloat param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFogf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (float)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glFogfv(JNIEnv* km_env, jclass km_clazz, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFogfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glFogi(JNIEnv* km_env, jclass km_clazz, jint pname, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFogi");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (int32_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glFogiv(JNIEnv* km_env, jclass km_clazz, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFogiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glFrontFace(JNIEnv* km_env, jclass km_clazz, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFrontFace");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glFrustum(JNIEnv* km_env, jclass km_clazz, jdouble left, jdouble right, jdouble bottom, jdouble top, jdouble znear, jdouble zfar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glFrustum");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)left, (double)right, (double)bottom, (double)top, (double)znear, (double)zfar);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGenLists(JNIEnv* km_env, jclass km_clazz, jint range) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGenLists");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)range);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)range;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGenTextures(JNIEnv* km_env, jclass km_clazz, jint n, jlong textures) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGenTextures");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)n, (void*)(uintptr_t)textures);
    } else {
        errno = ENOSYS;
    }
#else
    (void)n;
    (void)textures;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetBooleanv(JNIEnv* km_env, jclass km_clazz, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetBooleanv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetClipPlane(JNIEnv* km_env, jclass km_clazz, jint plane, jlong equation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetClipPlane");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)plane, (void*)(uintptr_t)equation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)plane;
    (void)equation;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetDoublev(JNIEnv* km_env, jclass km_clazz, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetDoublev");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetFloatv(JNIEnv* km_env, jclass km_clazz, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetFloatv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetIntegerv(JNIEnv* km_env, jclass km_clazz, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetIntegerv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetLightfv(JNIEnv* km_env, jclass km_clazz, jint light, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetLightfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)light, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetLightiv(JNIEnv* km_env, jclass km_clazz, jint light, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetLightiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)light, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetMapdv(JNIEnv* km_env, jclass km_clazz, jint target, jint query, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetMapdv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)query, (void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)query;
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetMapfv(JNIEnv* km_env, jclass km_clazz, jint target, jint query, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetMapfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)query, (void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)query;
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetMapiv(JNIEnv* km_env, jclass km_clazz, jint target, jint query, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetMapiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)query, (void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)query;
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetMaterialfv(JNIEnv* km_env, jclass km_clazz, jint face, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetMaterialfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)face, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetMaterialiv(JNIEnv* km_env, jclass km_clazz, jint face, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetMaterialiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)face, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetPixelMapfv(JNIEnv* km_env, jclass km_clazz, jint map, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetPixelMapfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)map, (void*)(uintptr_t)values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)values;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetPixelMapuiv(JNIEnv* km_env, jclass km_clazz, jint map, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetPixelMapuiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)map, (void*)(uintptr_t)values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)values;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetPixelMapusv(JNIEnv* km_env, jclass km_clazz, jint map, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetPixelMapusv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)map, (void*)(uintptr_t)values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)values;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetPointerv(JNIEnv* km_env, jclass km_clazz, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetPointerv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetPolygonStipple(JNIEnv* km_env, jclass km_clazz, jlong mask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetPolygonStipple");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetString(JNIEnv* km_env, jclass km_clazz, jint name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetString");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)name);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)name;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetTexEnvfv(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexEnvfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetTexEnviv(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexEnviv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetTexGendv(JNIEnv* km_env, jclass km_clazz, jint coord, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexGendv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)coord, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetTexGenfv(JNIEnv* km_env, jclass km_clazz, jint coord, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexGenfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)coord, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetTexGeniv(JNIEnv* km_env, jclass km_clazz, jint coord, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexGeniv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)coord, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetTexImage(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint format, jint type, jlong pixels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexImage");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (uint32_t)format, (uint32_t)type, (void*)(uintptr_t)pixels);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)format;
    (void)type;
    (void)pixels;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetTexLevelParameterfv(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexLevelParameterfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetTexLevelParameteriv(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexLevelParameteriv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)level;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetTexParameterfv(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexParameterfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glGetTexParameteriv(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glGetTexParameteriv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glHint(JNIEnv* km_env, jclass km_clazz, jint target, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glHint");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexMask(JNIEnv* km_env, jclass km_clazz, jint mask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexMask");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexPointer(JNIEnv* km_env, jclass km_clazz, jint type, jint stride, jlong pointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexPointer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)type, (int32_t)stride, (void*)(uintptr_t)pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexd(JNIEnv* km_env, jclass km_clazz, jdouble c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexd");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexdv(JNIEnv* km_env, jclass km_clazz, jlong c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexdv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexf(JNIEnv* km_env, jclass km_clazz, jfloat c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexfv(JNIEnv* km_env, jclass km_clazz, jlong c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexi(JNIEnv* km_env, jclass km_clazz, jint c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexi");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexiv(JNIEnv* km_env, jclass km_clazz, jlong c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexs(JNIEnv* km_env, jclass km_clazz, jshort c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexs");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexsv(JNIEnv* km_env, jclass km_clazz, jlong c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexsv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexub(JNIEnv* km_env, jclass km_clazz, jbyte c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexub");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint8_t)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIndexubv(JNIEnv* km_env, jclass km_clazz, jlong c) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIndexubv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)c);
    } else {
        errno = ENOSYS;
    }
#else
    (void)c;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glInitNames(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glInitNames");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glInterleavedArrays(JNIEnv* km_env, jclass km_clazz, jint format, jint stride, jlong pointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glInterleavedArrays");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)format, (int32_t)stride, (void*)(uintptr_t)pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)format;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIsEnabled(JNIEnv* km_env, jclass km_clazz, jint cap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIsEnabled");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cap);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)cap;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIsList(JNIEnv* km_env, jclass km_clazz, jint list) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIsList");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)list);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)list;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glIsTexture(JNIEnv* km_env, jclass km_clazz, jint texture) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glIsTexture");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)texture);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)texture;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLightModelf(JNIEnv* km_env, jclass km_clazz, jint pname, jfloat param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightModelf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (float)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLightModelfv(JNIEnv* km_env, jclass km_clazz, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightModelfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLightModeli(JNIEnv* km_env, jclass km_clazz, jint pname, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightModeli");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (int32_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLightModeliv(JNIEnv* km_env, jclass km_clazz, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightModeliv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLightf(JNIEnv* km_env, jclass km_clazz, jint light, jint pname, jfloat param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)light, (uint32_t)pname, (float)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLightfv(JNIEnv* km_env, jclass km_clazz, jint light, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)light, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLighti(JNIEnv* km_env, jclass km_clazz, jint light, jint pname, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLighti");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)light, (uint32_t)pname, (int32_t)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLightiv(JNIEnv* km_env, jclass km_clazz, jint light, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLightiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)light, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)light;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLineStipple(JNIEnv* km_env, jclass km_clazz, jint factor, jshort pattern) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLineStipple");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)factor, (uint16_t)pattern);
    } else {
        errno = ENOSYS;
    }
#else
    (void)factor;
    (void)pattern;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLineWidth(JNIEnv* km_env, jclass km_clazz, jfloat width) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLineWidth");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)width);
    } else {
        errno = ENOSYS;
    }
#else
    (void)width;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glListBase(JNIEnv* km_env, jclass km_clazz, jint base) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glListBase");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)base);
    } else {
        errno = ENOSYS;
    }
#else
    (void)base;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLoadIdentity(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLoadIdentity");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLoadMatrixd(JNIEnv* km_env, jclass km_clazz, jlong m) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLoadMatrixd");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)m);
    } else {
        errno = ENOSYS;
    }
#else
    (void)m;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLoadMatrixf(JNIEnv* km_env, jclass km_clazz, jlong m) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLoadMatrixf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)m);
    } else {
        errno = ENOSYS;
    }
#else
    (void)m;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLoadName(JNIEnv* km_env, jclass km_clazz, jint name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLoadName");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)name);
    } else {
        errno = ENOSYS;
    }
#else
    (void)name;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glLogicOp(JNIEnv* km_env, jclass km_clazz, jint opcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glLogicOp");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)opcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)opcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMap1d(JNIEnv* km_env, jclass km_clazz, jint target, jdouble u1, jdouble u2, jint stride, jint order, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, double, double, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMap1d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (double)u1, (double)u2, (int32_t)stride, (int32_t)order, (void*)(uintptr_t)points);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMap1f(JNIEnv* km_env, jclass km_clazz, jint target, jfloat u1, jfloat u2, jint stride, jint order, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMap1f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (float)u1, (float)u2, (int32_t)stride, (int32_t)order, (void*)(uintptr_t)points);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMap2d(JNIEnv* km_env, jclass km_clazz, jint target, jdouble u1, jdouble u2, jint ustride, jint uorder, jdouble v1, jdouble v2, jint vstride, jint vorder, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, double, double, int32_t, int32_t, double, double, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMap2d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (double)u1, (double)u2, (int32_t)ustride, (int32_t)uorder, (double)v1, (double)v2, (int32_t)vstride, (int32_t)vorder, (void*)(uintptr_t)points);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMap2f(JNIEnv* km_env, jclass km_clazz, jint target, jfloat u1, jfloat u2, jint ustride, jint uorder, jfloat v1, jfloat v2, jint vstride, jint vorder, jlong points) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float, float, int32_t, int32_t, float, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMap2f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (float)u1, (float)u2, (int32_t)ustride, (int32_t)uorder, (float)v1, (float)v2, (int32_t)vstride, (int32_t)vorder, (void*)(uintptr_t)points);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMapGrid1d(JNIEnv* km_env, jclass km_clazz, jint un, jdouble u1, jdouble u2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMapGrid1d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)un, (double)u1, (double)u2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)un;
    (void)u1;
    (void)u2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMapGrid1f(JNIEnv* km_env, jclass km_clazz, jint un, jfloat u1, jfloat u2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMapGrid1f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)un, (float)u1, (float)u2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)un;
    (void)u1;
    (void)u2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMapGrid2d(JNIEnv* km_env, jclass km_clazz, jint un, jdouble u1, jdouble u2, jint vn, jdouble v1, jdouble v2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, double, double, int32_t, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMapGrid2d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)un, (double)u1, (double)u2, (int32_t)vn, (double)v1, (double)v2);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMapGrid2f(JNIEnv* km_env, jclass km_clazz, jint un, jfloat u1, jfloat u2, jint vn, jfloat v1, jfloat v2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, float, float, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMapGrid2f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)un, (float)u1, (float)u2, (int32_t)vn, (float)v1, (float)v2);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMaterialf(JNIEnv* km_env, jclass km_clazz, jint face, jint pname, jfloat param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMaterialf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)face, (uint32_t)pname, (float)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMaterialfv(JNIEnv* km_env, jclass km_clazz, jint face, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMaterialfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)face, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMateriali(JNIEnv* km_env, jclass km_clazz, jint face, jint pname, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMateriali");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)face, (uint32_t)pname, (int32_t)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMaterialiv(JNIEnv* km_env, jclass km_clazz, jint face, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMaterialiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)face, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMatrixMode(JNIEnv* km_env, jclass km_clazz, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMatrixMode");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMultMatrixd(JNIEnv* km_env, jclass km_clazz, jlong m) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMultMatrixd");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)m);
    } else {
        errno = ENOSYS;
    }
#else
    (void)m;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glMultMatrixf(JNIEnv* km_env, jclass km_clazz, jlong m) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glMultMatrixf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)m);
    } else {
        errno = ENOSYS;
    }
#else
    (void)m;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNewList(JNIEnv* km_env, jclass km_clazz, jint list, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNewList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)list, (uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)list;
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormal3b(JNIEnv* km_env, jclass km_clazz, jbyte nx, jbyte ny, jbyte nz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int8_t, int8_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3b");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int8_t)nx, (int8_t)ny, (int8_t)nz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormal3bv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3bv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormal3d(JNIEnv* km_env, jclass km_clazz, jdouble nx, jdouble ny, jdouble nz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)nx, (double)ny, (double)nz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormal3dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormal3f(JNIEnv* km_env, jclass km_clazz, jfloat nx, jfloat ny, jfloat nz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)nx, (float)ny, (float)nz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormal3fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormal3i(JNIEnv* km_env, jclass km_clazz, jint nx, jint ny, jint nz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)nx, (int32_t)ny, (int32_t)nz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormal3iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormal3s(JNIEnv* km_env, jclass km_clazz, jshort nx, jshort ny, jshort nz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)nx, (int16_t)ny, (int16_t)nz);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nx;
    (void)ny;
    (void)nz;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormal3sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormal3sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glNormalPointer(JNIEnv* km_env, jclass km_clazz, jint type, jint stride, jlong pointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glNormalPointer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)type, (int32_t)stride, (void*)(uintptr_t)pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glOrtho(JNIEnv* km_env, jclass km_clazz, jdouble left, jdouble right, jdouble bottom, jdouble top, jdouble znear, jdouble zfar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glOrtho");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)left, (double)right, (double)bottom, (double)top, (double)znear, (double)zfar);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPassThrough(JNIEnv* km_env, jclass km_clazz, jfloat token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPassThrough");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)token);
    } else {
        errno = ENOSYS;
    }
#else
    (void)token;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPixelMapfv(JNIEnv* km_env, jclass km_clazz, jint map, jint mapsize, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelMapfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)map, (int32_t)mapsize, (void*)(uintptr_t)values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)mapsize;
    (void)values;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPixelMapuiv(JNIEnv* km_env, jclass km_clazz, jint map, jint mapsize, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelMapuiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)map, (int32_t)mapsize, (void*)(uintptr_t)values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)mapsize;
    (void)values;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPixelMapusv(JNIEnv* km_env, jclass km_clazz, jint map, jint mapsize, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelMapusv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)map, (int32_t)mapsize, (void*)(uintptr_t)values);
    } else {
        errno = ENOSYS;
    }
#else
    (void)map;
    (void)mapsize;
    (void)values;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPixelStoref(JNIEnv* km_env, jclass km_clazz, jint pname, jfloat param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelStoref");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (float)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPixelStorei(JNIEnv* km_env, jclass km_clazz, jint pname, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelStorei");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (int32_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPixelTransferf(JNIEnv* km_env, jclass km_clazz, jint pname, jfloat param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelTransferf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (float)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPixelTransferi(JNIEnv* km_env, jclass km_clazz, jint pname, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelTransferi");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)pname, (int32_t)param1);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pname;
    (void)param1;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPixelZoom(JNIEnv* km_env, jclass km_clazz, jfloat xfactor, jfloat yfactor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPixelZoom");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)xfactor, (float)yfactor);
    } else {
        errno = ENOSYS;
    }
#else
    (void)xfactor;
    (void)yfactor;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPointSize(JNIEnv* km_env, jclass km_clazz, jfloat size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPointSize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)size);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPolygonMode(JNIEnv* km_env, jclass km_clazz, jint face, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPolygonMode");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)face, (uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)face;
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPolygonOffset(JNIEnv* km_env, jclass km_clazz, jfloat factor, jfloat units) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPolygonOffset");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)factor, (float)units);
    } else {
        errno = ENOSYS;
    }
#else
    (void)factor;
    (void)units;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPolygonStipple(JNIEnv* km_env, jclass km_clazz, jlong mask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPolygonStipple");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPopAttrib(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPopAttrib");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPopClientAttrib(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPopClientAttrib");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPopMatrix(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPopMatrix");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPopName(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPopName");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPrioritizeTextures(JNIEnv* km_env, jclass km_clazz, jint n, jlong textures, jlong priorities) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPrioritizeTextures");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)n, (void*)(uintptr_t)textures, (void*)(uintptr_t)priorities);
    } else {
        errno = ENOSYS;
    }
#else
    (void)n;
    (void)textures;
    (void)priorities;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPushAttrib(JNIEnv* km_env, jclass km_clazz, jint mask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPushAttrib");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPushClientAttrib(JNIEnv* km_env, jclass km_clazz, jint mask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPushClientAttrib");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPushMatrix(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPushMatrix");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glPushName(JNIEnv* km_env, jclass km_clazz, jint name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glPushName");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)name);
    } else {
        errno = ENOSYS;
    }
#else
    (void)name;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos2d(JNIEnv* km_env, jclass km_clazz, jdouble x, jdouble y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)x, (double)y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos2dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos2f(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)x, (float)y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos2fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos2i(JNIEnv* km_env, jclass km_clazz, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos2iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos2s(JNIEnv* km_env, jclass km_clazz, jshort x, jshort y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)x, (int16_t)y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos2sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos2sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos3d(JNIEnv* km_env, jclass km_clazz, jdouble x, jdouble y, jdouble z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)x, (double)y, (double)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos3dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos3f(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y, jfloat z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)x, (float)y, (float)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos3fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos3i(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x, (int32_t)y, (int32_t)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos3iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos3s(JNIEnv* km_env, jclass km_clazz, jshort x, jshort y, jshort z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)x, (int16_t)y, (int16_t)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos3sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos3sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos4d(JNIEnv* km_env, jclass km_clazz, jdouble x, jdouble y, jdouble z, jdouble w) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)x, (double)y, (double)z, (double)w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos4dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos4f(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y, jfloat z, jfloat w) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)x, (float)y, (float)z, (float)w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos4fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos4i(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint z, jint w) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x, (int32_t)y, (int32_t)z, (int32_t)w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos4iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos4s(JNIEnv* km_env, jclass km_clazz, jshort x, jshort y, jshort z, jshort w) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)x, (int16_t)y, (int16_t)z, (int16_t)w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRasterPos4sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRasterPos4sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glReadBuffer(JNIEnv* km_env, jclass km_clazz, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glReadBuffer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glReadPixels(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint width, jint height, jint format, jint type, jlong pixels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glReadPixels");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height, (uint32_t)format, (uint32_t)type, (void*)(uintptr_t)pixels);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRectd(JNIEnv* km_env, jclass km_clazz, jdouble x1, jdouble y1, jdouble x2, jdouble y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectd");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)x1, (double)y1, (double)x2, (double)y2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRectdv(JNIEnv* km_env, jclass km_clazz, jlong v1, jlong v2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectdv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v1, (void*)(uintptr_t)v2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRectf(JNIEnv* km_env, jclass km_clazz, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)x1, (float)y1, (float)x2, (float)y2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRectfv(JNIEnv* km_env, jclass km_clazz, jlong v1, jlong v2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v1, (void*)(uintptr_t)v2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRecti(JNIEnv* km_env, jclass km_clazz, jint x1, jint y1, jint x2, jint y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRecti");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x1, (int32_t)y1, (int32_t)x2, (int32_t)y2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRectiv(JNIEnv* km_env, jclass km_clazz, jlong v1, jlong v2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectiv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v1, (void*)(uintptr_t)v2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRects(JNIEnv* km_env, jclass km_clazz, jshort x1, jshort y1, jshort x2, jshort y2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRects");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)x1, (int16_t)y1, (int16_t)x2, (int16_t)y2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRectsv(JNIEnv* km_env, jclass km_clazz, jlong v1, jlong v2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRectsv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v1, (void*)(uintptr_t)v2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v1;
    (void)v2;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRenderMode(JNIEnv* km_env, jclass km_clazz, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRenderMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)mode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRotated(JNIEnv* km_env, jclass km_clazz, jdouble angle, jdouble x, jdouble y, jdouble z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRotated");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)angle, (double)x, (double)y, (double)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)angle;
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glRotatef(JNIEnv* km_env, jclass km_clazz, jfloat angle, jfloat x, jfloat y, jfloat z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glRotatef");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)angle, (float)x, (float)y, (float)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)angle;
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glScaled(JNIEnv* km_env, jclass km_clazz, jdouble x, jdouble y, jdouble z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glScaled");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)x, (double)y, (double)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glScalef(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y, jfloat z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glScalef");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)x, (float)y, (float)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glScissor(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glScissor");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glSelectBuffer(JNIEnv* km_env, jclass km_clazz, jint size, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glSelectBuffer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)size, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    (void)buffer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glShadeModel(JNIEnv* km_env, jclass km_clazz, jint mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glShadeModel");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glStencilFunc(JNIEnv* km_env, jclass km_clazz, jint func, jint ref, jint mask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glStencilFunc");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)func, (int32_t)ref, (uint32_t)mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)func;
    (void)ref;
    (void)mask;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glStencilMask(JNIEnv* km_env, jclass km_clazz, jint mask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glStencilMask");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)mask);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mask;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glStencilOp(JNIEnv* km_env, jclass km_clazz, jint fail, jint zfail, jint zpass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glStencilOp");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)fail, (uint32_t)zfail, (uint32_t)zpass);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fail;
    (void)zfail;
    (void)zpass;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord1d(JNIEnv* km_env, jclass km_clazz, jdouble s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)s);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord1dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord1f(JNIEnv* km_env, jclass km_clazz, jfloat s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)s);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord1fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord1i(JNIEnv* km_env, jclass km_clazz, jint s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)s);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord1iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord1s(JNIEnv* km_env, jclass km_clazz, jshort s) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)s);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord1sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord1sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord2d(JNIEnv* km_env, jclass km_clazz, jdouble s, jdouble t) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)s, (double)t);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord2dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord2f(JNIEnv* km_env, jclass km_clazz, jfloat s, jfloat t) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)s, (float)t);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord2fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord2i(JNIEnv* km_env, jclass km_clazz, jint s, jint t) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)s, (int32_t)t);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord2iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord2s(JNIEnv* km_env, jclass km_clazz, jshort s, jshort t) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)s, (int16_t)t);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord2sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord2sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord3d(JNIEnv* km_env, jclass km_clazz, jdouble s, jdouble t, jdouble r) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)s, (double)t, (double)r);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord3dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord3f(JNIEnv* km_env, jclass km_clazz, jfloat s, jfloat t, jfloat r) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)s, (float)t, (float)r);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord3fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord3i(JNIEnv* km_env, jclass km_clazz, jint s, jint t, jint r) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)s, (int32_t)t, (int32_t)r);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord3iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord3s(JNIEnv* km_env, jclass km_clazz, jshort s, jshort t, jshort r) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)s, (int16_t)t, (int16_t)r);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord3sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord3sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord4d(JNIEnv* km_env, jclass km_clazz, jdouble s, jdouble t, jdouble r, jdouble q) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)s, (double)t, (double)r, (double)q);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord4dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord4f(JNIEnv* km_env, jclass km_clazz, jfloat s, jfloat t, jfloat r, jfloat q) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)s, (float)t, (float)r, (float)q);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord4fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord4i(JNIEnv* km_env, jclass km_clazz, jint s, jint t, jint r, jint q) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)s, (int32_t)t, (int32_t)r, (int32_t)q);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord4iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord4s(JNIEnv* km_env, jclass km_clazz, jshort s, jshort t, jshort r, jshort q) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)s, (int16_t)t, (int16_t)r, (int16_t)q);
    } else {
        errno = ENOSYS;
    }
#else
    (void)s;
    (void)t;
    (void)r;
    (void)q;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoord4sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoord4sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexCoordPointer(JNIEnv* km_env, jclass km_clazz, jint size, jint type, jint stride, jlong pointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexCoordPointer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)size, (uint32_t)type, (int32_t)stride, (void*)(uintptr_t)pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexEnvf(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jfloat param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexEnvf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (float)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexEnvfv(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexEnvfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexEnvi(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexEnvi");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (int32_t)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexEnviv(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexEnviv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexGend(JNIEnv* km_env, jclass km_clazz, jint coord, jint pname, jdouble param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGend");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)coord, (uint32_t)pname, (double)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexGendv(JNIEnv* km_env, jclass km_clazz, jint coord, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGendv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)coord, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexGenf(JNIEnv* km_env, jclass km_clazz, jint coord, jint pname, jfloat param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGenf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)coord, (uint32_t)pname, (float)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexGenfv(JNIEnv* km_env, jclass km_clazz, jint coord, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGenfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)coord, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexGeni(JNIEnv* km_env, jclass km_clazz, jint coord, jint pname, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGeni");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)coord, (uint32_t)pname, (int32_t)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexGeniv(JNIEnv* km_env, jclass km_clazz, jint coord, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexGeniv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)coord, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)coord;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexImage1D(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint internalformat, jint width, jint border, jint format, jint type, jlong pixels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexImage1D");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (int32_t)internalformat, (int32_t)width, (int32_t)border, (uint32_t)format, (uint32_t)type, (void*)(uintptr_t)pixels);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexImage2D(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint internalformat, jint width, jint height, jint border, jint format, jint type, jlong pixels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexImage2D");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (int32_t)internalformat, (int32_t)width, (int32_t)height, (int32_t)border, (uint32_t)format, (uint32_t)type, (void*)(uintptr_t)pixels);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexParameterf(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jfloat param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexParameterf");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (float)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexParameterfv(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexParameterfv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexParameteri(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexParameteri");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (int32_t)param2);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)param2;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexParameteriv(JNIEnv* km_env, jclass km_clazz, jint target, jint pname, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexParameteriv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (uint32_t)pname, (void*)(uintptr_t)params);
    } else {
        errno = ENOSYS;
    }
#else
    (void)target;
    (void)pname;
    (void)params;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexSubImage1D(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint xoffset, jint width, jint format, jint type, jlong pixels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexSubImage1D");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (int32_t)xoffset, (int32_t)width, (uint32_t)format, (uint32_t)type, (void*)(uintptr_t)pixels);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTexSubImage2D(JNIEnv* km_env, jclass km_clazz, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jlong pixels) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTexSubImage2D");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)target, (int32_t)level, (int32_t)xoffset, (int32_t)yoffset, (int32_t)width, (int32_t)height, (uint32_t)format, (uint32_t)type, (void*)(uintptr_t)pixels);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTranslated(JNIEnv* km_env, jclass km_clazz, jdouble x, jdouble y, jdouble z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTranslated");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)x, (double)y, (double)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glTranslatef(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y, jfloat z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glTranslatef");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)x, (float)y, (float)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex2d(JNIEnv* km_env, jclass km_clazz, jdouble x, jdouble y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)x, (double)y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex2dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex2f(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)x, (float)y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex2fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex2i(JNIEnv* km_env, jclass km_clazz, jint x, jint y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x, (int32_t)y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex2iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex2s(JNIEnv* km_env, jclass km_clazz, jshort x, jshort y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)x, (int16_t)y);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex2sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex2sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex3d(JNIEnv* km_env, jclass km_clazz, jdouble x, jdouble y, jdouble z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)x, (double)y, (double)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex3dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex3f(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y, jfloat z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)x, (float)y, (float)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex3fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex3i(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x, (int32_t)y, (int32_t)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex3iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex3s(JNIEnv* km_env, jclass km_clazz, jshort x, jshort y, jshort z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)x, (int16_t)y, (int16_t)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex3sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex3sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex4d(JNIEnv* km_env, jclass km_clazz, jdouble x, jdouble y, jdouble z, jdouble w) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4d");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)x, (double)y, (double)z, (double)w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex4dv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4dv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex4f(JNIEnv* km_env, jclass km_clazz, jfloat x, jfloat y, jfloat z, jfloat w) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4f");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((float)x, (float)y, (float)z, (float)w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex4fv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4fv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex4i(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint z, jint w) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4i");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x, (int32_t)y, (int32_t)z, (int32_t)w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex4iv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4iv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex4s(JNIEnv* km_env, jclass km_clazz, jshort x, jshort y, jshort z, jshort w) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int16_t, int16_t, int16_t, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4s");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int16_t)x, (int16_t)y, (int16_t)z, (int16_t)w);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)z;
    (void)w;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertex4sv(JNIEnv* km_env, jclass km_clazz, jlong v) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertex4sv");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)v);
    } else {
        errno = ENOSYS;
    }
#else
    (void)v;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glVertexPointer(JNIEnv* km_env, jclass km_clazz, jint size, jint type, jint stride, jlong pointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glVertexPointer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)size, (uint32_t)type, (int32_t)stride, (void*)(uintptr_t)pointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)size;
    (void)type;
    (void)stride;
    (void)pointer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1glViewport(JNIEnv* km_env, jclass km_clazz, jint x, jint y, jint width, jint height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "glViewport");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)x, (int32_t)y, (int32_t)width, (int32_t)height);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluBeginCurve(JNIEnv* km_env, jclass km_clazz, jlong nobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBeginCurve");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluBeginPolygon(JNIEnv* km_env, jclass km_clazz, jlong tess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBeginPolygon");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluBeginSurface(JNIEnv* km_env, jclass km_clazz, jlong nobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBeginSurface");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluBeginTrim(JNIEnv* km_env, jclass km_clazz, jlong nobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBeginTrim");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluBuild1DMipmaps(JNIEnv* km_env, jclass km_clazz, jint target, jint components, jint width, jint format, jint type, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBuild1DMipmaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)target, (int32_t)components, (int32_t)width, (uint32_t)format, (uint32_t)type, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)target;
    (void)components;
    (void)width;
    (void)format;
    (void)type;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluBuild2DMipmaps(JNIEnv* km_env, jclass km_clazz, jint target, jint components, jint width, jint height, jint format, jint type, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluBuild2DMipmaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)target, (int32_t)components, (int32_t)width, (int32_t)height, (uint32_t)format, (uint32_t)type, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)target;
    (void)components;
    (void)width;
    (void)height;
    (void)format;
    (void)type;
    (void)data;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluCylinder(JNIEnv* km_env, jclass km_clazz, jlong qobj, jdouble baseradius, jdouble topradius, jdouble height, jint slices, jint stacks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, double, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluCylinder");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)qobj, (double)baseradius, (double)topradius, (double)height, (int32_t)slices, (int32_t)stacks);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluDeleteNurbsRenderer(JNIEnv* km_env, jclass km_clazz, jlong nobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluDeleteNurbsRenderer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluDeleteQuadric(JNIEnv* km_env, jclass km_clazz, jlong state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluDeleteQuadric");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)state);
    } else {
        errno = ENOSYS;
    }
#else
    (void)state;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluDeleteTess(JNIEnv* km_env, jclass km_clazz, jlong tess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluDeleteTess");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluDisk(JNIEnv* km_env, jclass km_clazz, jlong qobj, jdouble innerradius, jdouble outerradius, jint slices, jint loops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluDisk");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)qobj, (double)innerradius, (double)outerradius, (int32_t)slices, (int32_t)loops);
    } else {
        errno = ENOSYS;
    }
#else
    (void)qobj;
    (void)innerradius;
    (void)outerradius;
    (void)slices;
    (void)loops;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluEndCurve(JNIEnv* km_env, jclass km_clazz, jlong nobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluEndCurve");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluEndPolygon(JNIEnv* km_env, jclass km_clazz, jlong tess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluEndPolygon");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluEndSurface(JNIEnv* km_env, jclass km_clazz, jlong nobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluEndSurface");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluEndTrim(JNIEnv* km_env, jclass km_clazz, jlong nobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluEndTrim");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluErrorString(JNIEnv* km_env, jclass km_clazz, jint errcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluErrorString");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)errcode);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)errcode;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluErrorUnicodeStringEXT(JNIEnv* km_env, jclass km_clazz, jint errcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluErrorUnicodeStringEXT");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)errcode);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)errcode;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluGetNurbsProperty(JNIEnv* km_env, jclass km_clazz, jlong nobj, jint property, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluGetNurbsProperty");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj, (uint32_t)property, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)property;
    (void)value;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluGetString(JNIEnv* km_env, jclass km_clazz, jint name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluGetString");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)name);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)name;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluGetTessProperty(JNIEnv* km_env, jclass km_clazz, jlong tess, jint which, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluGetTessProperty");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess, (uint32_t)which, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)which;
    (void)value;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluLoadSamplingMatrices(JNIEnv* km_env, jclass km_clazz, jlong nobj, jlong modelmatrix, jlong projmatrix, jlong viewport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluLoadSamplingMatrices");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj, (void*)(uintptr_t)modelmatrix, (void*)(uintptr_t)projmatrix, (void*)(uintptr_t)viewport);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)modelmatrix;
    (void)projmatrix;
    (void)viewport;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluLookAt(JNIEnv* km_env, jclass km_clazz, jdouble eyex, jdouble eyey, jdouble eyez, jdouble centerx, jdouble centery, jdouble centerz, jdouble upx, jdouble upy, jdouble upz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, double, double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluLookAt");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)eyex, (double)eyey, (double)eyez, (double)centerx, (double)centery, (double)centerz, (double)upx, (double)upy, (double)upz);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluNewNurbsRenderer(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNewNurbsRenderer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluNewQuadric(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNewQuadric");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluNewTess(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNewTess");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluNextContour(JNIEnv* km_env, jclass km_clazz, jlong tess, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNextContour");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess, (uint32_t)type);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)type;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluNurbsCallback(JNIEnv* km_env, jclass km_clazz, jlong nobj, jint which, jlong fn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNurbsCallback");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj, (uint32_t)which, (int64_t)fn);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)which;
    (void)fn;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluNurbsCurve(JNIEnv* km_env, jclass km_clazz, jlong nobj, jint nknots, jlong knot, jint stride, jlong ctlarray, jint order, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNurbsCurve");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj, (int32_t)nknots, (void*)(uintptr_t)knot, (int32_t)stride, (void*)(uintptr_t)ctlarray, (int32_t)order, (uint32_t)type);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluNurbsProperty(JNIEnv* km_env, jclass km_clazz, jlong nobj, jint property, jfloat value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNurbsProperty");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj, (uint32_t)property, (float)value);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)property;
    (void)value;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluNurbsSurface(JNIEnv* km_env, jclass km_clazz, jlong nobj, jint sknot_count, jlong sknot, jint tknot_count, jlong tknot, jint s_stride, jint t_stride, jlong ctlarray, jint sorder, jint torder, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t, int32_t, void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluNurbsSurface");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj, (int32_t)sknot_count, (void*)(uintptr_t)sknot, (int32_t)tknot_count, (void*)(uintptr_t)tknot, (int32_t)s_stride, (int32_t)t_stride, (void*)(uintptr_t)ctlarray, (int32_t)sorder, (int32_t)torder, (uint32_t)type);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluOrtho2D(JNIEnv* km_env, jclass km_clazz, jdouble left, jdouble right, jdouble bottom, jdouble top) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluOrtho2D");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)left, (double)right, (double)bottom, (double)top);
    } else {
        errno = ENOSYS;
    }
#else
    (void)left;
    (void)right;
    (void)bottom;
    (void)top;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluPartialDisk(JNIEnv* km_env, jclass km_clazz, jlong qobj, jdouble innerradius, jdouble outerradius, jint slices, jint loops, jdouble startangle, jdouble sweepangle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, int32_t, int32_t, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluPartialDisk");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)qobj, (double)innerradius, (double)outerradius, (int32_t)slices, (int32_t)loops, (double)startangle, (double)sweepangle);
    } else {
        errno = ENOSYS;
    }
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluPerspective(JNIEnv* km_env, jclass km_clazz, jdouble fovy, jdouble aspect, jdouble znear, jdouble zfar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluPerspective");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)fovy, (double)aspect, (double)znear, (double)zfar);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fovy;
    (void)aspect;
    (void)znear;
    (void)zfar;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluPickMatrix(JNIEnv* km_env, jclass km_clazz, jdouble x, jdouble y, jdouble width, jdouble height, jlong viewport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(double, double, double, double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluPickMatrix");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((double)x, (double)y, (double)width, (double)height, (void*)(uintptr_t)viewport);
    } else {
        errno = ENOSYS;
    }
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)viewport;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluProject(JNIEnv* km_env, jclass km_clazz, jdouble objx, jdouble objy, jdouble objz, jlong modelmatrix, jlong projmatrix, jlong viewport, jlong winx, jlong winy, jlong winz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, double, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluProject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)objx, (double)objy, (double)objz, (void*)(uintptr_t)modelmatrix, (void*)(uintptr_t)projmatrix, (void*)(uintptr_t)viewport, (void*)(uintptr_t)winx, (void*)(uintptr_t)winy, (void*)(uintptr_t)winz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluPwlCurve(JNIEnv* km_env, jclass km_clazz, jlong nobj, jint count, jlong array, jint stride, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluPwlCurve");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)nobj, (int32_t)count, (void*)(uintptr_t)array, (int32_t)stride, (uint32_t)type);
    } else {
        errno = ENOSYS;
    }
#else
    (void)nobj;
    (void)count;
    (void)array;
    (void)stride;
    (void)type;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluQuadricCallback(JNIEnv* km_env, jclass km_clazz, jlong qobj, jint which, jlong fn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluQuadricCallback");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)qobj, (uint32_t)which, (int64_t)fn);
    } else {
        errno = ENOSYS;
    }
#else
    (void)qobj;
    (void)which;
    (void)fn;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluQuadricDrawStyle(JNIEnv* km_env, jclass km_clazz, jlong quadobject, jint drawstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluQuadricDrawStyle");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)quadobject, (uint32_t)drawstyle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)quadobject;
    (void)drawstyle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluQuadricNormals(JNIEnv* km_env, jclass km_clazz, jlong quadobject, jint normals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluQuadricNormals");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)quadobject, (uint32_t)normals);
    } else {
        errno = ENOSYS;
    }
#else
    (void)quadobject;
    (void)normals;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluQuadricOrientation(JNIEnv* km_env, jclass km_clazz, jlong quadobject, jint orientation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluQuadricOrientation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)quadobject, (uint32_t)orientation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)quadobject;
    (void)orientation;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluQuadricTexture(JNIEnv* km_env, jclass km_clazz, jlong quadobject, jbyte texturecoords) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluQuadricTexture");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)quadobject, (uint8_t)texturecoords);
    } else {
        errno = ENOSYS;
    }
#else
    (void)quadobject;
    (void)texturecoords;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluScaleImage(JNIEnv* km_env, jclass km_clazz, jint format, jint widthin, jint heightin, jint typein, jlong datain, jint widthout, jint heightout, jint typeout, jlong dataout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, uint32_t, void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluScaleImage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)format, (int32_t)widthin, (int32_t)heightin, (uint32_t)typein, (void*)(uintptr_t)datain, (int32_t)widthout, (int32_t)heightout, (uint32_t)typeout, (void*)(uintptr_t)dataout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluSphere(JNIEnv* km_env, jclass km_clazz, jlong qobj, jdouble radius, jint slices, jint stacks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluSphere");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)qobj, (double)radius, (int32_t)slices, (int32_t)stacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)qobj;
    (void)radius;
    (void)slices;
    (void)stacks;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluTessBeginContour(JNIEnv* km_env, jclass km_clazz, jlong tess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessBeginContour");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluTessBeginPolygon(JNIEnv* km_env, jclass km_clazz, jlong tess, jlong polygon_data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessBeginPolygon");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess, (void*)(uintptr_t)polygon_data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)polygon_data;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluTessCallback(JNIEnv* km_env, jclass km_clazz, jlong tess, jint which, jlong fn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessCallback");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess, (uint32_t)which, (int64_t)fn);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)which;
    (void)fn;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluTessEndContour(JNIEnv* km_env, jclass km_clazz, jlong tess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessEndContour");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluTessEndPolygon(JNIEnv* km_env, jclass km_clazz, jlong tess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessEndPolygon");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluTessNormal(JNIEnv* km_env, jclass km_clazz, jlong tess, jdouble x, jdouble y, jdouble z) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessNormal");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess, (double)x, (double)y, (double)z);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)x;
    (void)y;
    (void)z;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluTessProperty(JNIEnv* km_env, jclass km_clazz, jlong tess, jint which, jdouble value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessProperty");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess, (uint32_t)which, (double)value);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)which;
    (void)value;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluTessVertex(JNIEnv* km_env, jclass km_clazz, jlong tess, jlong coords, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluTessVertex");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tess, (void*)(uintptr_t)coords, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tess;
    (void)coords;
    (void)data;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1gluUnProject(JNIEnv* km_env, jclass km_clazz, jdouble winx, jdouble winy, jdouble winz, jlong modelmatrix, jlong projmatrix, jlong viewport, jlong objx, jlong objy, jlong objz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, double, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("glu32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "gluUnProject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((double)winx, (double)winy, (double)winz, (void*)(uintptr_t)modelmatrix, (void*)(uintptr_t)projmatrix, (void*)(uintptr_t)viewport, (void*)(uintptr_t)objx, (void*)(uintptr_t)objy, (void*)(uintptr_t)objz);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglCopyContext(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglCopyContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (uint32_t)param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglCreateContext(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglCreateContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglCreateLayerContext(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglCreateLayerContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglDeleteContext(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglDeleteContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglDescribeLayerPlane(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglDescribeLayerPlane");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (int32_t)param2, (uint32_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglGetCurrentContext(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglGetCurrentContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglGetCurrentDC(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglGetCurrentDC");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglGetLayerPaletteEntries(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglGetLayerPaletteEntries");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (int32_t)param2, (int32_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglGetProcAddress(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglGetProcAddress");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)param0;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglMakeCurrent(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglMakeCurrent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglRealizeLayerPalette(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglRealizeLayerPalette");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (int32_t)param2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglSetLayerPaletteEntries(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jint param3, jlong param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglSetLayerPaletteEntries");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (int32_t)param2, (int32_t)param3, (void*)(uintptr_t)param4);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglShareLists(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglShareLists");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglSwapLayerBuffers(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglSwapLayerBuffers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglUseFontBitmapsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jint param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglUseFontBitmapsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (uint32_t)param2, (uint32_t)param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglUseFontBitmapsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jint param3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglUseFontBitmapsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (uint32_t)param2, (uint32_t)param3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglUseFontOutlinesA(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jint param3, jfloat param4, jfloat param5, jint param6, jlong param7) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, float, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglUseFontOutlinesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (uint32_t)param2, (uint32_t)param3, (float)param4, (float)param5, (int32_t)param6, (void*)(uintptr_t)param7);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_graphics_opengl_WindowsWin32GraphicsOpenglJniBridge_windowssys_1windows_1win32_1graphics_1opengl_1wglUseFontOutlinesW(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jint param3, jfloat param4, jfloat param5, jint param6, jlong param7) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, float, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("opengl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wglUseFontOutlinesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (uint32_t)param2, (uint32_t)param3, (float)param4, (float)param5, (int32_t)param6, (void*)(uintptr_t)param7);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

