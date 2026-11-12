#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_graphics_gdiplus_wrapper.h"
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

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathArc(void* path, float x, float y, float width, float height, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathArc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, width, height, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI(void* path, int32_t x, int32_t y, int32_t width, int32_t height, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathArcI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, width, height, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier(void* path, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBezier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x1, y1, x2, y2, x3, y3, x4, y4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI(void* path, int32_t x1, int32_t y1, int32_t x2, int32_t y2, int32_t x3, int32_t y3, int32_t x4, int32_t y4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBezierI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x1, y1, x2, y2, x3, y3, x4, y4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers(void* path, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBeziers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI(void* path, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathBeziersI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve(void* path, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2(void* path, void* points, int32_t count, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurve2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I(void* path, void* points, int32_t count, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurve2I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI(void* path, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathClosedCurveI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve(void* path, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2(void* path, void* points, int32_t count, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I(void* path, void* points, int32_t count, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve2I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3(void* path, void* points, int32_t count, int32_t offset, int32_t numberofsegments, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count, offset, numberofsegments, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I(void* path, void* points, int32_t count, int32_t offset, int32_t numberofsegments, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurve3I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count, offset, numberofsegments, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI(void* path, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathCurveI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse(void* path, float x, float y, float width, float height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathEllipse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI(void* path, int32_t x, int32_t y, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathEllipseI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine(void* path, float x1, float y1, float x2, float y2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x1, y1, x2, y2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2(void* path, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLine2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I(void* path, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLine2I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI(void* path, int32_t x1, int32_t y1, int32_t x2, int32_t y2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathLineI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x1, y1, x2, y2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathPath(void* path, void* addingpath, int32_t arg2Connect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, addingpath, arg2Connect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)addingpath;
    (void)arg2Connect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathPie(void* path, float x, float y, float width, float height, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPie");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, width, height, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI(void* path, int32_t x, int32_t y, int32_t width, int32_t height, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPieI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, width, height, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon(void* path, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPolygon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI(void* path, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathPolygonI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle(void* path, float x, float y, float width, float height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectangle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI(void* path, int32_t x, int32_t y, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectangleI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles(void* path, void* rects, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectangles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, rects, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI(void* path, void* rects, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathRectanglesI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, rects, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathString(void* path, void* string, int32_t length, void* family, int32_t style, float emsize, void* layoutrect, void* format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, string, length, family, style, emsize, layoutrect, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)string;
    (void)length;
    (void)family;
    (void)style;
    (void)emsize;
    (void)layoutrect;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI(void* path, void* string, int32_t length, void* family, int32_t style, float emsize, void* layoutrect, void* format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAddPathStringI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, string, length, family, style, emsize, layoutrect, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)string;
    (void)length;
    (void)family;
    (void)style;
    (void)emsize;
    (void)layoutrect;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32GraphicsGdiplusGdipAlloc(uint64_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer(void* graphics, void* dstrect, void* srcrect, int32_t unit, void* state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBeginContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, dstrect, srcrect, unit, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)dstrect;
    (void)srcrect;
    (void)unit;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2(void* graphics, void* state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBeginContainer2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI(void* graphics, void* dstrect, void* srcrect, int32_t unit, void* state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBeginContainerI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, dstrect, srcrect, unit, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)dstrect;
    (void)srcrect;
    (void)unit;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect(void* bitmap, void* effect, void* roi, int32_t useauxdata, void* auxdata, void* auxdatasize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapApplyEffect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmap, effect, roi, useauxdata, auxdata, auxdatasize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bitmap;
    (void)effect;
    (void)roi;
    (void)useauxdata;
    (void)auxdata;
    (void)auxdatasize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat(void* pinputbitmap, int32_t format, int32_t dithertype, int32_t palettetype, void* palette, float alphathresholdpercent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapConvertFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinputbitmap, format, dithertype, palettetype, palette, alphathresholdpercent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinputbitmap;
    (void)format;
    (void)dithertype;
    (void)palettetype;
    (void)palette;
    (void)alphathresholdpercent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect(void* inputbitmaps, int32_t numinputs, void* effect, void* roi, void* outputrect, void* outputbitmap, int32_t useauxdata, void* auxdata, void* auxdatasize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapCreateApplyEffect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inputbitmaps, numinputs, effect, roi, outputrect, outputbitmap, useauxdata, auxdata, auxdatasize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inputbitmaps;
    (void)numinputs;
    (void)effect;
    (void)roi;
    (void)outputrect;
    (void)outputbitmap;
    (void)useauxdata;
    (void)auxdata;
    (void)auxdatasize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram(void* bitmap, int32_t format, uint32_t numberofentries, void* channel0, void* channel1, void* channel2, void* channel3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapGetHistogram");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmap, format, numberofentries, channel0, channel1, channel2, channel3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bitmap;
    (void)format;
    (void)numberofentries;
    (void)channel0;
    (void)channel1;
    (void)channel2;
    (void)channel3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize(int32_t format, void* numberofentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapGetHistogramSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, numberofentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)numberofentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel(void* bitmap, int32_t x, int32_t y, void* color) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapGetPixel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmap, x, y, color);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bitmap;
    (void)x;
    (void)y;
    (void)color;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits(void* bitmap, void* rect, uint32_t flags, int32_t format, void* lockedbitmapdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapLockBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmap, rect, flags, format, lockedbitmapdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bitmap;
    (void)rect;
    (void)flags;
    (void)format;
    (void)lockedbitmapdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel(void* bitmap, int32_t x, int32_t y, uint32_t color) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapSetPixel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmap, x, y, color);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bitmap;
    (void)x;
    (void)y;
    (void)color;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution(void* bitmap, float xdpi, float ydpi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapSetResolution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmap, xdpi, ydpi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bitmap;
    (void)xdpi;
    (void)ydpi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits(void* bitmap, void* lockedbitmapdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipBitmapUnlockBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmap, lockedbitmapdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bitmap;
    (void)lockedbitmapdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers(void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClearPathMarkers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea(float x, float y, float width, float height, int32_t format, void* srcbitmap, void* dstbitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, float, float, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneBitmapArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(x, y, width, height, format, srcbitmap, dstbitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)format;
    (void)srcbitmap;
    (void)dstbitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI(int32_t x, int32_t y, int32_t width, int32_t height, int32_t format, void* srcbitmap, void* dstbitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneBitmapAreaI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(x, y, width, height, format, srcbitmap, dstbitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)format;
    (void)srcbitmap;
    (void)dstbitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneBrush(void* brush, void* clonebrush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneBrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, clonebrush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)clonebrush;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap(void* customcap, void* clonedcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneCustomLineCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, clonedcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)clonedcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneFont(void* font, void* clonefont) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneFont");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(font, clonefont);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)font;
    (void)clonefont;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily(void* fontfamily, void* clonedfontfamily) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneFontFamily");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fontfamily, clonedfontfamily);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fontfamily;
    (void)clonedfontfamily;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneImage(void* image, void* cloneimage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, cloneimage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)cloneimage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes(void* imageattr, void* cloneimageattr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneImageAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, cloneimageattr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)cloneimageattr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix(void* matrix, void* clonematrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, clonematrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)clonematrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipClonePath(void* path, void* clonepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClonePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, clonepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)clonepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipClonePen(void* pen, void* clonepen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClonePen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, clonepen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)clonepen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneRegion(void* region, void* cloneregion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, cloneregion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)cloneregion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat(void* format, void* newformat) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCloneStringFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, newformat);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)newformat;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure(void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClosePathFigure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures(void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipClosePathFigures");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath(void* region, void* path, int32_t combinemode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, path, combinemode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)path;
    (void)combinemode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect(void* region, void* rect, int32_t combinemode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, rect, combinemode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)rect;
    (void)combinemode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI(void* region, void* rect, int32_t combinemode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, rect, combinemode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)rect;
    (void)combinemode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion(void* region, void* region2, int32_t combinemode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCombineRegionRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, region2, combinemode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)region2;
    (void)combinemode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipComment(void* graphics, uint32_t sizedata, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipComment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, sizedata, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)sizedata;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus(void* refgraphics, void* metafile, void* conversionfailureflag, int32_t emftype, void* description, void* outMetafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipConvertToEmfPlus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(refgraphics, metafile, conversionfailureflag, emftype, description, outMetafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)emftype;
    (void)description;
    (void)outMetafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile(void* refgraphics, void* metafile, void* conversionfailureflag, void* filename, int32_t emftype, void* description, void* outMetafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipConvertToEmfPlusToFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(refgraphics, metafile, conversionfailureflag, filename, emftype, description, outMetafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)filename;
    (void)emftype;
    (void)description;
    (void)outMetafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream(void* refgraphics, void* metafile, void* conversionfailureflag, void* stream, int32_t emftype, void* description, void* outMetafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipConvertToEmfPlusToStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(refgraphics, metafile, conversionfailureflag, stream, emftype, description, outMetafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)refgraphics;
    (void)metafile;
    (void)conversionfailureflag;
    (void)stream;
    (void)emftype;
    (void)description;
    (void)outMetafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap(float height, float width, int32_t isfilled, void* cap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateAdjustableArrowCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(height, width, isfilled, cap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)height;
    (void)width;
    (void)isfilled;
    (void)cap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile(void* filename, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM(void* filename, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromFileICM");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib(void* gdibitmapinfo, void* gdibitmapdata, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromGdiDib");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(gdibitmapinfo, gdibitmapdata, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)gdibitmapinfo;
    (void)gdibitmapdata;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics(int32_t width, int32_t height, void* target, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromGraphics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(width, height, target, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)width;
    (void)height;
    (void)target;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP(void* hbm, void* hpal, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromHBITMAP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbm, hpal, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbm;
    (void)hpal;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON(void* hicon, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromHICON");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hicon, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hicon;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource(void* hinstance, void* lpbitmapname, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpbitmapname, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)lpbitmapname;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0(int32_t width, int32_t height, int32_t stride, int32_t format, void* scan0, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromScan0");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(width, height, stride, format, scan0, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)width;
    (void)height;
    (void)stride;
    (void)format;
    (void)scan0;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream(void* stream, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stream, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stream;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM(void* stream, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateBitmapFromStreamICM");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stream, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stream;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap(void* bitmap, void* graphics, void* cachedbitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateCachedBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmap, graphics, cachedbitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bitmap;
    (void)graphics;
    (void)cachedbitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap(void* fillpath, void* strokepath, int32_t basecap, float baseinset, void* customcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateCustomLineCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fillpath, strokepath, basecap, baseinset, customcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fillpath;
    (void)strokepath;
    (void)basecap;
    (void)baseinset;
    (void)customcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateFont(void* fontfamily, float emsize, int32_t style, int32_t unit, void* font) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFont");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fontfamily, emsize, style, unit, font);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fontfamily;
    (void)emsize;
    (void)style;
    (void)unit;
    (void)font;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName(void* name, void* fontcollection, void* fontfamily) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFamilyFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, fontcollection, fontfamily);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)fontcollection;
    (void)fontfamily;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC(void* hdc, void* font) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFromDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, font);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)font;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA(void* hdc, void* logfont, void* font) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFromLogfontA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, logfont, font);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)logfont;
    (void)font;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW(void* hdc, void* logfont, void* font) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFontFromLogfontW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, logfont, font);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)logfont;
    (void)font;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC(void* hdc, void* graphics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, graphics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)graphics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2(void* hdc, void* hdevice, void* graphics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHDC2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, hdevice, graphics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)hdevice;
    (void)graphics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND(void* hwnd, void* graphics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHWND");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, graphics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)graphics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM(void* hwnd, void* graphics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateFromHWNDICM");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, graphics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)graphics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap(void* bitmap, void* hbmreturn, uint32_t background) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHBITMAPFromBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmap, hbmreturn, background);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bitmap;
    (void)hbmreturn;
    (void)background;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap(void* bitmap, void* hbmreturn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHICONFromBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bitmap, hbmreturn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bitmap;
    (void)hbmreturn;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHalftonePalette");
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

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush(int32_t hatchstyle, uint32_t forecol, uint32_t backcol, void* brush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateHatchBrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hatchstyle, forecol, backcol, brush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hatchstyle;
    (void)forecol;
    (void)backcol;
    (void)brush;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes(void* imageattr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateImageAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush(void* point1, void* point2, uint32_t color1, uint32_t color2, int32_t wrapmode, void* linegradient) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(point1, point2, color1, color2, wrapmode, linegradient);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)point1;
    (void)point2;
    (void)color1;
    (void)color2;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect(void* rect, uint32_t color1, uint32_t color2, int32_t mode, int32_t wrapmode, void* linegradient) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rect, color1, color2, mode, wrapmode, linegradient);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)mode;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI(void* rect, uint32_t color1, uint32_t color2, int32_t mode, int32_t wrapmode, void* linegradient) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rect, color1, color2, mode, wrapmode, linegradient);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)mode;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle(void* rect, uint32_t color1, uint32_t color2, float angle, int32_t isanglescalable, int32_t wrapmode, void* linegradient) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectWithAngle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rect, color1, color2, angle, isanglescalable, wrapmode, linegradient);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)angle;
    (void)isanglescalable;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI(void* rect, uint32_t color1, uint32_t color2, float angle, int32_t isanglescalable, int32_t wrapmode, void* linegradient) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, float, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushFromRectWithAngleI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rect, color1, color2, angle, isanglescalable, wrapmode, linegradient);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rect;
    (void)color1;
    (void)color2;
    (void)angle;
    (void)isanglescalable;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI(void* point1, void* point2, uint32_t color1, uint32_t color2, int32_t wrapmode, void* linegradient) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateLineBrushI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(point1, point2, color1, color2, wrapmode, linegradient);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)point1;
    (void)point2;
    (void)color1;
    (void)color2;
    (void)wrapmode;
    (void)linegradient;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix(void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2(float m11, float m12, float m21, float m22, float dx, float dy, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, float, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(m11, m12, m21, m22, dx, dy, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)m11;
    (void)m12;
    (void)m21;
    (void)m22;
    (void)dx;
    (void)dy;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3(void* rect, void* dstplg, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rect, dstplg, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rect;
    (void)dstplg;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I(void* rect, void* dstplg, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMatrix3I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rect, dstplg, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rect;
    (void)dstplg;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf(void* hemf, int32_t deleteemf, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromEmf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hemf, deleteemf, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hemf;
    (void)deleteemf;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile(void* file, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)file;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream(void* stream, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stream, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stream;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf(void* hwmf, int32_t deletewmf, void* wmfplaceablefileheader, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromWmf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwmf, deletewmf, wmfplaceablefileheader, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwmf;
    (void)deletewmf;
    (void)wmfplaceablefileheader;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile(void* file, void* wmfplaceablefileheader, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateMetafileFromWmfFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, wmfplaceablefileheader, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)file;
    (void)wmfplaceablefileheader;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreatePath(int32_t brushmode, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brushmode, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brushmode;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2(void* param0, void* param1, int32_t param2, int32_t param3, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePath2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I(void* param0, void* param1, int32_t param2, int32_t param3, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePath2I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient(void* points, int32_t count, int32_t wrapmode, void* polygradient) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathGradient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(points, count, wrapmode, polygradient);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)points;
    (void)count;
    (void)wrapmode;
    (void)polygradient;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath(void* path, void* polygradient) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathGradientFromPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, polygradient);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)polygradient;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI(void* points, int32_t count, int32_t wrapmode, void* polygradient) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathGradientI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(points, count, wrapmode, polygradient);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)points;
    (void)count;
    (void)wrapmode;
    (void)polygradient;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter(void* iterator, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePathIter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreatePen1(uint32_t color, float width, int32_t unit, void* pen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePen1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(color, width, unit, pen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)color;
    (void)width;
    (void)unit;
    (void)pen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreatePen2(void* brush, float width, int32_t unit, void* pen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreatePen2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, width, unit, pen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)width;
    (void)unit;
    (void)pen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateRegion(void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn(void* hrgn, void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionHrgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrgn, region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrgn;
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath(void* path, void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect(void* rect, void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rect, region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rect;
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI(void* rect, void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rect, region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rect;
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData(void* regiondata, int32_t size, void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateRegionRgnData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regiondata, size, region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regiondata;
    (void)size;
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill(uint32_t color, void* brush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateSolidFill");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(color, brush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)color;
    (void)brush;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile(void* filename, uint32_t access, void* stream) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateStreamOnFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, access, stream);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)access;
    (void)stream;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat(int32_t formatattributes, uint16_t language, void* format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateStringFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(formatattributes, language, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)formatattributes;
    (void)language;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture(void* image, int32_t wrapmode, void* texture) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTexture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, wrapmode, texture);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)wrapmode;
    (void)texture;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2(void* image, int32_t wrapmode, float x, float y, float width, float height, void* texture) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTexture2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, wrapmode, x, y, width, height, texture);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)wrapmode;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I(void* image, int32_t wrapmode, int32_t x, int32_t y, int32_t width, int32_t height, void* texture) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTexture2I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, wrapmode, x, y, width, height, texture);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)wrapmode;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA(void* image, void* imageattributes, float x, float y, float width, float height, void* texture) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTextureIA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, imageattributes, x, y, width, height, texture);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)imageattributes;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI(void* image, void* imageattributes, int32_t x, int32_t y, int32_t width, int32_t height, void* texture) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipCreateTextureIAI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, imageattributes, x, y, width, height, texture);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)imageattributes;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)texture;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush(void* brush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteBrush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap(void* cachedbitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteCachedBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cachedbitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cachedbitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap(void* customcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteCustomLineCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect(void* effect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteEffect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(effect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)effect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeleteFont(void* font) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteFont");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(font);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)font;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily(void* fontfamily) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteFontFamily");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fontfamily);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fontfamily;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics(void* graphics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteGraphics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix(void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeletePath(void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter(void* iterator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePathIter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeletePen(void* pen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection(void* fontcollection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeletePrivateFontCollection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fontcollection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fontcollection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion(void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat(void* format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDeleteStringFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDisposeImage(void* image) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDisposeImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes(void* imageattr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDisposeImageAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawArc(void* graphics, void* pen, float x, float y, float width, float height, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawArc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x, y, width, height, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawArcI(void* graphics, void* pen, int32_t x, int32_t y, int32_t width, int32_t height, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawArcI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x, y, width, height, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawBezier(void* graphics, void* pen, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBezier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x1, y1, x2, y2, x3, y3, x4, y4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI(void* graphics, void* pen, int32_t x1, int32_t y1, int32_t x2, int32_t y2, int32_t x3, int32_t y3, int32_t x4, int32_t y4) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBezierI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x1, y1, x2, y2, x3, y3, x4, y4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    (void)x3;
    (void)y3;
    (void)x4;
    (void)y4;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers(void* graphics, void* pen, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBeziers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI(void* graphics, void* pen, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawBeziersI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap(void* graphics, void* cachedbitmap, int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCachedBitmap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, cachedbitmap, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)cachedbitmap;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve(void* graphics, void* pen, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2(void* graphics, void* pen, void* points, int32_t count, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurve2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I(void* graphics, void* pen, void* points, int32_t count, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurve2I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI(void* graphics, void* pen, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawClosedCurveI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve(void* graphics, void* pen, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2(void* graphics, void* pen, void* points, int32_t count, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I(void* graphics, void* pen, void* points, int32_t count, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve2I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3(void* graphics, void* pen, void* points, int32_t count, int32_t offset, int32_t numberofsegments, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count, offset, numberofsegments, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I(void* graphics, void* pen, void* points, int32_t count, int32_t offset, int32_t numberofsegments, float tension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurve3I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count, offset, numberofsegments, tension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    (void)offset;
    (void)numberofsegments;
    (void)tension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI(void* graphics, void* pen, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawCurveI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString(void* graphics, void* text, int32_t length, void* font, void* brush, void* positions, int32_t flags, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawDriverString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, text, length, font, brush, positions, flags, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)text;
    (void)length;
    (void)font;
    (void)brush;
    (void)positions;
    (void)flags;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse(void* graphics, void* pen, float x, float y, float width, float height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawEllipse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI(void* graphics, void* pen, int32_t x, int32_t y, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawEllipseI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImage(void* graphics, void* image, float x, float y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX(void* graphics, void* image, void* source, void* xform, void* effect, void* imageattributes, int32_t srcunit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageFX");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, source, xform, effect, imageattributes, srcunit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)source;
    (void)xform;
    (void)effect;
    (void)imageattributes;
    (void)srcunit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImageI(void* graphics, void* image, int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect(void* graphics, void* image, float x, float y, float srcx, float srcy, float srcwidth, float srcheight, int32_t srcunit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, x, y, srcx, srcy, srcwidth, srcheight, srcunit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI(void* graphics, void* image, int32_t x, int32_t y, int32_t srcx, int32_t srcy, int32_t srcwidth, int32_t srcheight, int32_t srcunit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, x, y, srcx, srcy, srcwidth, srcheight, srcunit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints(void* graphics, void* image, void* dstpoints, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, dstpoints, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)dstpoints;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI(void* graphics, void* image, void* dstpoints, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, dstpoints, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)dstpoints;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect(void* graphics, void* image, void* points, int32_t count, float srcx, float srcy, float srcwidth, float srcheight, int32_t srcunit, void* imageattributes, int64_t callback, void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, float, float, float, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointsRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, points, count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)points;
    (void)count;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI(void* graphics, void* image, void* points, int32_t count, int32_t srcx, int32_t srcy, int32_t srcwidth, int32_t srcheight, int32_t srcunit, void* imageattributes, int64_t callback, void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImagePointsRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, points, count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)points;
    (void)count;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect(void* graphics, void* image, float x, float y, float width, float height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI(void* graphics, void* image, int32_t x, int32_t y, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect(void* graphics, void* image, float dstx, float dsty, float dstwidth, float dstheight, float srcx, float srcy, float srcwidth, float srcheight, int32_t srcunit, void* imageattributes, int64_t callback, void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float, float, float, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRectRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)dstx;
    (void)dsty;
    (void)dstwidth;
    (void)dstheight;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI(void* graphics, void* image, int32_t dstx, int32_t dsty, int32_t dstwidth, int32_t dstheight, int32_t srcx, int32_t srcy, int32_t srcwidth, int32_t srcheight, int32_t srcunit, void* imageattributes, int64_t callback, void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawImageRectRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, image, dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)image;
    (void)dstx;
    (void)dsty;
    (void)dstwidth;
    (void)dstheight;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)srcunit;
    (void)imageattributes;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawLine(void* graphics, void* pen, float x1, float y1, float x2, float y2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x1, y1, x2, y2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawLineI(void* graphics, void* pen, int32_t x1, int32_t y1, int32_t x2, int32_t y2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLineI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x1, y1, x2, y2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x1;
    (void)y1;
    (void)x2;
    (void)y2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawLines(void* graphics, void* pen, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLines");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI(void* graphics, void* pen, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawLinesI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawPath(void* graphics, void* pen, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawPie(void* graphics, void* pen, float x, float y, float width, float height, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPie");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x, y, width, height, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawPieI(void* graphics, void* pen, int32_t x, int32_t y, int32_t width, int32_t height, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPieI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x, y, width, height, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon(void* graphics, void* pen, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPolygon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI(void* graphics, void* pen, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawPolygonI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle(void* graphics, void* pen, float x, float y, float width, float height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectangle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI(void* graphics, void* pen, int32_t x, int32_t y, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectangleI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles(void* graphics, void* pen, void* rects, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectangles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, rects, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI(void* graphics, void* pen, void* rects, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawRectanglesI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pen, rects, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pen;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipDrawString(void* graphics, void* string, int32_t length, void* font, void* layoutrect, void* stringformat, void* brush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipDrawString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, string, length, font, layoutrect, stringformat, brush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)brush;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits(void* hemf, uint32_t cbdata16, void* pdata16, int32_t imapmode, int32_t eflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEmfToWmfBits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hemf, cbdata16, pdata16, imapmode, eflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hemf;
    (void)cbdata16;
    (void)pdata16;
    (void)imapmode;
    (void)eflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEndContainer(void* graphics, uint32_t state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEndContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint(void* graphics, void* metafile, void* destpoint, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destpoint, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI(void* graphics, void* metafile, void* destpoint, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPointI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destpoint, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints(void* graphics, void* metafile, void* destpoints, int32_t count, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destpoints, count, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI(void* graphics, void* metafile, void* destpoints, int32_t count, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestPointsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destpoints, count, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect(void* graphics, void* metafile, void* destrect, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destrect, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI(void* graphics, void* metafile, void* destrect, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileDestRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destrect, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint(void* graphics, void* metafile, void* destpoint, void* srcrect, int32_t srcunit, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destpoint, srcrect, srcunit, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI(void* graphics, void* metafile, void* destpoint, void* srcrect, int32_t srcunit, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPointI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destpoint, srcrect, srcunit, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoint;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints(void* graphics, void* metafile, void* destpoints, int32_t count, void* srcrect, int32_t srcunit, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destpoints, count, srcrect, srcunit, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI(void* graphics, void* metafile, void* destpoints, int32_t count, void* srcrect, int32_t srcunit, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestPointsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destpoints, count, srcrect, srcunit, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destpoints;
    (void)count;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect(void* graphics, void* metafile, void* destrect, void* srcrect, int32_t srcunit, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destrect, srcrect, srcunit, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI(void* graphics, void* metafile, void* destrect, void* srcrect, int32_t srcunit, int64_t callback, void* callbackdata, void* imageattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipEnumerateMetafileSrcRectDestRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, metafile, destrect, srcrect, srcunit, callback, callbackdata, imageattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)metafile;
    (void)destrect;
    (void)srcrect;
    (void)srcunit;
    (void)callback;
    (void)callbackdata;
    (void)imageattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve(void* graphics, void* brush, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2(void* graphics, void* brush, void* points, int32_t count, float tension, int32_t fillmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurve2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, points, count, tension, fillmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)tension;
    (void)fillmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I(void* graphics, void* brush, void* points, int32_t count, float tension, int32_t fillmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurve2I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, points, count, tension, fillmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)tension;
    (void)fillmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI(void* graphics, void* brush, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillClosedCurveI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillEllipse(void* graphics, void* brush, float x, float y, float width, float height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillEllipse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI(void* graphics, void* brush, int32_t x, int32_t y, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillEllipseI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillPath(void* graphics, void* brush, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillPie(void* graphics, void* brush, float x, float y, float width, float height, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPie");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, x, y, width, height, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillPieI(void* graphics, void* brush, int32_t x, int32_t y, int32_t width, int32_t height, float startangle, float sweepangle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPieI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, x, y, width, height, startangle, sweepangle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)startangle;
    (void)sweepangle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon(void* graphics, void* brush, void* points, int32_t count, int32_t fillmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, points, count, fillmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)fillmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2(void* graphics, void* brush, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygon2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I(void* graphics, void* brush, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygon2I");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI(void* graphics, void* brush, void* points, int32_t count, int32_t fillmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillPolygonI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, points, count, fillmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)points;
    (void)count;
    (void)fillmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillRectangle(void* graphics, void* brush, float x, float y, float width, float height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectangle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI(void* graphics, void* brush, int32_t x, int32_t y, int32_t width, int32_t height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectangleI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, x, y, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillRectangles(void* graphics, void* brush, void* rects, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectangles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, rects, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI(void* graphics, void* brush, void* rects, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRectanglesI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, rects, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)rects;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFillRegion(void* graphics, void* brush, void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFillRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, brush, region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)brush;
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem(void* image, void* item) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFindFirstImageItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, item);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)item;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem(void* image, void* item) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFindNextImageItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, item);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)item;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFlattenPath(void* path, void* matrix, float flatness) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFlattenPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, matrix, flatness);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)matrix;
    (void)flatness;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipFlush(void* graphics, int32_t intention) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFlush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, intention);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)intention;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32GraphicsGdiplusGdipFree(void* ptr) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptr);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptr;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState(void* cap, void* fillstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapFillState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cap, fillstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cap;
    (void)fillstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight(void* cap, void* height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapHeight");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cap, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cap;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset(void* cap, void* middleinset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapMiddleInset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cap, middleinset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cap;
    (void)middleinset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth(void* cap, void* width) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAdjustableArrowCapWidth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cap, width);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cap;
    (void)width;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems(void* image, uint32_t totalbuffersize, uint32_t numproperties, void* allitems) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetAllPropertyItems");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, totalbuffersize, numproperties, allitems);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)totalbuffersize;
    (void)numproperties;
    (void)allitems;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetBrushType(void* brush, void* type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetBrushType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent(void* family, int32_t style, void* cellascent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCellAscent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, style, cellascent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)family;
    (void)style;
    (void)cellascent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent(void* family, int32_t style, void* celldescent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCellDescent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, style, celldescent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)family;
    (void)style;
    (void)celldescent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetClip(void* graphics, void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetClip");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds(void* graphics, void* rect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetClipBounds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, rect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI(void* graphics, void* rect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetClipBoundsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, rect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode(void* graphics, void* compositingmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCompositingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, compositingmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)compositingmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality(void* graphics, void* compositingquality) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCompositingQuality");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, compositingquality);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)compositingquality;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap(void* customcap, void* basecap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapBaseCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, basecap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)basecap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset(void* customcap, void* inset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapBaseInset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, inset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)inset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps(void* customcap, void* startcap, void* endcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapStrokeCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, startcap, endcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)startcap;
    (void)endcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin(void* customcap, void* linejoin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapStrokeJoin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, linejoin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)linejoin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType(void* customcap, void* captype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, captype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)captype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale(void* customcap, void* widthscale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetCustomLineCapWidthScale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, widthscale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)widthscale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetDC(void* graphics, void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetDpiX(void* graphics, void* dpi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetDpiX");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, dpi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)dpi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetDpiY(void* graphics, void* dpi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetDpiY");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, dpi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)dpi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize(void* effect, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEffectParameterSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(effect, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)effect;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters(void* effect, void* size, void* params) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEffectParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(effect, size, params);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)effect;
    (void)size;
    (void)params;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight(void* family, int32_t style, void* emheight) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEmHeight");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, style, emheight);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)family;
    (void)style;
    (void)emheight;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList(void* image, void* clsidencoder, uint32_t size, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEncoderParameterList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, clsidencoder, size, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)clsidencoder;
    (void)size;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize(void* image, void* clsidencoder, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetEncoderParameterListSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, clsidencoder, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)clsidencoder;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetFamily(void* font, void* family) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFamily");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(font, family);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)font;
    (void)family;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName(void* family, void* name, uint16_t language) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFamilyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, name, language);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)family;
    (void)name;
    (void)language;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount(void* fontcollection, void* numfound) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontCollectionFamilyCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fontcollection, numfound);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fontcollection;
    (void)numfound;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList(void* fontcollection, int32_t numsought, void* gpfamilies, void* numfound) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontCollectionFamilyList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fontcollection, numsought, gpfamilies, numfound);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fontcollection;
    (void)numsought;
    (void)gpfamilies;
    (void)numfound;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight(void* font, void* graphics, void* height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontHeight");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(font, graphics, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)font;
    (void)graphics;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI(void* font, float dpi, void* height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontHeightGivenDPI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(font, dpi, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)font;
    (void)dpi;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetFontSize(void* font, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(font, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)font;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle(void* font, void* style) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontStyle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(font, style);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)font;
    (void)style;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit(void* font, void* unit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetFontUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(font, unit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)font;
    (void)unit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace(void* nativefamily) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetGenericFontFamilyMonospace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nativefamily);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nativefamily;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif(void* nativefamily) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetGenericFontFamilySansSerif");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nativefamily);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nativefamily;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif(void* nativefamily) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetGenericFontFamilySerif");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nativefamily);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nativefamily;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor(void* brush, void* backcol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHatchBackgroundColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, backcol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)backcol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor(void* brush, void* forecol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHatchForegroundColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, forecol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)forecol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle(void* brush, void* hatchstyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHatchStyle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, hatchstyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)hatchstyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile(void* metafile, void* hemf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetHemfFromMetafile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(metafile, hemf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)metafile;
    (void)hemf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette(void* imageattr, void* colorpalette, int32_t coloradjusttype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageAttributesAdjustedPalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, colorpalette, coloradjusttype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)colorpalette;
    (void)coloradjusttype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds(void* image, void* srcrect, void* srcunit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageBounds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, srcrect, srcunit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)srcrect;
    (void)srcunit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders(uint32_t numdecoders, uint32_t size, void* decoders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageDecoders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numdecoders, size, decoders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)numdecoders;
    (void)size;
    (void)decoders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize(void* numdecoders, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageDecodersSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numdecoders, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)numdecoders;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension(void* image, void* width, void* height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageDimension");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders(uint32_t numencoders, uint32_t size, void* encoders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageEncoders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numencoders, size, encoders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)numencoders;
    (void)size;
    (void)encoders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize(void* numencoders, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageEncodersSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(numencoders, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)numencoders;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags(void* image, void* flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext(void* image, void* graphics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageGraphicsContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, graphics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)graphics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight(void* image, void* height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageHeight");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution(void* image, void* resolution) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageHorizontalResolution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, resolution);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)resolution;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData(void* image, void* item) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageItemData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, item);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)item;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette(void* image, void* palette, int32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImagePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, palette, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)palette;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize(void* image, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImagePaletteSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat(void* image, void* format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImagePixelFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat(void* image, void* format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageRawFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail(void* image, uint32_t thumbwidth, uint32_t thumbheight, void* thumbimage, int64_t callback, void* callbackdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageThumbnail");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, thumbwidth, thumbheight, thumbimage, callback, callbackdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)thumbwidth;
    (void)thumbheight;
    (void)thumbimage;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageType(void* image, void* type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution(void* image, void* resolution) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageVerticalResolution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, resolution);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)resolution;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth(void* image, void* width) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetImageWidth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, width);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)width;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode(void* graphics, void* interpolationmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetInterpolationMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, interpolationmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)interpolationmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend(void* brush, void* blend, void* positions, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, blend, positions, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount(void* brush, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineBlendCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLineColors(void* brush, void* colors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineColors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, colors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)colors;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection(void* brush, void* usegammacorrection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineGammaCorrection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, usegammacorrection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)usegammacorrection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend(void* brush, void* blend, void* positions, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLinePresetBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, blend, positions, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount(void* brush, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLinePresetBlendCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLineRect(void* brush, void* rect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, rect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)rect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI(void* brush, void* rect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, rect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)rect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing(void* family, int32_t style, void* linespacing) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineSpacing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, style, linespacing);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)family;
    (void)style;
    (void)linespacing;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform(void* brush, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode(void* brush, void* wrapmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLineWrapMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, wrapmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA(void* font, void* graphics, void* logfonta) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLogFontA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(font, graphics, logfonta);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)font;
    (void)graphics;
    (void)logfonta;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW(void* font, void* graphics, void* logfontw) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetLogFontW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(font, graphics, logfontw);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)font;
    (void)graphics;
    (void)logfontw;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements(void* matrix, void* matrixout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMatrixElements");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, matrixout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)matrixout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit(void* metafile, void* metafilerasterizationlimitdpi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileDownLevelRasterizationLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(metafile, metafilerasterizationlimitdpi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)metafile;
    (void)metafilerasterizationlimitdpi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf(void* hemf, void* header) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromEmf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hemf, header);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hemf;
    (void)header;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile(void* filename, void* header) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, header);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)header;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile(void* metafile, void* header) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromMetafile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(metafile, header);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)metafile;
    (void)header;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream(void* stream, void* header) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stream, header);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stream;
    (void)header;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf(void* hwmf, void* wmfplaceablefileheader, void* header) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetMetafileHeaderFromWmf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwmf, wmfplaceablefileheader, header);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwmf;
    (void)wmfplaceablefileheader;
    (void)header;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor(void* graphics, void* argb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetNearestColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, argb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)argb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPageScale(void* graphics, void* scale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPageScale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, scale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)scale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit(void* graphics, void* unit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPageUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, unit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)unit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathData(void* path, void* pathdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, pathdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)pathdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode(void* path, void* fillmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathFillMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, fillmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)fillmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend(void* brush, void* blend, void* positions, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, blend, positions, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount(void* brush, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientBlendCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor(void* brush, void* colors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientCenterColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, colors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)colors;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint(void* brush, void* points) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientCenterPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, points);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)points;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI(void* brush, void* points) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientCenterPointI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, points);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)points;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales(void* brush, void* xscale, void* yscale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientFocusScales");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, xscale, yscale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)xscale;
    (void)yscale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection(void* brush, void* usegammacorrection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientGammaCorrection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, usegammacorrection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)usegammacorrection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath(void* brush, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount(void* brush, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPointCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend(void* brush, void* blend, void* positions, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPresetBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, blend, positions, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount(void* brush, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientPresetBlendCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect(void* brush, void* rect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, rect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)rect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI(void* brush, void* rect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, rect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)rect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount(void* brush, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientSurroundColorCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount(void* brush, void* color, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientSurroundColorsWithCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, color, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)color;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform(void* brush, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode(void* brush, void* wrapmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathGradientWrapMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, wrapmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint(void* path, void* lastpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathLastPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, lastpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)lastpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints(void* param0, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathPoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI(void* param0, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathPointsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes(void* path, void* types, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathTypes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, types, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)types;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds(void* path, void* bounds, void* matrix, void* pen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathWorldBounds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, bounds, matrix, pen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)bounds;
    (void)matrix;
    (void)pen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI(void* path, void* bounds, void* matrix, void* pen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPathWorldBoundsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, bounds, matrix, pen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)bounds;
    (void)matrix;
    (void)pen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill(void* pen, void* brush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenBrushFill");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, brush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)brush;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenColor(void* pen, void* argb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, argb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)argb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray(void* pen, void* dash, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCompoundArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, dash, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount(void* pen, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCompoundCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap(void* pen, void* customcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCustomEndCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, customcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)customcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap(void* pen, void* customcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenCustomStartCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, customcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)customcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray(void* pen, void* dash, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, dash, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819(void* pen, void* dashcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashCap197819");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, dashcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)dashcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount(void* pen, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset(void* pen, void* offset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, offset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)offset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle(void* pen, void* dashstyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenDashStyle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, dashstyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)dashstyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap(void* pen, void* endcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenEndCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, endcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)endcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType(void* pen, void* type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenFillType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin(void* pen, void* linejoin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenLineJoin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, linejoin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)linejoin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit(void* pen, void* miterlimit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenMiterLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, miterlimit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)miterlimit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenMode(void* pen, void* penmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, penmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)penmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap(void* pen, void* startcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenStartCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, startcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)startcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform(void* pen, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit(void* pen, void* unit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, unit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)unit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth(void* pen, void* width) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPenWidth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, width);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)width;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode(void* graphics, void* pixeloffsetmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPixelOffsetMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pixeloffsetmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pixeloffsetmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPointCount(void* path, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPointCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount(void* image, void* numofproperty) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, numofproperty);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)numofproperty;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList(void* image, uint32_t numofproperty, void* list) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyIdList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, numofproperty, list);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)numofproperty;
    (void)list;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem(void* image, uint32_t propid, uint32_t propsize, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, propid, propsize, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)propid;
    (void)propsize;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize(void* image, uint32_t propid, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertyItemSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, propid, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)propid;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize(void* image, void* totalbuffersize, void* numproperties) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetPropertySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, totalbuffersize, numproperties);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)totalbuffersize;
    (void)numproperties;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds(void* region, void* graphics, void* rect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionBounds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, graphics, rect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI(void* region, void* graphics, void* rect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionBoundsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, graphics, rect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetRegionData(void* region, void* buffer, uint32_t buffersize, void* sizefilled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, buffer, buffersize, sizefilled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)buffer;
    (void)buffersize;
    (void)sizefilled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize(void* region, void* buffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionDataSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, buffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)buffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn(void* region, void* graphics, void* hrgn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionHRgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, graphics, hrgn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)graphics;
    (void)hrgn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans(void* region, void* rects, void* count, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionScans");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, rects, count, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)rects;
    (void)count;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount(void* region, void* count, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionScansCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, count, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)count;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI(void* region, void* rects, void* count, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRegionScansI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, rects, count, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)rects;
    (void)count;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin(void* graphics, void* x, void* y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetRenderingOrigin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode(void* graphics, void* smoothingmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetSmoothingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, smoothingmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)smoothingmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor(void* brush, void* color) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetSolidFillColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, color);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)color;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign(void* format, void* align) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatAlign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, align);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)align;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution(void* format, void* language, void* substitute) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatDigitSubstitution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, language, substitute);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)language;
    (void)substitute;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags(void* format, void* flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix(void* format, void* hotkeyprefix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatHotkeyPrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, hotkeyprefix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)hotkeyprefix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign(void* format, void* align) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatLineAlign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, align);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)align;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount(void* format, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatMeasurableCharacterRangeCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount(void* format, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatTabStopCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops(void* format, int32_t count, void* firsttaboffset, void* tabstops) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatTabStops");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, count, firsttaboffset, tabstops);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)count;
    (void)firsttaboffset;
    (void)tabstops;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming(void* format, void* trimming) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetStringFormatTrimming");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, trimming);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)trimming;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast(void* graphics, void* contrast) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextContrast");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, contrast);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)contrast;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint(void* graphics, void* mode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextRenderingHint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage(void* brush, void* image) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextureImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, image);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)image;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform(void* brush, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextureTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode(void* brush, void* wrapmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetTextureWrapMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, wrapmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds(void* graphics, void* rect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetVisibleClipBounds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, rect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI(void* graphics, void* rect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetVisibleClipBoundsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, rect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)rect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform(void* graphics, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGetWorldTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear(void* graphics, uint32_t color) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGraphicsClear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, color);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)color;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort(void* pgraphics, void* piabort) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipGraphicsSetAbort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pgraphics, piabort);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pgraphics;
    (void)piabort;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation(void* image) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageForceValidation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount(void* image, void* dimensionid, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageGetFrameCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, dimensionid, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)dimensionid;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount(void* image, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageGetFrameDimensionsCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList(void* image, void* dimensionids, uint32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageGetFrameDimensionsList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, dimensionids, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)dimensionids;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip(void* image, int32_t rftype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageRotateFlip");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, rftype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)rftype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame(void* image, void* dimensionid, uint32_t frameindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageSelectActiveFrame");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, dimensionid, frameindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)dimensionid;
    (void)frameindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort(void* pimage, void* piabort) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipImageSetAbort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pimage, piabort);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pimage;
    (void)piabort;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipInitializePalette(void* palette, int32_t palettetype, int32_t optimalcolors, int32_t usetransparentcolor, void* bitmap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipInitializePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(palette, palettetype, optimalcolors, usetransparentcolor, bitmap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)palette;
    (void)palettetype;
    (void)optimalcolors;
    (void)usetransparentcolor;
    (void)bitmap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix(void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipInvertMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty(void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsClipEmpty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion(void* region, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsEmptyRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion(void* region, void* region2, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsEqualRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, region2, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)region2;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion(void* region, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsInfiniteRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual(void* matrix, void* matrix2, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsMatrixEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, matrix2, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)matrix2;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity(void* matrix, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsMatrixIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible(void* matrix, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsMatrixInvertible");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint(void* path, float x, float y, void* pen, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsOutlineVisiblePathPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, pen, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)pen;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI(void* path, int32_t x, int32_t y, void* pen, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsOutlineVisiblePathPointI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, pen, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)pen;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable(void* family, int32_t style, void* isstyleavailable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsStyleAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(family, style, isstyleavailable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)family;
    (void)style;
    (void)isstyleavailable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty(void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleClipEmpty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint(void* path, float x, float y, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePathPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI(void* path, int32_t x, int32_t y, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePathPointI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, x, y, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint(void* graphics, float x, float y, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, x, y, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI(void* graphics, int32_t x, int32_t y, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisiblePointI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, x, y, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect(void* graphics, float x, float y, float width, float height, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, x, y, width, height, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI(void* graphics, int32_t x, int32_t y, int32_t width, int32_t height, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, x, y, width, height, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint(void* region, float x, float y, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, x, y, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI(void* region, int32_t x, int32_t y, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionPointI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, x, y, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect(void* region, float x, float y, float width, float height, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, x, y, width, height, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI(void* region, int32_t x, int32_t y, int32_t width, int32_t height, void* graphics, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipIsVisibleRegionRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, x, y, width, height, graphics, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)graphics;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile(void* filename, void* image) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, image);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)image;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM(void* filename, void* image) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromFileICM");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, image);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)image;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream(void* stream, void* image) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stream, image);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stream;
    (void)image;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM(void* stream, void* image) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipLoadImageFromStreamICM");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stream, image);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stream;
    (void)image;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges(void* graphics, void* string, int32_t length, void* font, void* layoutrect, void* stringformat, int32_t regioncount, void* regions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMeasureCharacterRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, string, length, font, layoutrect, stringformat, regioncount, regions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)regioncount;
    (void)regions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString(void* graphics, void* text, int32_t length, void* font, void* positions, int32_t flags, void* matrix, void* boundingbox) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMeasureDriverString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, text, length, font, positions, flags, matrix, boundingbox);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)text;
    (void)length;
    (void)font;
    (void)positions;
    (void)flags;
    (void)matrix;
    (void)boundingbox;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipMeasureString(void* graphics, void* string, int32_t length, void* font, void* layoutrect, void* stringformat, void* boundingbox, void* codepointsfitted, void* linesfilled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMeasureString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, string, length, font, layoutrect, stringformat, boundingbox, codepointsfitted, linesfilled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)string;
    (void)length;
    (void)font;
    (void)layoutrect;
    (void)stringformat;
    (void)boundingbox;
    (void)codepointsfitted;
    (void)linesfilled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform(void* brush, void* matrix, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyLineTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, matrix, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)matrix;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix(void* matrix, void* matrix2, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, matrix2, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)matrix2;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform(void* brush, void* matrix, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyPathGradientTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, matrix, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)matrix;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform(void* pen, void* matrix, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyPenTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, matrix, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)matrix;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform(void* brush, void* matrix, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyTextureTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, matrix, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)matrix;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform(void* graphics, void* matrix, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipMultiplyWorldTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, matrix, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)matrix;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection(void* fontcollection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipNewInstalledFontCollection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fontcollection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fontcollection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection(void* fontcollection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipNewPrivateFontCollection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fontcollection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fontcollection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData(void* iterator, void* resultcount, void* points, void* types, int32_t startindex, int32_t endindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterCopyData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, resultcount, points, types, startindex, endindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)points;
    (void)types;
    (void)startindex;
    (void)endindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate(void* iterator, void* resultcount, void* points, void* types, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterEnumerate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, resultcount, points, types, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)points;
    (void)types;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount(void* iterator, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterGetCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount(void* iterator, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterGetSubpathCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve(void* iterator, void* hascurve) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterHasCurve");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, hascurve);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)hascurve;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid(void* iterator, void* valid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterIsValid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, valid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)valid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker(void* iterator, void* resultcount, void* startindex, void* endindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextMarker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, resultcount, startindex, endindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)startindex;
    (void)endindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath(void* iterator, void* resultcount, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextMarkerPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, resultcount, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType(void* iterator, void* resultcount, void* pathtype, void* startindex, void* endindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextPathType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, resultcount, pathtype, startindex, endindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)pathtype;
    (void)startindex;
    (void)endindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath(void* iterator, void* resultcount, void* startindex, void* endindex, void* isclosed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextSubpath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, resultcount, startindex, endindex, isclosed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)startindex;
    (void)endindex;
    (void)isclosed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath(void* iterator, void* resultcount, void* path, void* isclosed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterNextSubpathPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator, resultcount, path, isclosed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    (void)resultcount;
    (void)path;
    (void)isclosed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind(void* iterator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPathIterRewind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iterator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iterator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord(void* metafile, int32_t recordtype, uint32_t flags, uint32_t datasize, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPlayMetafileRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(metafile, recordtype, flags, datasize, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)metafile;
    (void)recordtype;
    (void)flags;
    (void)datasize;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile(void* fontcollection, void* filename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPrivateAddFontFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fontcollection, filename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fontcollection;
    (void)filename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont(void* fontcollection, void* memory, int32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipPrivateAddMemoryFont");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fontcollection, memory, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fontcollection;
    (void)memory;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile(void* referencehdc, int32_t type, void* framerect, int32_t frameunit, void* description, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(referencehdc, type, framerect, frameunit, description, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName(void* filename, void* referencehdc, int32_t type, void* framerect, int32_t frameunit, void* description, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileFileName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, referencehdc, type, framerect, frameunit, description, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI(void* filename, void* referencehdc, int32_t type, void* framerect, int32_t frameunit, void* description, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileFileNameI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, referencehdc, type, framerect, frameunit, description, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI(void* referencehdc, int32_t type, void* framerect, int32_t frameunit, void* description, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(referencehdc, type, framerect, frameunit, description, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream(void* stream, void* referencehdc, int32_t type, void* framerect, int32_t frameunit, void* description, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stream, referencehdc, type, framerect, frameunit, description, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stream;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI(void* stream, void* referencehdc, int32_t type, void* framerect, int32_t frameunit, void* description, void* metafile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRecordMetafileStreamI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stream, referencehdc, type, framerect, frameunit, description, metafile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stream;
    (void)referencehdc;
    (void)type;
    (void)framerect;
    (void)frameunit;
    (void)description;
    (void)metafile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipReleaseDC(void* graphics, void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipReleaseDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, hdc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)hdc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem(void* image, uint32_t propid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRemovePropertyItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, propid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)propid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipResetClip(void* graphics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetClip");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes(void* imageattr, int32_t type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetImageAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform(void* brush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetLineTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform(void* graphics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPageTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipResetPath(void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform(void* brush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPathGradientTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform(void* pen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetPenTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform(void* brush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetTextureTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform(void* graphics) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipResetWorldTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics(void* graphics, uint32_t state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRestoreGraphics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipReversePath(void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipReversePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform(void* brush, float angle, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateLineTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, angle, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix(void* matrix, float angle, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, angle, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform(void* brush, float angle, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotatePathGradientTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, angle, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform(void* pen, float angle, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotatePenTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, angle, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform(void* brush, float angle, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateTextureTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, angle, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform(void* graphics, float angle, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipRotateWorldTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, angle, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)angle;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSaveAdd(void* image, void* encoderparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, encoderparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)encoderparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage(void* image, void* newimage, void* encoderparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveAddImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, newimage, encoderparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)newimage;
    (void)encoderparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics(void* graphics, void* state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveGraphics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile(void* image, void* filename, void* clsidencoder, void* encoderparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveImageToFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, filename, clsidencoder, encoderparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)filename;
    (void)clsidencoder;
    (void)encoderparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream(void* image, void* stream, void* clsidencoder, void* encoderparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSaveImageToStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, stream, clsidencoder, encoderparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)stream;
    (void)clsidencoder;
    (void)encoderparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform(void* brush, float sx, float sy, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleLineTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, sx, sy, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix(void* matrix, float scalex, float scaley, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, scalex, scaley, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)scalex;
    (void)scaley;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform(void* brush, float sx, float sy, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScalePathGradientTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, sx, sy, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform(void* pen, float sx, float sy, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScalePenTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, sx, sy, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)sx;
    (void)sy;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform(void* brush, float sx, float sy, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleTextureTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, sx, sy, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)sx;
    (void)sy;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform(void* graphics, float sx, float sy, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipScaleWorldTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, sx, sy, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)sx;
    (void)sy;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState(void* cap, int32_t fillstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapFillState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cap, fillstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cap;
    (void)fillstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight(void* cap, float height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapHeight");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cap, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cap;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset(void* cap, float middleinset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapMiddleInset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cap, middleinset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cap;
    (void)middleinset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth(void* cap, float width) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetAdjustableArrowCapWidth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cap, width);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cap;
    (void)width;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics(void* graphics, void* srcgraphics, int32_t combinemode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipGraphics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, srcgraphics, combinemode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)srcgraphics;
    (void)combinemode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn(void* graphics, void* hrgn, int32_t combinemode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipHrgn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, hrgn, combinemode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)hrgn;
    (void)combinemode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetClipPath(void* graphics, void* path, int32_t combinemode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, path, combinemode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)path;
    (void)combinemode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetClipRect(void* graphics, float x, float y, float width, float height, int32_t combinemode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, x, y, width, height, combinemode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)combinemode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI(void* graphics, int32_t x, int32_t y, int32_t width, int32_t height, int32_t combinemode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipRectI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, x, y, width, height, combinemode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    (void)width;
    (void)height;
    (void)combinemode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion(void* graphics, void* region, int32_t combinemode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetClipRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, region, combinemode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)region;
    (void)combinemode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode(void* graphics, int32_t compositingmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCompositingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, compositingmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)compositingmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality(void* graphics, int32_t compositingquality) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCompositingQuality");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, compositingquality);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)compositingquality;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap(void* customcap, int32_t basecap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapBaseCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, basecap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)basecap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset(void* customcap, float inset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapBaseInset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, inset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)inset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps(void* customcap, int32_t startcap, int32_t endcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapStrokeCaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, startcap, endcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)startcap;
    (void)endcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin(void* customcap, int32_t linejoin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapStrokeJoin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, linejoin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)linejoin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale(void* customcap, float widthscale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetCustomLineCapWidthScale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(customcap, widthscale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)customcap;
    (void)widthscale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters(void* effect, void* params, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetEffectParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(effect, params, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)effect;
    (void)params;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetEmpty(void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetEmpty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground(void* imageattr, int32_t enableflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesCachedBackground");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, enableflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)enableflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys(void* imageattr, int32_t type, int32_t enableflag, uint32_t colorlow, uint32_t colorhigh) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesColorKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, type, enableflag, colorlow, colorhigh);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colorlow;
    (void)colorhigh;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix(void* imageattr, int32_t type, int32_t enableflag, void* colormatrix, void* graymatrix, int32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesColorMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, type, enableflag, colormatrix, graymatrix, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colormatrix;
    (void)graymatrix;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma(void* imageattr, int32_t type, int32_t enableflag, float gamma) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesGamma");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, type, enableflag, gamma);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)gamma;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp(void* imageattr, int32_t type, int32_t enableflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesNoOp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, type, enableflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel(void* imageattr, int32_t type, int32_t enableflag, int32_t channelflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesOutputChannel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, type, enableflag, channelflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)channelflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile(void* imageattr, int32_t type, int32_t enableflag, void* colorprofilefilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesOutputChannelColorProfile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, type, enableflag, colorprofilefilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)colorprofilefilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable(void* imageattr, int32_t type, int32_t enableflag, uint32_t mapsize, void* map) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesRemapTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, type, enableflag, mapsize, map);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)mapsize;
    (void)map;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold(void* imageattr, int32_t type, int32_t enableflag, float threshold) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesThreshold");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, type, enableflag, threshold);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)type;
    (void)enableflag;
    (void)threshold;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity(void* imageattr, int32_t type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesToIdentity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode(void* imageattr, int32_t wrap, uint32_t argb, int32_t clamp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImageAttributesWrapMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imageattr, wrap, argb, clamp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imageattr;
    (void)wrap;
    (void)argb;
    (void)clamp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette(void* image, void* palette) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetImagePalette");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, palette);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)palette;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetInfinite(void* region) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetInfinite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode(void* graphics, int32_t interpolationmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetInterpolationMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, interpolationmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)interpolationmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend(void* brush, void* blend, void* positions, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, blend, positions, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetLineColors(void* brush, uint32_t color1, uint32_t color2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineColors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, color1, color2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)color1;
    (void)color2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection(void* brush, int32_t usegammacorrection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineGammaCorrection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, usegammacorrection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)usegammacorrection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend(void* brush, float focus, float scale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineLinearBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, focus, scale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend(void* brush, void* blend, void* positions, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLinePresetBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, blend, positions, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend(void* brush, float focus, float scale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineSigmaBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, focus, scale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform(void* brush, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode(void* brush, int32_t wrapmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetLineWrapMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, wrapmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements(void* matrix, float m11, float m12, float m21, float m22, float dx, float dy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetMatrixElements");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, m11, m12, m21, m22, dx, dy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)m11;
    (void)m12;
    (void)m21;
    (void)m22;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit(void* metafile, uint32_t metafilerasterizationlimitdpi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetMetafileDownLevelRasterizationLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(metafile, metafilerasterizationlimitdpi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)metafile;
    (void)metafilerasterizationlimitdpi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPageScale(void* graphics, float scale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPageScale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, scale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)scale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit(void* graphics, int32_t unit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPageUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, unit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)unit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode(void* path, int32_t fillmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathFillMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, fillmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)fillmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend(void* brush, void* blend, void* positions, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, blend, positions, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor(void* brush, uint32_t colors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientCenterColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, colors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)colors;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint(void* brush, void* points) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientCenterPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, points);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)points;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI(void* brush, void* points) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientCenterPointI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, points);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)points;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales(void* brush, float xscale, float yscale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientFocusScales");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, xscale, yscale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)xscale;
    (void)yscale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection(void* brush, int32_t usegammacorrection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientGammaCorrection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, usegammacorrection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)usegammacorrection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend(void* brush, float focus, float scale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientLinearBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, focus, scale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath(void* brush, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend(void* brush, void* blend, void* positions, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientPresetBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, blend, positions, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)blend;
    (void)positions;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend(void* brush, float focus, float scale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientSigmaBlend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, focus, scale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)focus;
    (void)scale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount(void* brush, void* color, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientSurroundColorsWithCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, color, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)color;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform(void* brush, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode(void* brush, int32_t wrapmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathGradientWrapMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, wrapmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker(void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPathMarker");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill(void* pen, void* brush) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenBrushFill");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, brush);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)brush;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenColor(void* pen, uint32_t argb) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, argb);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)argb;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray(void* pen, void* dash, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenCompoundArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, dash, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap(void* pen, void* customcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenCustomEndCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, customcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)customcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap(void* pen, void* customcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenCustomStartCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, customcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)customcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray(void* pen, void* dash, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, dash, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)dash;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819(void* pen, int32_t dashcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashCap197819");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, dashcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)dashcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset(void* pen, float offset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, offset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)offset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle(void* pen, int32_t dashstyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenDashStyle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, dashstyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)dashstyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap(void* pen, int32_t endcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenEndCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, endcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)endcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819(void* pen, int32_t startcap, int32_t endcap, int32_t dashcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenLineCap197819");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, startcap, endcap, dashcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)startcap;
    (void)endcap;
    (void)dashcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin(void* pen, int32_t linejoin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenLineJoin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, linejoin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)linejoin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit(void* pen, float miterlimit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenMiterLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, miterlimit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)miterlimit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenMode(void* pen, int32_t penmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, penmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)penmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap(void* pen, int32_t startcap) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenStartCap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, startcap);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)startcap;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform(void* pen, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit(void* pen, int32_t unit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, unit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)unit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth(void* pen, float width) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPenWidth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, width);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)width;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode(void* graphics, int32_t pixeloffsetmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPixelOffsetMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, pixeloffsetmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)pixeloffsetmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem(void* image, void* item) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetPropertyItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(image, item);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)image;
    (void)item;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin(void* graphics, int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetRenderingOrigin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode(void* graphics, int32_t smoothingmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetSmoothingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, smoothingmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)smoothingmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor(void* brush, uint32_t color) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetSolidFillColor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, color);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)color;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign(void* format, int32_t align) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatAlign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, align);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)align;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution(void* format, uint16_t language, int32_t substitute) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatDigitSubstitution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, language, substitute);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)language;
    (void)substitute;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags(void* format, int32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix(void* format, int32_t hotkeyprefix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatHotkeyPrefix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, hotkeyprefix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)hotkeyprefix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign(void* format, int32_t align) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatLineAlign");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, align);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)align;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges(void* format, int32_t rangecount, void* ranges) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatMeasurableCharacterRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, rangecount, ranges);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)rangecount;
    (void)ranges;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops(void* format, float firsttaboffset, int32_t count, void* tabstops) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatTabStops");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, firsttaboffset, count, tabstops);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)firsttaboffset;
    (void)count;
    (void)tabstops;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming(void* format, int32_t trimming) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetStringFormatTrimming");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, trimming);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)trimming;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast(void* graphics, uint32_t contrast) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextContrast");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, contrast);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)contrast;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint(void* graphics, int32_t mode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextRenderingHint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, mode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)mode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform(void* brush, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextureTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode(void* brush, int32_t wrapmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetTextureWrapMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, wrapmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)wrapmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform(void* graphics, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipSetWorldTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipShearMatrix(void* matrix, float shearx, float sheary, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipShearMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, shearx, sheary, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)shearx;
    (void)sheary;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure(void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipStartPathFigure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault(void* format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipStringFormatGetGenericDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic(void* format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipStringFormatGetGenericTypographic");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTestControl(int32_t control, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTestControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(control, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)control;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints(void* matrix, void* pts, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformMatrixPoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, pts, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI(void* matrix, void* pts, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformMatrixPointsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, pts, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTransformPath(void* path, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTransformPoints(void* graphics, int32_t destspace, int32_t srcspace, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformPoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, destspace, srcspace, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)destspace;
    (void)srcspace;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI(void* graphics, int32_t destspace, int32_t srcspace, void* points, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformPointsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, destspace, srcspace, points, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)destspace;
    (void)srcspace;
    (void)points;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTransformRegion(void* region, void* matrix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTransformRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, matrix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)matrix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTranslateClip(void* graphics, float dx, float dy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateClip");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, dx, dy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI(void* graphics, int32_t dx, int32_t dy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateClipI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, dx, dy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform(void* brush, float dx, float dy, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateLineTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, dx, dy, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix(void* matrix, float offsetx, float offsety, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateMatrix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, offsetx, offsety, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)offsetx;
    (void)offsety;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform(void* brush, float dx, float dy, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslatePathGradientTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, dx, dy, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform(void* pen, float dx, float dy, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslatePenTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pen, dx, dy, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pen;
    (void)dx;
    (void)dy;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion(void* region, float dx, float dy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, dx, dy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI(void* region, int32_t dx, int32_t dy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateRegionI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(region, dx, dy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)region;
    (void)dx;
    (void)dy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform(void* brush, float dx, float dy, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateTextureTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(brush, dx, dy, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)brush;
    (void)dx;
    (void)dy;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform(void* graphics, float dx, float dy, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipTranslateWorldTransform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(graphics, dx, dy, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)graphics;
    (void)dx;
    (void)dy;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints(void* matrix, void* pts, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipVectorTransformMatrixPoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, pts, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI(void* matrix, void* pts, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipVectorTransformMatrixPointsI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(matrix, pts, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)matrix;
    (void)pts;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipWarpPath(void* path, void* matrix, void* points, int32_t count, float srcx, float srcy, float srcwidth, float srcheight, int32_t warpmode, float flatness) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, float, float, float, float, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipWarpPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, matrix, points, count, srcx, srcy, srcwidth, srcheight, warpmode, flatness);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)matrix;
    (void)points;
    (void)count;
    (void)srcx;
    (void)srcy;
    (void)srcwidth;
    (void)srcheight;
    (void)warpmode;
    (void)flatness;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipWidenPath(void* nativepath, void* pen, void* matrix, float flatness) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipWidenPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nativepath, pen, matrix, flatness);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nativepath;
    (void)pen;
    (void)matrix;
    (void)flatness;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline(void* path, void* matrix, float flatness) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdipWindingModeOutline");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, matrix, flatness);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)path;
    (void)matrix;
    (void)flatness;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationHook(void* token) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusNotificationHook");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)token;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(uint64_t token) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusNotificationUnhook");
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

void windowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(uint64_t token) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusShutdown");
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

int32_t windowssysWindowsWin32GraphicsGdiplusGdiplusStartup(void* token, void* input, void* output) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdiplus.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GdiplusStartup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token, input, output);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)token;
    (void)input;
    (void)output;
    errno = ENOSYS;
    return -1;
#endif
}

