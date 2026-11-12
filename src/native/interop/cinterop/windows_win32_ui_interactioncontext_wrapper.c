#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_interactioncontext_wrapper.h"
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

int32_t windowssysWindowsWin32UiInteractioncontextAddPointerInteractionContext(void* interactioncontext, uint32_t pointerid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPointerInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, pointerid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)pointerid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextBufferPointerPacketsInteractionContext(void* interactioncontext, uint32_t entriescount, void* pointerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BufferPointerPacketsInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, entriescount, pointerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)entriescount;
    (void)pointerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextCreateInteractionContext(void* interactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextDestroyInteractionContext(void* interactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextGetCrossSlideParameterInteractionContext(void* interactioncontext, int32_t threshold, void* distance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCrossSlideParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, threshold, distance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)threshold;
    (void)distance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextGetHoldParameterInteractionContext(void* interactioncontext, int32_t parameter, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHoldParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, parameter, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextGetInertiaParameterInteractionContext(void* interactioncontext, int32_t inertiaparameter, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInertiaParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, inertiaparameter, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)inertiaparameter;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextGetInteractionConfigurationInteractionContext(void* interactioncontext, uint32_t configurationcount, void* configuration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInteractionConfigurationInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, configurationcount, configuration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)configurationcount;
    (void)configuration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextGetMouseWheelParameterInteractionContext(void* interactioncontext, int32_t parameter, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMouseWheelParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, parameter, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextGetPropertyInteractionContext(void* interactioncontext, int32_t contextproperty, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPropertyInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, contextproperty, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)contextproperty;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextGetStateInteractionContext(void* interactioncontext, void* pointerinfo, void* state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStateInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, pointerinfo, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)pointerinfo;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextGetTapParameterInteractionContext(void* interactioncontext, int32_t parameter, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTapParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, parameter, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextGetTranslationParameterInteractionContext(void* interactioncontext, int32_t parameter, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTranslationParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, parameter, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextProcessBufferedPacketsInteractionContext(void* interactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessBufferedPacketsInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextProcessInertiaInteractionContext(void* interactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessInertiaInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextProcessPointerFramesInteractionContext(void* interactioncontext, uint32_t entriescount, uint32_t pointercount, void* pointerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessPointerFramesInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, entriescount, pointercount, pointerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)entriescount;
    (void)pointercount;
    (void)pointerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext(void* interactioncontext, void* outputcallback, void* clientdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterOutputCallbackInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, outputcallback, clientdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)outputcallback;
    (void)clientdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextRegisterOutputCallbackInteractionContext2(void* interactioncontext, void* outputcallback, void* clientdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterOutputCallbackInteractionContext2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, outputcallback, clientdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)outputcallback;
    (void)clientdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextRemovePointerInteractionContext(void* interactioncontext, uint32_t pointerid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePointerInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, pointerid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)pointerid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextResetInteractionContext(void* interactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextSetCrossSlideParametersInteractionContext(void* interactioncontext, uint32_t parametercount, void* crossslideparameters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCrossSlideParametersInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, parametercount, crossslideparameters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)parametercount;
    (void)crossslideparameters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextSetHoldParameterInteractionContext(void* interactioncontext, int32_t parameter, float value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetHoldParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, parameter, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextSetInertiaParameterInteractionContext(void* interactioncontext, int32_t inertiaparameter, float value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetInertiaParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, inertiaparameter, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)inertiaparameter;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextSetInteractionConfigurationInteractionContext(void* interactioncontext, uint32_t configurationcount, void* configuration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetInteractionConfigurationInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, configurationcount, configuration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)configurationcount;
    (void)configuration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextSetMouseWheelParameterInteractionContext(void* interactioncontext, int32_t parameter, float value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMouseWheelParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, parameter, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextSetPivotInteractionContext(void* interactioncontext, float x, float y, float radius) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, float, float, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPivotInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, x, y, radius);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)x;
    (void)y;
    (void)radius;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextSetPropertyInteractionContext(void* interactioncontext, int32_t contextproperty, uint32_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPropertyInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, contextproperty, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)contextproperty;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextSetTapParameterInteractionContext(void* interactioncontext, int32_t parameter, float value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTapParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, parameter, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextSetTranslationParameterInteractionContext(void* interactioncontext, int32_t parameter, float value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, float);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTranslationParameterInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext, parameter, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    (void)parameter;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32UiInteractioncontextStopInteractionContext(void* interactioncontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ninput.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StopInteractionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interactioncontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)interactioncontext;
    errno = ENOSYS;
    return -1;
#endif
}

