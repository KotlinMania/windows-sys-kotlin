#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_globalization_wrapper.h"
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

int32_t windowssys_windows_win32_globalization_AdjustCalendarDate(void* lpcaldatetime, int32_t calunit, int32_t amount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustCalendarDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcaldatetime, calunit, amount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcaldatetime;
    (void)calunit;
    (void)amount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_CompareStringA(uint32_t locale, uint32_t dwcmpflags, void* lpstring1, int32_t cchcount1, void* lpstring2, int32_t cchcount2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwcmpflags, lpstring1, cchcount1, lpstring2, cchcount2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwcmpflags;
    (void)lpstring1;
    (void)cchcount1;
    (void)lpstring2;
    (void)cchcount2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_CompareStringEx(void* lplocalename, uint32_t dwcmpflags, void* lpstring1, int32_t cchcount1, void* lpstring2, int32_t cchcount2, void* lpversioninformation, void* lpreserved, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareStringEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, dwcmpflags, lpstring1, cchcount1, lpstring2, cchcount2, lpversioninformation, lpreserved, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)dwcmpflags;
    (void)lpstring1;
    (void)cchcount1;
    (void)lpstring2;
    (void)cchcount2;
    (void)lpversioninformation;
    (void)lpreserved;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_CompareStringOrdinal(void* lpstring1, int32_t cchcount1, void* lpstring2, int32_t cchcount2, int32_t bignorecase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareStringOrdinal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, cchcount1, lpstring2, cchcount2, bignorecase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpstring1;
    (void)cchcount1;
    (void)lpstring2;
    (void)cchcount2;
    (void)bignorecase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_CompareStringW(uint32_t locale, uint32_t dwcmpflags, void* lpstring1, int32_t cchcount1, void* lpstring2, int32_t cchcount2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwcmpflags, lpstring1, cchcount1, lpstring2, cchcount2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwcmpflags;
    (void)lpstring1;
    (void)cchcount1;
    (void)lpstring2;
    (void)cchcount2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ConvertCalDateTimeToSystemTime(void* lpcaldatetime, void* lpsystime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertCalDateTimeToSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcaldatetime, lpsystime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcaldatetime;
    (void)lpsystime;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_ConvertDefaultLocale(uint32_t locale) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertDefaultLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)locale;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_ConvertSystemTimeToCalDateTime(void* lpsystime, uint32_t calid, void* lpcaldatetime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSystemTimeToCalDateTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystime, calid, lpcaldatetime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystime;
    (void)calid;
    (void)lpcaldatetime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumCalendarInfoA(void* lpcalinfoenumproc, uint32_t locale, uint32_t calendar, uint32_t caltype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumCalendarInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcalinfoenumproc, locale, calendar, caltype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcalinfoenumproc;
    (void)locale;
    (void)calendar;
    (void)caltype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumCalendarInfoExA(void* lpcalinfoenumprocex, uint32_t locale, uint32_t calendar, uint32_t caltype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumCalendarInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcalinfoenumprocex, locale, calendar, caltype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcalinfoenumprocex;
    (void)locale;
    (void)calendar;
    (void)caltype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumCalendarInfoExEx(void* pcalinfoenumprocexex, void* lplocalename, uint32_t calendar, void* lpreserved, uint32_t caltype, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumCalendarInfoExEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcalinfoenumprocexex, lplocalename, calendar, lpreserved, caltype, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcalinfoenumprocexex;
    (void)lplocalename;
    (void)calendar;
    (void)lpreserved;
    (void)caltype;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumCalendarInfoExW(void* lpcalinfoenumprocex, uint32_t locale, uint32_t calendar, uint32_t caltype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumCalendarInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcalinfoenumprocex, locale, calendar, caltype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcalinfoenumprocex;
    (void)locale;
    (void)calendar;
    (void)caltype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumCalendarInfoW(void* lpcalinfoenumproc, uint32_t locale, uint32_t calendar, uint32_t caltype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumCalendarInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcalinfoenumproc, locale, calendar, caltype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcalinfoenumproc;
    (void)locale;
    (void)calendar;
    (void)caltype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumDateFormatsA(void* lpdatefmtenumproc, uint32_t locale, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDateFormatsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdatefmtenumproc, locale, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdatefmtenumproc;
    (void)locale;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumDateFormatsExA(void* lpdatefmtenumprocex, uint32_t locale, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDateFormatsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdatefmtenumprocex, locale, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdatefmtenumprocex;
    (void)locale;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumDateFormatsExEx(void* lpdatefmtenumprocexex, void* lplocalename, uint32_t dwflags, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDateFormatsExEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdatefmtenumprocexex, lplocalename, dwflags, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdatefmtenumprocexex;
    (void)lplocalename;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumDateFormatsExW(void* lpdatefmtenumprocex, uint32_t locale, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDateFormatsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdatefmtenumprocex, locale, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdatefmtenumprocex;
    (void)locale;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumDateFormatsW(void* lpdatefmtenumproc, uint32_t locale, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDateFormatsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdatefmtenumproc, locale, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdatefmtenumproc;
    (void)locale;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumLanguageGroupLocalesA(void* lplanggrouplocaleenumproc, uint32_t languagegroup, uint32_t dwflags, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumLanguageGroupLocalesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplanggrouplocaleenumproc, languagegroup, dwflags, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplanggrouplocaleenumproc;
    (void)languagegroup;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumLanguageGroupLocalesW(void* lplanggrouplocaleenumproc, uint32_t languagegroup, uint32_t dwflags, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumLanguageGroupLocalesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplanggrouplocaleenumproc, languagegroup, dwflags, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplanggrouplocaleenumproc;
    (void)languagegroup;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumSystemCodePagesA(void* lpcodepageenumproc, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemCodePagesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcodepageenumproc, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcodepageenumproc;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumSystemCodePagesW(void* lpcodepageenumproc, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemCodePagesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcodepageenumproc, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcodepageenumproc;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumSystemGeoID(uint32_t geoclass, int32_t parentgeoid, void* lpgeoenumproc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemGeoID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(geoclass, parentgeoid, lpgeoenumproc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)geoclass;
    (void)parentgeoid;
    (void)lpgeoenumproc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumSystemGeoNames(uint32_t geoclass, void* geoenumproc, int64_t data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemGeoNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(geoclass, geoenumproc, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)geoclass;
    (void)geoenumproc;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumSystemLanguageGroupsA(void* lplanguagegroupenumproc, uint32_t dwflags, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemLanguageGroupsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplanguagegroupenumproc, dwflags, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplanguagegroupenumproc;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumSystemLanguageGroupsW(void* lplanguagegroupenumproc, uint32_t dwflags, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemLanguageGroupsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplanguagegroupenumproc, dwflags, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplanguagegroupenumproc;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumSystemLocalesA(void* lplocaleenumproc, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemLocalesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocaleenumproc, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocaleenumproc;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumSystemLocalesEx(void* lplocaleenumprocex, uint32_t dwflags, int64_t lparam, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemLocalesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocaleenumprocex, dwflags, lparam, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocaleenumprocex;
    (void)dwflags;
    (void)lparam;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumSystemLocalesW(void* lplocaleenumproc, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumSystemLocalesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocaleenumproc, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocaleenumproc;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumTimeFormatsA(void* lptimefmtenumproc, uint32_t locale, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumTimeFormatsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimefmtenumproc, locale, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimefmtenumproc;
    (void)locale;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumTimeFormatsEx(void* lptimefmtenumprocex, void* lplocalename, uint32_t dwflags, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumTimeFormatsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimefmtenumprocex, lplocalename, dwflags, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimefmtenumprocex;
    (void)lplocalename;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumTimeFormatsW(void* lptimefmtenumproc, uint32_t locale, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumTimeFormatsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimefmtenumproc, locale, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptimefmtenumproc;
    (void)locale;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumUILanguagesA(void* lpuilanguageenumproc, uint32_t dwflags, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumUILanguagesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpuilanguageenumproc, dwflags, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpuilanguageenumproc;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_EnumUILanguagesW(void* lpuilanguageenumproc, uint32_t dwflags, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumUILanguagesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpuilanguageenumproc, dwflags, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpuilanguageenumproc;
    (void)dwflags;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_FindNLSString(uint32_t locale, uint32_t dwfindnlsstringflags, void* lpstringsource, int32_t cchsource, void* lpstringvalue, int32_t cchvalue, void* pcchfound) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNLSString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwfindnlsstringflags, lpstringsource, cchsource, lpstringvalue, cchvalue, pcchfound);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwfindnlsstringflags;
    (void)lpstringsource;
    (void)cchsource;
    (void)lpstringvalue;
    (void)cchvalue;
    (void)pcchfound;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_FindNLSStringEx(void* lplocalename, uint32_t dwfindnlsstringflags, void* lpstringsource, int32_t cchsource, void* lpstringvalue, int32_t cchvalue, void* pcchfound, void* lpversioninformation, void* lpreserved, int64_t sorthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, int32_t, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNLSStringEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, dwfindnlsstringflags, lpstringsource, cchsource, lpstringvalue, cchvalue, pcchfound, lpversioninformation, lpreserved, sorthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)dwfindnlsstringflags;
    (void)lpstringsource;
    (void)cchsource;
    (void)lpstringvalue;
    (void)cchvalue;
    (void)pcchfound;
    (void)lpversioninformation;
    (void)lpreserved;
    (void)sorthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_FindStringOrdinal(uint32_t dwfindstringordinalflags, void* lpstringsource, int32_t cchsource, void* lpstringvalue, int32_t cchvalue, int32_t bignorecase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindStringOrdinal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwfindstringordinalflags, lpstringsource, cchsource, lpstringvalue, cchvalue, bignorecase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwfindstringordinalflags;
    (void)lpstringsource;
    (void)cchsource;
    (void)lpstringvalue;
    (void)cchvalue;
    (void)bignorecase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_FoldStringA(uint32_t dwmapflags, void* lpsrcstr, int32_t cchsrc, void* lpdeststr, int32_t cchdest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FoldStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmapflags, lpsrcstr, cchsrc, lpdeststr, cchdest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwmapflags;
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_FoldStringW(uint32_t dwmapflags, void* lpsrcstr, int32_t cchsrc, void* lpdeststr, int32_t cchdest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FoldStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmapflags, lpsrcstr, cchsrc, lpdeststr, cchdest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwmapflags;
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_GetACP(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetACP");
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

int32_t windowssys_windows_win32_globalization_GetCPInfo(uint32_t codepage, void* lpcpinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCPInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, lpcpinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)codepage;
    (void)lpcpinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetCPInfoExA(uint32_t codepage, uint32_t dwflags, void* lpcpinfoex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCPInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, dwflags, lpcpinfoex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)codepage;
    (void)dwflags;
    (void)lpcpinfoex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetCPInfoExW(uint32_t codepage, uint32_t dwflags, void* lpcpinfoex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCPInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, dwflags, lpcpinfoex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)codepage;
    (void)dwflags;
    (void)lpcpinfoex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetCalendarDateFormatEx(void* lpszlocale, uint32_t dwflags, void* lpcaldatetime, void* lpformat, void* lpdatestr, int32_t cchdate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCalendarDateFormatEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszlocale, dwflags, lpcaldatetime, lpformat, lpdatestr, cchdate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszlocale;
    (void)dwflags;
    (void)lpcaldatetime;
    (void)lpformat;
    (void)lpdatestr;
    (void)cchdate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetCalendarInfoA(uint32_t locale, uint32_t calendar, uint32_t caltype, void* lpcaldata, int32_t cchdata, void* lpvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCalendarInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, calendar, caltype, lpcaldata, cchdata, lpvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)calendar;
    (void)caltype;
    (void)lpcaldata;
    (void)cchdata;
    (void)lpvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetCalendarInfoEx(void* lplocalename, uint32_t calendar, void* lpreserved, uint32_t caltype, void* lpcaldata, int32_t cchdata, void* lpvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCalendarInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, calendar, lpreserved, caltype, lpcaldata, cchdata, lpvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)calendar;
    (void)lpreserved;
    (void)caltype;
    (void)lpcaldata;
    (void)cchdata;
    (void)lpvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetCalendarInfoW(uint32_t locale, uint32_t calendar, uint32_t caltype, void* lpcaldata, int32_t cchdata, void* lpvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCalendarInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, calendar, caltype, lpcaldata, cchdata, lpvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)calendar;
    (void)caltype;
    (void)lpcaldata;
    (void)cchdata;
    (void)lpvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetCalendarSupportedDateRange(uint32_t calendar, void* lpcalmindatetime, void* lpcalmaxdatetime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCalendarSupportedDateRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(calendar, lpcalmindatetime, lpcalmaxdatetime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)calendar;
    (void)lpcalmindatetime;
    (void)lpcalmaxdatetime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetCurrencyFormatA(uint32_t locale, uint32_t dwflags, void* lpvalue, void* lpformat, void* lpcurrencystr, int32_t cchcurrency) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrencyFormatA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwflags, lpvalue, lpformat, lpcurrencystr, cchcurrency);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwflags;
    (void)lpvalue;
    (void)lpformat;
    (void)lpcurrencystr;
    (void)cchcurrency;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetCurrencyFormatEx(void* lplocalename, uint32_t dwflags, void* lpvalue, void* lpformat, void* lpcurrencystr, int32_t cchcurrency) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrencyFormatEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, dwflags, lpvalue, lpformat, lpcurrencystr, cchcurrency);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)dwflags;
    (void)lpvalue;
    (void)lpformat;
    (void)lpcurrencystr;
    (void)cchcurrency;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetCurrencyFormatW(uint32_t locale, uint32_t dwflags, void* lpvalue, void* lpformat, void* lpcurrencystr, int32_t cchcurrency) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrencyFormatW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwflags, lpvalue, lpformat, lpcurrencystr, cchcurrency);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwflags;
    (void)lpvalue;
    (void)lpformat;
    (void)lpcurrencystr;
    (void)cchcurrency;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetDateFormatA(uint32_t locale, uint32_t dwflags, void* lpdate, void* lpformat, void* lpdatestr, int32_t cchdate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDateFormatA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwflags, lpdate, lpformat, lpdatestr, cchdate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwflags;
    (void)lpdate;
    (void)lpformat;
    (void)lpdatestr;
    (void)cchdate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetDateFormatEx(void* lplocalename, uint32_t dwflags, void* lpdate, void* lpformat, void* lpdatestr, int32_t cchdate, void* lpcalendar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDateFormatEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, dwflags, lpdate, lpformat, lpdatestr, cchdate, lpcalendar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)dwflags;
    (void)lpdate;
    (void)lpformat;
    (void)lpdatestr;
    (void)cchdate;
    (void)lpcalendar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetDateFormatW(uint32_t locale, uint32_t dwflags, void* lpdate, void* lpformat, void* lpdatestr, int32_t cchdate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDateFormatW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwflags, lpdate, lpformat, lpdatestr, cchdate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwflags;
    (void)lpdate;
    (void)lpformat;
    (void)lpdatestr;
    (void)cchdate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetDistanceOfClosestLanguageInList(void* pszlanguage, void* pszlanguageslist, uint16_t wchlistdelimiter, void* pclosestdistance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcp47mrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDistanceOfClosestLanguageInList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlanguage, pszlanguageslist, wchlistdelimiter, pclosestdistance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszlanguage;
    (void)pszlanguageslist;
    (void)wchlistdelimiter;
    (void)pclosestdistance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetDurationFormat(uint32_t locale, uint32_t dwflags, void* lpduration, uint64_t ullduration, void* lpformat, void* lpdurationstr, int32_t cchduration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDurationFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwflags, lpduration, ullduration, lpformat, lpdurationstr, cchduration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwflags;
    (void)lpduration;
    (void)ullduration;
    (void)lpformat;
    (void)lpdurationstr;
    (void)cchduration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetDurationFormatEx(void* lplocalename, uint32_t dwflags, void* lpduration, uint64_t ullduration, void* lpformat, void* lpdurationstr, int32_t cchduration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDurationFormatEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, dwflags, lpduration, ullduration, lpformat, lpdurationstr, cchduration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)dwflags;
    (void)lpduration;
    (void)ullduration;
    (void)lpformat;
    (void)lpdurationstr;
    (void)cchduration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetFileMUIInfo(uint32_t dwflags, void* pcwszfilepath, void* pfilemuiinfo, void* pcbfilemuiinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileMUIInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pcwszfilepath, pfilemuiinfo, pcbfilemuiinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pcwszfilepath;
    (void)pfilemuiinfo;
    (void)pcbfilemuiinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetFileMUIPath(uint32_t dwflags, void* pcwszfilepath, void* pwszlanguage, void* pcchlanguage, void* pwszfilemuipath, void* pcchfilemuipath, void* pululenumerator) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileMUIPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pcwszfilepath, pwszlanguage, pcchlanguage, pwszfilemuipath, pcchfilemuipath, pululenumerator);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pcwszfilepath;
    (void)pwszlanguage;
    (void)pcchlanguage;
    (void)pwszfilemuipath;
    (void)pcchfilemuipath;
    (void)pululenumerator;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetGeoInfoA(int32_t location, int32_t geotype, void* lpgeodata, int32_t cchdata, uint16_t langid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGeoInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(location, geotype, lpgeodata, cchdata, langid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)location;
    (void)geotype;
    (void)lpgeodata;
    (void)cchdata;
    (void)langid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetGeoInfoEx(void* location, int32_t geotype, void* geodata, int32_t geodatacount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGeoInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(location, geotype, geodata, geodatacount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)location;
    (void)geotype;
    (void)geodata;
    (void)geodatacount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetGeoInfoW(int32_t location, int32_t geotype, void* lpgeodata, int32_t cchdata, uint16_t langid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGeoInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(location, geotype, lpgeodata, cchdata, langid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)location;
    (void)geotype;
    (void)lpgeodata;
    (void)cchdata;
    (void)langid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetLocaleInfoA(uint32_t locale, uint32_t lctype, void* lplcdata, int32_t cchdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLocaleInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, lctype, lplcdata, cchdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)lctype;
    (void)lplcdata;
    (void)cchdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetLocaleInfoEx(void* lplocalename, uint32_t lctype, void* lplcdata, int32_t cchdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLocaleInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, lctype, lplcdata, cchdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)lctype;
    (void)lplcdata;
    (void)cchdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetLocaleInfoW(uint32_t locale, uint32_t lctype, void* lplcdata, int32_t cchdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLocaleInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, lctype, lplcdata, cchdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)lctype;
    (void)lplcdata;
    (void)cchdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetNLSVersion(uint32_t function, uint32_t locale, void* lpversioninformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNLSVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(function, locale, lpversioninformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)function;
    (void)locale;
    (void)lpversioninformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetNLSVersionEx(uint32_t function, void* lplocalename, void* lpversioninformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNLSVersionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(function, lplocalename, lpversioninformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)function;
    (void)lplocalename;
    (void)lpversioninformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetNumberFormatA(uint32_t locale, uint32_t dwflags, void* lpvalue, void* lpformat, void* lpnumberstr, int32_t cchnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberFormatA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwflags, lpvalue, lpformat, lpnumberstr, cchnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwflags;
    (void)lpvalue;
    (void)lpformat;
    (void)lpnumberstr;
    (void)cchnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetNumberFormatEx(void* lplocalename, uint32_t dwflags, void* lpvalue, void* lpformat, void* lpnumberstr, int32_t cchnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberFormatEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, dwflags, lpvalue, lpformat, lpnumberstr, cchnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)dwflags;
    (void)lpvalue;
    (void)lpformat;
    (void)lpnumberstr;
    (void)cchnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetNumberFormatW(uint32_t locale, uint32_t dwflags, void* lpvalue, void* lpformat, void* lpnumberstr, int32_t cchnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberFormatW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwflags, lpvalue, lpformat, lpnumberstr, cchnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwflags;
    (void)lpvalue;
    (void)lpformat;
    (void)lpnumberstr;
    (void)cchnumber;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_GetOEMCP(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOEMCP");
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

int32_t windowssys_windows_win32_globalization_GetProcessPreferredUILanguages(uint32_t dwflags, void* pulnumlanguages, void* pwszlanguagesbuffer, void* pcchlanguagesbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessPreferredUILanguages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pulnumlanguages;
    (void)pwszlanguagesbuffer;
    (void)pcchlanguagesbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetStringScripts(uint32_t dwflags, void* lpstring, int32_t cchstring, void* lpscripts, int32_t cchscripts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStringScripts");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpstring, cchstring, lpscripts, cchscripts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpstring;
    (void)cchstring;
    (void)lpscripts;
    (void)cchscripts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetStringTypeA(uint32_t locale, uint32_t dwinfotype, void* lpsrcstr, int32_t cchsrc, void* lpchartype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStringTypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwinfotype, lpsrcstr, cchsrc, lpchartype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwinfotype;
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpchartype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetStringTypeExA(uint32_t locale, uint32_t dwinfotype, void* lpsrcstr, int32_t cchsrc, void* lpchartype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStringTypeExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwinfotype, lpsrcstr, cchsrc, lpchartype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwinfotype;
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpchartype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetStringTypeExW(uint32_t locale, uint32_t dwinfotype, void* lpsrcstr, int32_t cchsrc, void* lpchartype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStringTypeExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwinfotype, lpsrcstr, cchsrc, lpchartype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwinfotype;
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpchartype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetStringTypeW(uint32_t dwinfotype, void* lpsrcstr, int32_t cchsrc, void* lpchartype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStringTypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwinfotype, lpsrcstr, cchsrc, lpchartype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwinfotype;
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpchartype;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_GetSystemDefaultLCID(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDefaultLCID");
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

uint16_t windowssys_windows_win32_globalization_GetSystemDefaultLangID(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDefaultLangID");
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

int32_t windowssys_windows_win32_globalization_GetSystemDefaultLocaleName(void* lplocalename, int32_t cchlocalename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDefaultLocaleName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, cchlocalename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)cchlocalename;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_globalization_GetSystemDefaultUILanguage(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemDefaultUILanguage");
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

int32_t windowssys_windows_win32_globalization_GetSystemPreferredUILanguages(uint32_t dwflags, void* pulnumlanguages, void* pwszlanguagesbuffer, void* pcchlanguagesbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemPreferredUILanguages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pulnumlanguages;
    (void)pwszlanguagesbuffer;
    (void)pcchlanguagesbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetTextCharset(void* hdc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextCharset");
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

int32_t windowssys_windows_win32_globalization_GetTextCharsetInfo(void* hdc, void* lpsig, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTextCharsetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, lpsig, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)lpsig;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_GetThreadLocale(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadLocale");
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

int32_t windowssys_windows_win32_globalization_GetThreadPreferredUILanguages(uint32_t dwflags, void* pulnumlanguages, void* pwszlanguagesbuffer, void* pcchlanguagesbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadPreferredUILanguages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pulnumlanguages;
    (void)pwszlanguagesbuffer;
    (void)pcchlanguagesbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_globalization_GetThreadUILanguage(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadUILanguage");
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

int32_t windowssys_windows_win32_globalization_GetTimeFormatA(uint32_t locale, uint32_t dwflags, void* lptime, void* lpformat, void* lptimestr, int32_t cchtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimeFormatA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwflags, lptime, lpformat, lptimestr, cchtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwflags;
    (void)lptime;
    (void)lpformat;
    (void)lptimestr;
    (void)cchtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetTimeFormatEx(void* lplocalename, uint32_t dwflags, void* lptime, void* lpformat, void* lptimestr, int32_t cchtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimeFormatEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, dwflags, lptime, lpformat, lptimestr, cchtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)dwflags;
    (void)lptime;
    (void)lpformat;
    (void)lptimestr;
    (void)cchtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetTimeFormatW(uint32_t locale, uint32_t dwflags, void* lptime, void* lpformat, void* lptimestr, int32_t cchtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimeFormatW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwflags, lptime, lpformat, lptimestr, cchtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwflags;
    (void)lptime;
    (void)lpformat;
    (void)lptimestr;
    (void)cchtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetUILanguageInfo(uint32_t dwflags, void* pwmszlanguage, void* pwszfallbacklanguages, void* pcchfallbacklanguages, void* pattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUILanguageInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pwmszlanguage, pwszfallbacklanguages, pcchfallbacklanguages, pattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pwmszlanguage;
    (void)pwszfallbacklanguages;
    (void)pcchfallbacklanguages;
    (void)pattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetUserDefaultGeoName(void* geoname, int32_t geonamecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserDefaultGeoName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(geoname, geonamecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)geoname;
    (void)geonamecount;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_GetUserDefaultLCID(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserDefaultLCID");
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

uint16_t windowssys_windows_win32_globalization_GetUserDefaultLangID(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserDefaultLangID");
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

int32_t windowssys_windows_win32_globalization_GetUserDefaultLocaleName(void* lplocalename, int32_t cchlocalename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserDefaultLocaleName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, cchlocalename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)cchlocalename;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_globalization_GetUserDefaultUILanguage(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserDefaultUILanguage");
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

int32_t windowssys_windows_win32_globalization_GetUserGeoID(int32_t geoclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserGeoID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(geoclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)geoclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_GetUserPreferredUILanguages(uint32_t dwflags, void* pulnumlanguages, void* pwszlanguagesbuffer, void* pcchlanguagesbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserPreferredUILanguages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pulnumlanguages, pwszlanguagesbuffer, pcchlanguagesbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pulnumlanguages;
    (void)pwszlanguagesbuffer;
    (void)pcchlanguagesbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IdnToAscii(uint32_t dwflags, void* lpunicodecharstr, int32_t cchunicodechar, void* lpasciicharstr, int32_t cchasciichar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("normaliz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IdnToAscii");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpunicodecharstr, cchunicodechar, lpasciicharstr, cchasciichar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpunicodecharstr;
    (void)cchunicodechar;
    (void)lpasciicharstr;
    (void)cchasciichar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IdnToNameprepUnicode(uint32_t dwflags, void* lpunicodecharstr, int32_t cchunicodechar, void* lpnameprepcharstr, int32_t cchnameprepchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IdnToNameprepUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpunicodecharstr, cchunicodechar, lpnameprepcharstr, cchnameprepchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpunicodecharstr;
    (void)cchunicodechar;
    (void)lpnameprepcharstr;
    (void)cchnameprepchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IdnToUnicode(uint32_t dwflags, void* lpasciicharstr, int32_t cchasciichar, void* lpunicodecharstr, int32_t cchunicodechar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("normaliz.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IdnToUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpasciicharstr, cchasciichar, lpunicodecharstr, cchunicodechar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpasciicharstr;
    (void)cchasciichar;
    (void)lpunicodecharstr;
    (void)cchunicodechar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IsCalendarLeapYear(uint32_t calid, uint32_t year, uint32_t era) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCalendarLeapYear");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(calid, year, era);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)calid;
    (void)year;
    (void)era;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IsDBCSLeadByte(uint8_t testchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDBCSLeadByte");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(testchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)testchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IsDBCSLeadByteEx(uint32_t codepage, uint8_t testchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDBCSLeadByteEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, testchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)codepage;
    (void)testchar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IsNLSDefinedString(uint32_t function, uint32_t dwflags, void* lpversioninformation, void* lpstring, int32_t cchstr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNLSDefinedString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(function, dwflags, lpversioninformation, lpstring, cchstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)function;
    (void)dwflags;
    (void)lpversioninformation;
    (void)lpstring;
    (void)cchstr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IsNormalizedString(int32_t normform, void* lpstring, int32_t cwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNormalizedString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(normform, lpstring, cwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)normform;
    (void)lpstring;
    (void)cwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IsTextUnicode(void* lpv, int32_t isize, void* lpiresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsTextUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpv, isize, lpiresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpv;
    (void)isize;
    (void)lpiresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IsValidCodePage(uint32_t codepage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidCodePage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)codepage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IsValidLanguageGroup(uint32_t languagegroup, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidLanguageGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(languagegroup, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)languagegroup;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IsValidLocale(uint32_t locale, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_IsValidLocaleName(void* lplocalename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidLocaleName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_IsValidNLSVersion(uint32_t function, void* lplocalename, void* lpversioninformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidNLSVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(function, lplocalename, lpversioninformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)function;
    (void)lplocalename;
    (void)lpversioninformation;
    errno = ENOSYS;
    return 0;
#endif
}

uint8_t windowssys_windows_win32_globalization_IsWellFormedTag(void* psztag) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcp47mrm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWellFormedTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztag);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psztag;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_LCIDToLocaleName(uint32_t locale, void* lpname, int32_t cchname, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LCIDToLocaleName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, lpname, cchname, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)lpname;
    (void)cchname;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_LCMapStringA(uint32_t locale, uint32_t dwmapflags, void* lpsrcstr, int32_t cchsrc, void* lpdeststr, int32_t cchdest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LCMapStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwmapflags, lpsrcstr, cchsrc, lpdeststr, cchdest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwmapflags;
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_LCMapStringEx(void* lplocalename, uint32_t dwmapflags, void* lpsrcstr, int32_t cchsrc, void* lpdeststr, int32_t cchdest, void* lpversioninformation, void* lpreserved, int64_t sorthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LCMapStringEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalename, dwmapflags, lpsrcstr, cchsrc, lpdeststr, cchdest, lpversioninformation, lpreserved, sorthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalename;
    (void)dwmapflags;
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    (void)lpversioninformation;
    (void)lpreserved;
    (void)sorthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_LCMapStringW(uint32_t locale, uint32_t dwmapflags, void* lpsrcstr, int32_t cchsrc, void* lpdeststr, int32_t cchdest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LCMapStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dwmapflags, lpsrcstr, cchsrc, lpdeststr, cchdest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)dwmapflags;
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_LocaleNameToLCID(void* lpname, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocaleNameToLCID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_MappingDoAction(void* pbag, uint32_t dwrangeindex, void* pszactionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("elscore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MappingDoAction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbag, dwrangeindex, pszactionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbag;
    (void)dwrangeindex;
    (void)pszactionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_MappingFreePropertyBag(void* pbag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("elscore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MappingFreePropertyBag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_MappingFreeServices(void* pserviceinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("elscore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MappingFreeServices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pserviceinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pserviceinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_MappingGetServices(void* poptions, void* prgservices, void* pdwservicescount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("elscore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MappingGetServices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poptions, prgservices, pdwservicescount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)poptions;
    (void)prgservices;
    (void)pdwservicescount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_MappingRecognizeText(void* pserviceinfo, void* psztext, uint32_t dwlength, uint32_t dwindex, void* poptions, void* pbag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("elscore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MappingRecognizeText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pserviceinfo, psztext, dwlength, dwindex, poptions, pbag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pserviceinfo;
    (void)psztext;
    (void)dwlength;
    (void)dwindex;
    (void)poptions;
    (void)pbag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_MultiByteToWideChar(uint32_t codepage, uint32_t dwflags, void* lpmultibytestr, int32_t cbmultibyte, void* lpwidecharstr, int32_t cchwidechar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MultiByteToWideChar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, dwflags, lpmultibytestr, cbmultibyte, lpwidecharstr, cchwidechar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)codepage;
    (void)dwflags;
    (void)lpmultibytestr;
    (void)cbmultibyte;
    (void)lpwidecharstr;
    (void)cchwidechar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_NormalizeString(int32_t normform, void* lpsrcstring, int32_t cwsrclength, void* lpdststring, int32_t cwdstlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NormalizeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(normform, lpsrcstring, cwsrclength, lpdststring, cwdstlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)normform;
    (void)lpsrcstring;
    (void)cwsrclength;
    (void)lpdststring;
    (void)cwdstlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_NotifyUILanguageChange(uint32_t dwflags, void* pcwstrnewlanguage, void* pcwstrpreviouslanguage, uint32_t dwreserved, void* pdwstatusrtrn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyUILanguageChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pcwstrnewlanguage, pcwstrpreviouslanguage, dwreserved, pdwstatusrtrn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pcwstrnewlanguage;
    (void)pcwstrpreviouslanguage;
    (void)dwreserved;
    (void)pdwstatusrtrn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ResolveLocaleName(void* lpnametoresolve, void* lplocalename, int32_t cchlocalename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResolveLocaleName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnametoresolve, lplocalename, cchlocalename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpnametoresolve;
    (void)lplocalename;
    (void)cchlocalename;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_RestoreThreadPreferredUILanguages(void* snapshot) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreThreadPreferredUILanguages");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(snapshot);
        return;
    }
    errno = ENOSYS;
#else
    (void)snapshot;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptApplyDigitSubstitution(void* psds, void* psc, void* pss) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptApplyDigitSubstitution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psds, psc, pss);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psds;
    (void)psc;
    (void)pss;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptApplyLogicalWidth(void* pidx, int32_t cchars, int32_t cglyphs, void* pwlogclust, void* psva, void* piadvance, void* psa, void* pabc, void* pijustify) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptApplyLogicalWidth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidx, cchars, cglyphs, pwlogclust, psva, piadvance, psa, pabc, pijustify);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pidx;
    (void)cchars;
    (void)cglyphs;
    (void)pwlogclust;
    (void)psva;
    (void)piadvance;
    (void)psa;
    (void)pabc;
    (void)pijustify;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptBreak(void* pwcchars, int32_t cchars, void* psa, void* psla) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptBreak");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcchars, cchars, psa, psla);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcchars;
    (void)cchars;
    (void)psa;
    (void)psla;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptCPtoX(int32_t icp, int32_t ftrailing, int32_t cchars, int32_t cglyphs, void* pwlogclust, void* psva, void* piadvance, void* psa, void* pix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptCPtoX");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(icp, ftrailing, cchars, cglyphs, pwlogclust, psva, piadvance, psa, pix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)icp;
    (void)ftrailing;
    (void)cchars;
    (void)cglyphs;
    (void)pwlogclust;
    (void)psva;
    (void)piadvance;
    (void)psa;
    (void)pix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptCacheGetHeight(void* hdc, void* psc, void* tmheight) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptCacheGetHeight");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, tmheight);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)tmheight;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptFreeCache(void* psc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptFreeCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptGetCMap(void* hdc, void* psc, void* pwcinchars, int32_t cchars, uint32_t dwflags, void* pwoutglyphs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptGetCMap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, pwcinchars, cchars, dwflags, pwoutglyphs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)pwcinchars;
    (void)cchars;
    (void)dwflags;
    (void)pwoutglyphs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptGetFontAlternateGlyphs(void* hdc, void* psc, void* psa, uint32_t tagscript, uint32_t taglangsys, uint32_t tagfeature, uint16_t wglyphid, int32_t cmaxalternates, void* palternateglyphs, void* pcalternates) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint16_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptGetFontAlternateGlyphs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, psa, tagscript, taglangsys, tagfeature, wglyphid, cmaxalternates, palternateglyphs, pcalternates);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)psa;
    (void)tagscript;
    (void)taglangsys;
    (void)tagfeature;
    (void)wglyphid;
    (void)cmaxalternates;
    (void)palternateglyphs;
    (void)pcalternates;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptGetFontFeatureTags(void* hdc, void* psc, void* psa, uint32_t tagscript, uint32_t taglangsys, int32_t cmaxtags, void* pfeaturetags, void* pctags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptGetFontFeatureTags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, psa, tagscript, taglangsys, cmaxtags, pfeaturetags, pctags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)psa;
    (void)tagscript;
    (void)taglangsys;
    (void)cmaxtags;
    (void)pfeaturetags;
    (void)pctags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptGetFontLanguageTags(void* hdc, void* psc, void* psa, uint32_t tagscript, int32_t cmaxtags, void* plangsystags, void* pctags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptGetFontLanguageTags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, psa, tagscript, cmaxtags, plangsystags, pctags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)psa;
    (void)tagscript;
    (void)cmaxtags;
    (void)plangsystags;
    (void)pctags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptGetFontProperties(void* hdc, void* psc, void* sfp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptGetFontProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, sfp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)sfp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptGetFontScriptTags(void* hdc, void* psc, void* psa, int32_t cmaxtags, void* pscripttags, void* pctags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptGetFontScriptTags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, psa, cmaxtags, pscripttags, pctags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)psa;
    (void)cmaxtags;
    (void)pscripttags;
    (void)pctags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptGetGlyphABCWidth(void* hdc, void* psc, uint16_t wglyph, void* pabc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptGetGlyphABCWidth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, wglyph, pabc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)wglyph;
    (void)pabc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptGetLogicalWidths(void* psa, int32_t cchars, int32_t cglyphs, void* piglyphwidth, void* pwlogclust, void* psva, void* pidx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptGetLogicalWidths");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psa, cchars, cglyphs, piglyphwidth, pwlogclust, psva, pidx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psa;
    (void)cchars;
    (void)cglyphs;
    (void)piglyphwidth;
    (void)pwlogclust;
    (void)psva;
    (void)pidx;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptGetProperties(void* ppsp, void* pinumscripts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptGetProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppsp, pinumscripts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ppsp;
    (void)pinumscripts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptIsComplex(void* pwcinchars, int32_t cinchars, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptIsComplex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcinchars, cinchars, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcinchars;
    (void)cinchars;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptItemize(void* pwcinchars, int32_t cinchars, int32_t cmaxitems, void* pscontrol, void* psstate, void* pitems, void* pcitems) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptItemize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcinchars, cinchars, cmaxitems, pscontrol, psstate, pitems, pcitems);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcinchars;
    (void)cinchars;
    (void)cmaxitems;
    (void)pscontrol;
    (void)psstate;
    (void)pitems;
    (void)pcitems;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptItemizeOpenType(void* pwcinchars, int32_t cinchars, int32_t cmaxitems, void* pscontrol, void* psstate, void* pitems, void* pscripttags, void* pcitems) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptItemizeOpenType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwcinchars, cinchars, cmaxitems, pscontrol, psstate, pitems, pscripttags, pcitems);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwcinchars;
    (void)cinchars;
    (void)cmaxitems;
    (void)pscontrol;
    (void)psstate;
    (void)pitems;
    (void)pscripttags;
    (void)pcitems;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptJustify(void* psva, void* piadvance, int32_t cglyphs, int32_t idx, int32_t iminkashida, void* pijustify) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptJustify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psva, piadvance, cglyphs, idx, iminkashida, pijustify);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psva;
    (void)piadvance;
    (void)cglyphs;
    (void)idx;
    (void)iminkashida;
    (void)pijustify;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptLayout(int32_t cruns, void* pblevel, void* pivisualtological, void* pilogicaltovisual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptLayout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cruns, pblevel, pivisualtological, pilogicaltovisual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cruns;
    (void)pblevel;
    (void)pivisualtological;
    (void)pilogicaltovisual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptPlace(void* hdc, void* psc, void* pwglyphs, int32_t cglyphs, void* psva, void* psa, void* piadvance, void* pgoffset, void* pabc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptPlace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, pwglyphs, cglyphs, psva, psa, piadvance, pgoffset, pabc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)pwglyphs;
    (void)cglyphs;
    (void)psva;
    (void)psa;
    (void)piadvance;
    (void)pgoffset;
    (void)pabc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptPlaceOpenType(void* hdc, void* psc, void* psa, uint32_t tagscript, uint32_t taglangsys, void* rcrangechars, void* rprangeproperties, int32_t cranges, void* pwcchars, void* pwlogclust, void* pcharprops, int32_t cchars, void* pwglyphs, void* pglyphprops, int32_t cglyphs, void* piadvance, void* pgoffset, void* pabc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, int32_t, void*, void*, void*, int32_t, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptPlaceOpenType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, psa, tagscript, taglangsys, rcrangechars, rprangeproperties, cranges, pwcchars, pwlogclust, pcharprops, cchars, pwglyphs, pglyphprops, cglyphs, piadvance, pgoffset, pabc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)psa;
    (void)tagscript;
    (void)taglangsys;
    (void)rcrangechars;
    (void)rprangeproperties;
    (void)cranges;
    (void)pwcchars;
    (void)pwlogclust;
    (void)pcharprops;
    (void)cchars;
    (void)pwglyphs;
    (void)pglyphprops;
    (void)cglyphs;
    (void)piadvance;
    (void)pgoffset;
    (void)pabc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptRecordDigitSubstitution(uint32_t locale, void* psds) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptRecordDigitSubstitution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, psds);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)psds;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptShape(void* hdc, void* psc, void* pwcchars, int32_t cchars, int32_t cmaxglyphs, void* psa, void* pwoutglyphs, void* pwlogclust, void* psva, void* pcglyphs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptShape");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, pwcchars, cchars, cmaxglyphs, psa, pwoutglyphs, pwlogclust, psva, pcglyphs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)pwcchars;
    (void)cchars;
    (void)cmaxglyphs;
    (void)psa;
    (void)pwoutglyphs;
    (void)pwlogclust;
    (void)psva;
    (void)pcglyphs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptShapeOpenType(void* hdc, void* psc, void* psa, uint32_t tagscript, uint32_t taglangsys, void* rcrangechars, void* rprangeproperties, int32_t cranges, void* pwcchars, int32_t cchars, int32_t cmaxglyphs, void* pwlogclust, void* pcharprops, void* pwoutglyphs, void* poutglyphprops, void* pcglyphs) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, int32_t, void*, int32_t, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptShapeOpenType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, psa, tagscript, taglangsys, rcrangechars, rprangeproperties, cranges, pwcchars, cchars, cmaxglyphs, pwlogclust, pcharprops, pwoutglyphs, poutglyphprops, pcglyphs);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)psa;
    (void)tagscript;
    (void)taglangsys;
    (void)rcrangechars;
    (void)rprangeproperties;
    (void)cranges;
    (void)pwcchars;
    (void)cchars;
    (void)cmaxglyphs;
    (void)pwlogclust;
    (void)pcharprops;
    (void)pwoutglyphs;
    (void)poutglyphprops;
    (void)pcglyphs;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptStringAnalyse(void* hdc, void* pstring, int32_t cstring, int32_t cglyphs, int32_t icharset, uint32_t dwflags, int32_t ireqwidth, void* pscontrol, void* psstate, void* pidx, void* ptabdef, void* pbinclass, void* pssa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptStringAnalyse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, pstring, cstring, cglyphs, icharset, dwflags, ireqwidth, pscontrol, psstate, pidx, ptabdef, pbinclass, pssa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)pstring;
    (void)cstring;
    (void)cglyphs;
    (void)icharset;
    (void)dwflags;
    (void)ireqwidth;
    (void)pscontrol;
    (void)psstate;
    (void)pidx;
    (void)ptabdef;
    (void)pbinclass;
    (void)pssa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptStringCPtoX(void* ssa, int32_t icp, int32_t ftrailing, void* px) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptStringCPtoX");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ssa, icp, ftrailing, px);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ssa;
    (void)icp;
    (void)ftrailing;
    (void)px;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptStringFree(void* pssa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptStringFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pssa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pssa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptStringGetLogicalWidths(void* ssa, void* pidx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptStringGetLogicalWidths");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ssa, pidx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ssa;
    (void)pidx;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptStringGetOrder(void* ssa, void* puorder) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptStringGetOrder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ssa, puorder);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ssa;
    (void)puorder;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptStringOut(void* ssa, int32_t ix, int32_t iy, uint32_t uoptions, void* prc, int32_t iminsel, int32_t imaxsel, int32_t fdisabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptStringOut");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ssa, ix, iy, uoptions, prc, iminsel, imaxsel, fdisabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ssa;
    (void)ix;
    (void)iy;
    (void)uoptions;
    (void)prc;
    (void)iminsel;
    (void)imaxsel;
    (void)fdisabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptStringValidate(void* ssa) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptStringValidate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ssa);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ssa;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptStringXtoCP(void* ssa, int32_t ix, void* pich, void* pitrailing) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptStringXtoCP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ssa, ix, pich, pitrailing);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ssa;
    (void)ix;
    (void)pich;
    (void)pitrailing;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ScriptString_pLogAttr(void* ssa) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptString_pLogAttr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ssa);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ssa;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ScriptString_pSize(void* ssa) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptString_pSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ssa);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ssa;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ScriptString_pcOutChars(void* ssa) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptString_pcOutChars");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ssa);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ssa;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptSubstituteSingleGlyph(void* hdc, void* psc, void* psa, uint32_t tagscript, uint32_t taglangsys, uint32_t tagfeature, int32_t lparameter, uint16_t wglyphid, void* pwoutglyphid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptSubstituteSingleGlyph");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, psa, tagscript, taglangsys, tagfeature, lparameter, wglyphid, pwoutglyphid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)psa;
    (void)tagscript;
    (void)taglangsys;
    (void)tagfeature;
    (void)lparameter;
    (void)wglyphid;
    (void)pwoutglyphid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptTextOut(void* hdc, void* psc, int32_t x, int32_t y, uint32_t fuoptions, void* lprc, void* psa, void* pwcreserved, int32_t ireserved, void* pwglyphs, int32_t cglyphs, void* piadvance, void* pijustify, void* pgoffset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, uint32_t, void*, void*, void*, int32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptTextOut");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, psc, x, y, fuoptions, lprc, psa, pwcreserved, ireserved, pwglyphs, cglyphs, piadvance, pijustify, pgoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)psc;
    (void)x;
    (void)y;
    (void)fuoptions;
    (void)lprc;
    (void)psa;
    (void)pwcreserved;
    (void)ireserved;
    (void)pwglyphs;
    (void)cglyphs;
    (void)piadvance;
    (void)pijustify;
    (void)pgoffset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ScriptXtoCP(int32_t ix, int32_t cchars, int32_t cglyphs, void* pwlogclust, void* psva, void* piadvance, void* psa, void* picp, void* pitrailing) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("usp10.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScriptXtoCP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ix, cchars, cglyphs, pwlogclust, psva, piadvance, psa, picp, pitrailing);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ix;
    (void)cchars;
    (void)cglyphs;
    (void)pwlogclust;
    (void)psva;
    (void)piadvance;
    (void)psa;
    (void)picp;
    (void)pitrailing;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_SetCalendarInfoA(uint32_t locale, uint32_t calendar, uint32_t caltype, void* lpcaldata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCalendarInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, calendar, caltype, lpcaldata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)calendar;
    (void)caltype;
    (void)lpcaldata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_SetCalendarInfoW(uint32_t locale, uint32_t calendar, uint32_t caltype, void* lpcaldata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCalendarInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, calendar, caltype, lpcaldata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)calendar;
    (void)caltype;
    (void)lpcaldata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_SetLocaleInfoA(uint32_t locale, uint32_t lctype, void* lplcdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLocaleInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, lctype, lplcdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)lctype;
    (void)lplcdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_SetLocaleInfoW(uint32_t locale, uint32_t lctype, void* lplcdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLocaleInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, lctype, lplcdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)lctype;
    (void)lplcdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_SetProcessPreferredUILanguages(uint32_t dwflags, void* pwszlanguagesbuffer, void* pulnumlanguages) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessPreferredUILanguages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pwszlanguagesbuffer, pulnumlanguages);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pwszlanguagesbuffer;
    (void)pulnumlanguages;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_SetThreadLocale(uint32_t locale) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_SetThreadPreferredUILanguages(uint32_t dwflags, void* pwszlanguagesbuffer, void* pulnumlanguages) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadPreferredUILanguages");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pwszlanguagesbuffer, pulnumlanguages);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pwszlanguagesbuffer;
    (void)pulnumlanguages;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_SetThreadPreferredUILanguages2(uint32_t flags, void* languages, void* numlanguagesset, void* snapshot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadPreferredUILanguages2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, languages, numlanguagesset, snapshot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)languages;
    (void)numlanguagesset;
    (void)snapshot;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_globalization_SetThreadUILanguage(uint16_t langid) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadUILanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(langid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)langid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_SetUserGeoID(int32_t geoid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserGeoID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(geoid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)geoid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_SetUserGeoName(void* geoname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserGeoName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(geoname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)geoname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_TranslateCharsetInfo(void* lpsrc, void* lpcs, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("gdi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateCharsetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsrc, lpcs, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsrc;
    (void)lpcs;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_ESCAPE(void* context, void* fromuargs, void* codeunits, int32_t length, int32_t codepoint, int32_t reason, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UCNV_FROM_U_CALLBACK_ESCAPE");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, fromuargs, codeunits, length, codepoint, reason, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)fromuargs;
    (void)codeunits;
    (void)length;
    (void)codepoint;
    (void)reason;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_SKIP(void* context, void* fromuargs, void* codeunits, int32_t length, int32_t codepoint, int32_t reason, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UCNV_FROM_U_CALLBACK_SKIP");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, fromuargs, codeunits, length, codepoint, reason, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)fromuargs;
    (void)codeunits;
    (void)length;
    (void)codepoint;
    (void)reason;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_STOP(void* context, void* fromuargs, void* codeunits, int32_t length, int32_t codepoint, int32_t reason, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UCNV_FROM_U_CALLBACK_STOP");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, fromuargs, codeunits, length, codepoint, reason, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)fromuargs;
    (void)codeunits;
    (void)length;
    (void)codepoint;
    (void)reason;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_UCNV_FROM_U_CALLBACK_SUBSTITUTE(void* context, void* fromuargs, void* codeunits, int32_t length, int32_t codepoint, int32_t reason, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UCNV_FROM_U_CALLBACK_SUBSTITUTE");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, fromuargs, codeunits, length, codepoint, reason, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)fromuargs;
    (void)codeunits;
    (void)length;
    (void)codepoint;
    (void)reason;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_ESCAPE(void* context, void* touargs, void* codeunits, int32_t length, int32_t reason, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UCNV_TO_U_CALLBACK_ESCAPE");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, touargs, codeunits, length, reason, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)touargs;
    (void)codeunits;
    (void)length;
    (void)reason;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_SKIP(void* context, void* touargs, void* codeunits, int32_t length, int32_t reason, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UCNV_TO_U_CALLBACK_SKIP");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, touargs, codeunits, length, reason, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)touargs;
    (void)codeunits;
    (void)length;
    (void)reason;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_STOP(void* context, void* touargs, void* codeunits, int32_t length, int32_t reason, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UCNV_TO_U_CALLBACK_STOP");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, touargs, codeunits, length, reason, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)touargs;
    (void)codeunits;
    (void)length;
    (void)reason;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_UCNV_TO_U_CALLBACK_SUBSTITUTE(void* context, void* touargs, void* codeunits, int32_t length, int32_t reason, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UCNV_TO_U_CALLBACK_SUBSTITUTE");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, touargs, codeunits, length, reason, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)touargs;
    (void)codeunits;
    (void)length;
    (void)reason;
    (void)err;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_UpdateCalendarDayOfWeek(void* lpcaldatetime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateCalendarDayOfWeek");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcaldatetime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcaldatetime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_VerifyScripts(uint32_t dwflags, void* lplocalescripts, int32_t cchlocalescripts, void* lptestscripts, int32_t cchtestscripts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyScripts");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lplocalescripts, cchlocalescripts, lptestscripts, cchtestscripts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lplocalescripts;
    (void)cchlocalescripts;
    (void)lptestscripts;
    (void)cchtestscripts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_WideCharToMultiByte(uint32_t codepage, uint32_t dwflags, void* lpwidecharstr, int32_t cchwidechar, void* lpmultibytestr, int32_t cbmultibyte, void* lpdefaultchar, void* lpuseddefaultchar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WideCharToMultiByte");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, dwflags, lpwidecharstr, cchwidechar, lpmultibytestr, cbmultibyte, lpdefaultchar, lpuseddefaultchar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)codepage;
    (void)dwflags;
    (void)lpwidecharstr;
    (void)cchwidechar;
    (void)lpmultibytestr;
    (void)cbmultibyte;
    (void)lpdefaultchar;
    (void)lpuseddefaultchar;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_lstrcatA(void* lpstring1, void* lpstring2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrcatA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, lpstring2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpstring1;
    (void)lpstring2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_lstrcatW(void* lpstring1, void* lpstring2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrcatW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, lpstring2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpstring1;
    (void)lpstring2;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_lstrcmpA(void* lpstring1, void* lpstring2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrcmpA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, lpstring2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpstring1;
    (void)lpstring2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_lstrcmpW(void* lpstring1, void* lpstring2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrcmpW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, lpstring2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpstring1;
    (void)lpstring2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_lstrcmpiA(void* lpstring1, void* lpstring2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrcmpiA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, lpstring2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpstring1;
    (void)lpstring2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_lstrcmpiW(void* lpstring1, void* lpstring2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrcmpiW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, lpstring2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpstring1;
    (void)lpstring2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_lstrcpyA(void* lpstring1, void* lpstring2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrcpyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, lpstring2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpstring1;
    (void)lpstring2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_lstrcpyW(void* lpstring1, void* lpstring2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrcpyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, lpstring2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpstring1;
    (void)lpstring2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_lstrcpynA(void* lpstring1, void* lpstring2, int32_t imaxlength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrcpynA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, lpstring2, imaxlength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpstring1;
    (void)lpstring2;
    (void)imaxlength;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_lstrcpynW(void* lpstring1, void* lpstring2, int32_t imaxlength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrcpynW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring1, lpstring2, imaxlength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpstring1;
    (void)lpstring2;
    (void)imaxlength;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_lstrlenA(void* lpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrlenA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_lstrlenW(void* lpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lstrlenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpstring;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_u_UCharsToChars(void* us, void* cs, int32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_UCharsToChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(us, cs, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)us;
    (void)cs;
    (void)length;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_u_austrcpy(void* dst, void* src) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_austrcpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dst, src);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dst;
    (void)src;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_austrncpy(void* dst, void* src, int32_t n) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_austrncpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dst, src, n);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dst;
    (void)src;
    (void)n;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_u_catclose(void* catd) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_catclose");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(catd);
        return;
    }
    errno = ENOSYS;
#else
    (void)catd;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_u_catgets(void* catd, int32_t set_num, int32_t msg_num, void* s, void* len, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_catgets");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(catd, set_num, msg_num, s, len, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)catd;
    (void)set_num;
    (void)msg_num;
    (void)s;
    (void)len;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_catopen(void* name, void* locale, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_catopen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, locale, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    (void)locale;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_u_charAge(int32_t c, void* versionarray) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_charAge");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(c, versionarray);
        return;
    }
    errno = ENOSYS;
#else
    (void)c;
    (void)versionarray;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_u_charDigitValue(int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_charDigitValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_charDirection(int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_charDirection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_charFromName(int32_t namechoice, void* name, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_charFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(namechoice, name, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)namechoice;
    (void)name;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_charMirror(int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_charMirror");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_charName(int32_t code, int32_t namechoice, void* buffer, int32_t bufferlength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_charName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(code, namechoice, buffer, bufferlength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)code;
    (void)namechoice;
    (void)buffer;
    (void)bufferlength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_charType(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_charType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_u_charsToUChars(void* cs, void* us, int32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_charsToUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cs, us, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)cs;
    (void)us;
    (void)length;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_u_cleanup(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_cleanup");
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

int32_t windowssys_windows_win32_globalization_u_countChar32(void* s, int32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_countChar32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_digit(int32_t ch, int8_t radix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_digit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch, radix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    (void)radix;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_u_enumCharNames(int32_t start, int32_t limit, void* fn, void* context, int32_t namechoice, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_enumCharNames");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(start, limit, fn, context, namechoice, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)start;
    (void)limit;
    (void)fn;
    (void)context;
    (void)namechoice;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_u_enumCharTypes(void* enumrange, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_enumCharTypes");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(enumrange, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)enumrange;
    (void)context;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_u_errorName(int32_t code) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_errorName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(code);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)code;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_foldCase(int32_t c, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_foldCase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_forDigit(int32_t digit, int8_t radix) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_forDigit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(digit, radix);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)digit;
    (void)radix;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_getBidiPairedBracket(int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getBidiPairedBracket");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_getBinaryPropertySet(int32_t property, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getBinaryPropertySet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(property, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)property;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

uint8_t windowssys_windows_win32_globalization_u_getCombiningClass(int32_t c) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getCombiningClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)c;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_globalization_u_getDataVersion(void* dataversionfillin, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getDataVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dataversionfillin, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)dataversionfillin;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_u_getFC_NFKC_Closure(int32_t c, void* dest, int32_t destcapacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getFC_NFKC_Closure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c, dest, destcapacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    (void)dest;
    (void)destcapacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_getIntPropertyMap(int32_t property, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getIntPropertyMap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(property, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)property;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_getIntPropertyMaxValue(int32_t which) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getIntPropertyMaxValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(which);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)which;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_getIntPropertyMinValue(int32_t which) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getIntPropertyMinValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(which);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)which;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_getIntPropertyValue(int32_t c, int32_t which) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getIntPropertyValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c, which);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    (void)which;
    errno = ENOSYS;
    return -1;
#endif
}

double windowssys_windows_win32_globalization_u_getNumericValue(int32_t c) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getNumericValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)c;
    errno = ENOSYS;
    return 0.0;
#endif
}

int32_t windowssys_windows_win32_globalization_u_getPropertyEnum(void* alias) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getPropertyEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(alias);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)alias;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_getPropertyName(int32_t property, int32_t namechoice) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getPropertyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(property, namechoice);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)property;
    (void)namechoice;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_getPropertyValueEnum(int32_t property, void* alias) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getPropertyValueEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(property, alias);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)property;
    (void)alias;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_getPropertyValueName(int32_t property, int32_t value, int32_t namechoice) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getPropertyValueName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(property, value, namechoice);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)property;
    (void)value;
    (void)namechoice;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_u_getUnicodeVersion(void* versionarray) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getUnicodeVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(versionarray);
        return;
    }
    errno = ENOSYS;
#else
    (void)versionarray;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_u_getVersion(void* versionarray) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_getVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(versionarray);
        return;
    }
    errno = ENOSYS;
#else
    (void)versionarray;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_u_hasBinaryProperty(int32_t c, int32_t which) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_hasBinaryProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c, which);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    (void)which;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_u_init(void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_init");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(status);
        return;
    }
    errno = ENOSYS;
#else
    (void)status;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isIDIgnorable(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isIDIgnorable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isIDPart(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isIDPart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isIDStart(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isIDStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isISOControl(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isISOControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isJavaIDPart(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isJavaIDPart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isJavaIDStart(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isJavaIDStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isJavaSpaceChar(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isJavaSpaceChar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isMirrored(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isMirrored");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isUAlphabetic(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isUAlphabetic");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isULowercase(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isULowercase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isUUppercase(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isUUppercase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isUWhiteSpace(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isUWhiteSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isWhitespace(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isWhitespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isalnum(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isalnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isalpha(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isalpha");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isbase(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isbase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isblank(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isblank");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_iscntrl(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_iscntrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isdefined(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isdefined");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isdigit(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isdigit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isgraph(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isgraph");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_islower(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_islower");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isprint(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isprint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_ispunct(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_ispunct");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isspace(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isspace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_istitle(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_istitle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isupper(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isupper");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_u_isxdigit(int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_isxdigit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_memcasecmp(void* s1, void* s2, int32_t length, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_memcasecmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s1, s2, length, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s1;
    (void)s2;
    (void)length;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_memchr(void* s, uint16_t c, int32_t count) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_memchr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, c, count);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)c;
    (void)count;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_memchr32(void* s, int32_t c, int32_t count) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_memchr32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, c, count);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)c;
    (void)count;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_memcmp(void* buf1, void* buf2, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_memcmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buf1, buf2, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)buf1;
    (void)buf2;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_memcmpCodePointOrder(void* s1, void* s2, int32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_memcmpCodePointOrder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s1, s2, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s1;
    (void)s2;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_memcpy(void* dest, void* src, int32_t count) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_memcpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, src, count);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)src;
    (void)count;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_memmove(void* dest, void* src, int32_t count) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_memmove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, src, count);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)src;
    (void)count;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_memrchr(void* s, uint16_t c, int32_t count) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_memrchr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, c, count);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)c;
    (void)count;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_memrchr32(void* s, int32_t c, int32_t count) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_memrchr32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, c, count);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)c;
    (void)count;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_memset(void* dest, uint16_t c, int32_t count) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_memset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, c, count);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)c;
    (void)count;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_u_setMemoryFunctions(void* context, void* a, void* r, void* f, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_setMemoryFunctions");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, a, r, f, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)a;
    (void)r;
    (void)f;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_u_shapeArabic(void* source, int32_t sourcelength, void* dest, int32_t destsize, uint32_t options, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_shapeArabic");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, sourcelength, dest, destsize, options, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)source;
    (void)sourcelength;
    (void)dest;
    (void)destsize;
    (void)options;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strCaseCompare(void* s1, int32_t length1, void* s2, int32_t length2, uint32_t options, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strCaseCompare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s1, length1, s2, length2, options, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s1;
    (void)length1;
    (void)s2;
    (void)length2;
    (void)options;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strCompare(void* s1, int32_t length1, void* s2, int32_t length2, int8_t codepointorder) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strCompare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s1, length1, s2, length2, codepointorder);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s1;
    (void)length1;
    (void)s2;
    (void)length2;
    (void)codepointorder;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strCompareIter(void* iter1, void* iter2, int8_t codepointorder) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strCompareIter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iter1, iter2, codepointorder);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iter1;
    (void)iter2;
    (void)codepointorder;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_strFindFirst(void* s, int32_t length, void* substring, int32_t sublength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strFindFirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, length, substring, sublength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)length;
    (void)substring;
    (void)sublength;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strFindLast(void* s, int32_t length, void* substring, int32_t sublength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strFindLast");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, length, substring, sublength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)length;
    (void)substring;
    (void)sublength;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strFoldCase(void* dest, int32_t destcapacity, void* src, int32_t srclength, uint32_t options, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strFoldCase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, src, srclength, options, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)options;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_strFromJavaModifiedUTF8WithSub(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, int32_t subchar, void* pnumsubstitutions, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strFromJavaModifiedUTF8WithSub");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, subchar, pnumsubstitutions, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)subchar;
    (void)pnumsubstitutions;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strFromUTF32(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strFromUTF32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strFromUTF32WithSub(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, int32_t subchar, void* pnumsubstitutions, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strFromUTF32WithSub");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, subchar, pnumsubstitutions, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)subchar;
    (void)pnumsubstitutions;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strFromUTF8(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strFromUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strFromUTF8Lenient(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strFromUTF8Lenient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strFromUTF8WithSub(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, int32_t subchar, void* pnumsubstitutions, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strFromUTF8WithSub");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, subchar, pnumsubstitutions, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)subchar;
    (void)pnumsubstitutions;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strFromWCS(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strFromWCS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int8_t windowssys_windows_win32_globalization_u_strHasMoreChar32Than(void* s, int32_t length, int32_t number) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strHasMoreChar32Than");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, length, number);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)length;
    (void)number;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_strToJavaModifiedUTF8(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strToJavaModifiedUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strToLower(void* dest, int32_t destcapacity, void* src, int32_t srclength, void* locale, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strToLower");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, src, srclength, locale, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)locale;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strToTitle(void* dest, int32_t destcapacity, void* src, int32_t srclength, void* titleiter, void* locale, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strToTitle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, src, srclength, titleiter, locale, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)titleiter;
    (void)locale;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_strToUTF32(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strToUTF32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strToUTF32WithSub(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, int32_t subchar, void* pnumsubstitutions, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strToUTF32WithSub");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, subchar, pnumsubstitutions, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)subchar;
    (void)pnumsubstitutions;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strToUTF8(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strToUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strToUTF8WithSub(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, int32_t subchar, void* pnumsubstitutions, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strToUTF8WithSub");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, subchar, pnumsubstitutions, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)subchar;
    (void)pnumsubstitutions;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strToUpper(void* dest, int32_t destcapacity, void* src, int32_t srclength, void* locale, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strToUpper");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, src, srclength, locale, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)locale;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_strToWCS(void* dest, int32_t destcapacity, void* pdestlength, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strToWCS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, destcapacity, pdestlength, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)destcapacity;
    (void)pdestlength;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strcasecmp(void* s1, void* s2, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strcasecmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s1, s2, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s1;
    (void)s2;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_strcat(void* dst, void* src) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strcat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dst, src);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dst;
    (void)src;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strchr(void* s, uint16_t c) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strchr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, c);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)c;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strchr32(void* s, int32_t c) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strchr32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, c);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)c;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strcmp(void* s1, void* s2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strcmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s1, s2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s1;
    (void)s2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strcmpCodePointOrder(void* s1, void* s2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strcmpCodePointOrder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s1, s2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s1;
    (void)s2;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_strcpy(void* dst, void* src) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strcpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dst, src);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dst;
    (void)src;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strcspn(void* string, void* matchset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strcspn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, matchset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    (void)matchset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strlen(void* s) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strlen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strncasecmp(void* s1, void* s2, int32_t n, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strncasecmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s1, s2, n, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s1;
    (void)s2;
    (void)n;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_strncat(void* dst, void* src, int32_t n) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strncat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dst, src, n);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dst;
    (void)src;
    (void)n;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strncmp(void* ucs1, void* ucs2, int32_t n) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strncmp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucs1, ucs2, n);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ucs1;
    (void)ucs2;
    (void)n;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strncmpCodePointOrder(void* s1, void* s2, int32_t n) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strncmpCodePointOrder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s1, s2, n);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s1;
    (void)s2;
    (void)n;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_strncpy(void* dst, void* src, int32_t n) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strncpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dst, src, n);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dst;
    (void)src;
    (void)n;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strpbrk(void* string, void* matchset) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strpbrk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, matchset);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)string;
    (void)matchset;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strrchr(void* s, uint16_t c) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strrchr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, c);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)c;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strrchr32(void* s, int32_t c) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strrchr32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, c);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)c;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strrstr(void* s, void* substring) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strrstr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, substring);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)substring;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_strspn(void* string, void* matchset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strspn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, matchset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    (void)matchset;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_strstr(void* s, void* substring) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strstr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, substring);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)s;
    (void)substring;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_strtok_r(void* src, void* delim, void* savestate) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_strtok_r");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(src, delim, savestate);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)src;
    (void)delim;
    (void)savestate;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_tolower(int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_tolower");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_totitle(int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_totitle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_toupper(int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_toupper");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_u_uastrcpy(void* dst, void* src) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_uastrcpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dst, src);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dst;
    (void)src;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_u_uastrncpy(void* dst, void* src, int32_t n) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_uastrncpy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dst, src, n);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dst;
    (void)src;
    (void)n;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_u_unescape(void* src, void* dest, int32_t destcapacity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_unescape");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(src, dest, destcapacity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)src;
    (void)dest;
    (void)destcapacity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_unescapeAt(void* charat, void* offset, int32_t length, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_unescapeAt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(charat, offset, length, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)charat;
    (void)offset;
    (void)length;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_u_versionFromString(void* versionarray, void* versionstring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_versionFromString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(versionarray, versionstring);
        return;
    }
    errno = ENOSYS;
#else
    (void)versionarray;
    (void)versionstring;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_u_versionFromUString(void* versionarray, void* versionstring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_versionFromUString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(versionarray, versionstring);
        return;
    }
    errno = ENOSYS;
#else
    (void)versionarray;
    (void)versionstring;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_u_versionToString(void* versionarray, void* versionstring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_versionToString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(versionarray, versionstring);
        return;
    }
    errno = ENOSYS;
#else
    (void)versionarray;
    (void)versionstring;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_u_vformatMessage(void* locale, void* pattern, int32_t patternlength, void* result, int32_t resultlength, void* ap, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_vformatMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, pattern, patternlength, result, resultlength, ap, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)pattern;
    (void)patternlength;
    (void)result;
    (void)resultlength;
    (void)ap;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_u_vformatMessageWithError(void* locale, void* pattern, int32_t patternlength, void* result, int32_t resultlength, void* parseerror, void* ap, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_vformatMessageWithError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, pattern, patternlength, result, resultlength, parseerror, ap, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)pattern;
    (void)patternlength;
    (void)result;
    (void)resultlength;
    (void)parseerror;
    (void)ap;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_u_vparseMessage(void* locale, void* pattern, int32_t patternlength, void* source, int32_t sourcelength, void* ap, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_vparseMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(locale, pattern, patternlength, source, sourcelength, ap, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)locale;
    (void)pattern;
    (void)patternlength;
    (void)source;
    (void)sourcelength;
    (void)ap;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_u_vparseMessageWithError(void* locale, void* pattern, int32_t patternlength, void* source, int32_t sourcelength, void* ap, void* parseerror, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "u_vparseMessageWithError");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(locale, pattern, patternlength, source, sourcelength, ap, parseerror, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)locale;
    (void)pattern;
    (void)patternlength;
    (void)source;
    (void)sourcelength;
    (void)ap;
    (void)parseerror;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_close(void* pbidi) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_countParagraphs(void* pbidi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_countParagraphs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_countRuns(void* pbidi, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_countRuns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getBaseDirection(void* text, int32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getBaseDirection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(text, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)text;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ubidi_getClassCallback(void* pbidi, void* fn, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getClassCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, fn, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)fn;
    (void)context;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getCustomizedClass(void* pbidi, int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getCustomizedClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getDirection(void* pbidi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getDirection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getLength(void* pbidi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    errno = ENOSYS;
    return -1;
#endif
}

uint8_t windowssys_windows_win32_globalization_ubidi_getLevelAt(void* pbidi, int32_t charindex) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getLevelAt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi, charindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbidi;
    (void)charindex;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_globalization_ubidi_getLevels(void* pbidi, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getLevels");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pbidi;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getLogicalIndex(void* pbidi, int32_t visualindex, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getLogicalIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi, visualindex, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    (void)visualindex;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ubidi_getLogicalMap(void* pbidi, void* indexmap, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getLogicalMap");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, indexmap, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)indexmap;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_getLogicalRun(void* pbidi, int32_t logicalposition, void* plogicallimit, void* plevel) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getLogicalRun");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, logicalposition, plogicallimit, plevel);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)logicalposition;
    (void)plogicallimit;
    (void)plevel;
    errno = ENOSYS;
#endif
}

uint8_t windowssys_windows_win32_globalization_ubidi_getParaLevel(void* pbidi) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getParaLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbidi;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getParagraph(void* pbidi, int32_t charindex, void* pparastart, void* pparalimit, void* pparalevel, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getParagraph");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi, charindex, pparastart, pparalimit, pparalevel, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    (void)charindex;
    (void)pparastart;
    (void)pparalimit;
    (void)pparalevel;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ubidi_getParagraphByIndex(void* pbidi, int32_t paraindex, void* pparastart, void* pparalimit, void* pparalevel, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getParagraphByIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, paraindex, pparastart, pparalimit, pparalevel, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)paraindex;
    (void)pparastart;
    (void)pparalimit;
    (void)pparalevel;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getProcessedLength(void* pbidi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getProcessedLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getReorderingMode(void* pbidi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getReorderingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_ubidi_getReorderingOptions(void* pbidi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getReorderingOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbidi;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getResultLength(void* pbidi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getResultLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ubidi_getText(void* pbidi) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pbidi;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getVisualIndex(void* pbidi, int32_t logicalindex, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getVisualIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi, logicalindex, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    (void)logicalindex;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ubidi_getVisualMap(void* pbidi, void* indexmap, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getVisualMap");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, indexmap, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)indexmap;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_getVisualRun(void* pbidi, int32_t runindex, void* plogicalstart, void* plength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_getVisualRun");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi, runindex, plogicalstart, plength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    (void)runindex;
    (void)plogicalstart;
    (void)plength;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ubidi_invertMap(void* srcmap, void* destmap, int32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_invertMap");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(srcmap, destmap, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)srcmap;
    (void)destmap;
    (void)length;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_ubidi_isInverse(void* pbidi) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_isInverse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ubidi_isOrderParagraphsLTR(void* pbidi) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_isOrderParagraphsLTR");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ubidi_open(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_open");
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

void* windowssys_windows_win32_globalization_ubidi_openSized(int32_t maxlength, int32_t maxruncount, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_openSized");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maxlength, maxruncount, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)maxlength;
    (void)maxruncount;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ubidi_orderParagraphsLTR(void* pbidi, int8_t orderparagraphsltr) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_orderParagraphsLTR");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, orderparagraphsltr);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)orderparagraphsltr;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_reorderLogical(void* levels, int32_t length, void* indexmap) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_reorderLogical");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(levels, length, indexmap);
        return;
    }
    errno = ENOSYS;
#else
    (void)levels;
    (void)length;
    (void)indexmap;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_reorderVisual(void* levels, int32_t length, void* indexmap) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_reorderVisual");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(levels, length, indexmap);
        return;
    }
    errno = ENOSYS;
#else
    (void)levels;
    (void)length;
    (void)indexmap;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_setClassCallback(void* pbidi, void* newfn, void* newcontext, void* oldfn, void* oldcontext, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_setClassCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, newfn, newcontext, oldfn, oldcontext, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)newfn;
    (void)newcontext;
    (void)oldfn;
    (void)oldcontext;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_setContext(void* pbidi, void* prologue, int32_t prolength, void* epilogue, int32_t epilength, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_setContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, prologue, prolength, epilogue, epilength, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)prologue;
    (void)prolength;
    (void)epilogue;
    (void)epilength;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_setInverse(void* pbidi, int8_t isinverse) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_setInverse");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, isinverse);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)isinverse;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_setLine(void* pparabidi, int32_t start, int32_t limit, void* plinebidi, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_setLine");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pparabidi, start, limit, plinebidi, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)pparabidi;
    (void)start;
    (void)limit;
    (void)plinebidi;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_setPara(void* pbidi, void* text, int32_t length, uint8_t paralevel, void* embeddinglevels, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_setPara");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, text, length, paralevel, embeddinglevels, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)text;
    (void)length;
    (void)paralevel;
    (void)embeddinglevels;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_setReorderingMode(void* pbidi, int32_t reorderingmode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_setReorderingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, reorderingmode);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)reorderingmode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubidi_setReorderingOptions(void* pbidi, uint32_t reorderingoptions) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_setReorderingOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbidi, reorderingoptions);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbidi;
    (void)reorderingoptions;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_writeReordered(void* pbidi, void* dest, int32_t destsize, uint16_t options, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_writeReordered");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbidi, dest, destsize, options, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbidi;
    (void)dest;
    (void)destsize;
    (void)options;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubidi_writeReverse(void* src, int32_t srclength, void* dest, int32_t destsize, uint16_t options, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubidi_writeReverse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(src, srclength, dest, destsize, options, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)src;
    (void)srclength;
    (void)dest;
    (void)destsize;
    (void)options;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ubiditransform_close(void* pbiditransform) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubiditransform_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbiditransform);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbiditransform;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ubiditransform_open(void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubiditransform_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_globalization_ubiditransform_transform(void* pbiditransform, void* src, int32_t srclength, void* dest, int32_t destsize, uint8_t inparalevel, int32_t inorder, uint8_t outparalevel, int32_t outorder, int32_t domirroring, uint32_t shapingoptions, void* perrorcode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, uint8_t, int32_t, uint8_t, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubiditransform_transform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbiditransform, src, srclength, dest, destsize, inparalevel, inorder, outparalevel, outorder, domirroring, shapingoptions, perrorcode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbiditransform;
    (void)src;
    (void)srclength;
    (void)dest;
    (void)destsize;
    (void)inparalevel;
    (void)inorder;
    (void)outparalevel;
    (void)outorder;
    (void)domirroring;
    (void)shapingoptions;
    (void)perrorcode;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_ublock_getCode(int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ublock_getCode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ubrk_close(void* bi) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bi);
        return;
    }
    errno = ENOSYS;
#else
    (void)bi;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ubrk_countAvailable(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_countAvailable");
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

int32_t windowssys_windows_win32_globalization_ubrk_current(void* bi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_current");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubrk_first(void* bi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_first");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubrk_following(void* bi, int32_t offset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_following");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi, offset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    (void)offset;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ubrk_getAvailable(int32_t arg_0_index) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_getAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_index);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)arg_0_index;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ubrk_getBinaryRules(void* bi, void* binaryrules, int32_t rulescapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_getBinaryRules");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi, binaryrules, rulescapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    (void)binaryrules;
    (void)rulescapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ubrk_getLocaleByType(void* bi, int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_getLocaleByType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi, type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bi;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ubrk_getRuleStatus(void* bi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_getRuleStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubrk_getRuleStatusVec(void* bi, void* fillinvec, int32_t capacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_getRuleStatusVec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi, fillinvec, capacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    (void)fillinvec;
    (void)capacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ubrk_isBoundary(void* bi, int32_t offset) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_isBoundary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi, offset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    (void)offset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubrk_last(void* bi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_last");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubrk_next(void* bi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_next");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ubrk_open(int32_t type, void* locale, void* text, int32_t textlength, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type, locale, text, textlength, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)type;
    (void)locale;
    (void)text;
    (void)textlength;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ubrk_openBinaryRules(void* binaryrules, int32_t ruleslength, void* text, int32_t textlength, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_openBinaryRules");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(binaryrules, ruleslength, text, textlength, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)binaryrules;
    (void)ruleslength;
    (void)text;
    (void)textlength;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ubrk_openRules(void* rules, int32_t ruleslength, void* text, int32_t textlength, void* parseerr, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_openRules");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rules, ruleslength, text, textlength, parseerr, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)rules;
    (void)ruleslength;
    (void)text;
    (void)textlength;
    (void)parseerr;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ubrk_preceding(void* bi, int32_t offset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_preceding");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi, offset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    (void)offset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ubrk_previous(void* bi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_previous");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bi;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ubrk_refreshUText(void* bi, void* text, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_refreshUText");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bi, text, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)bi;
    (void)text;
    (void)status;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ubrk_safeClone(void* bi, void* stackbuffer, void* pbuffersize, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_safeClone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bi, stackbuffer, pbuffersize, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bi;
    (void)stackbuffer;
    (void)pbuffersize;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ubrk_setText(void* bi, void* text, int32_t textlength, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_setText");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bi, text, textlength, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)bi;
    (void)text;
    (void)textlength;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ubrk_setUText(void* bi, void* text, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ubrk_setUText");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(bi, text, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)bi;
    (void)text;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_add(void* cal, int32_t field, int32_t amount, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_add");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal, field, amount, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    (void)field;
    (void)amount;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_clear(void* calendar) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_clear");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(calendar);
        return;
    }
    errno = ENOSYS;
#else
    (void)calendar;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_clearField(void* cal, int32_t field) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_clearField");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal, field);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    (void)field;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ucal_clone(void* cal, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cal;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucal_close(void* cal) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_countAvailable(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_countAvailable");
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

int8_t windowssys_windows_win32_globalization_ucal_equivalentTo(void* cal1, void* cal2) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_equivalentTo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal1, cal2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal1;
    (void)cal2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_get(void* cal, int32_t field, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_get");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, field, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)field;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getAttribute(void* cal, int32_t attr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, attr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)attr;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucal_getAvailable(int32_t localeindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)localeindex;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getCanonicalTimeZoneID(void* id, int32_t len, void* result, int32_t resultcapacity, void* issystemid, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getCanonicalTimeZoneID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, len, result, resultcapacity, issystemid, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)len;
    (void)result;
    (void)resultcapacity;
    (void)issystemid;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getDSTSavings(void* zoneid, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getDSTSavings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(zoneid, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)zoneid;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getDayOfWeekType(void* cal, int32_t dayofweek, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getDayOfWeekType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, dayofweek, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)dayofweek;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getDefaultTimeZone(void* result, int32_t resultcapacity, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getDefaultTimeZone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(result, resultcapacity, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)result;
    (void)resultcapacity;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getFieldDifference(void* cal, double target, int32_t field, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getFieldDifference");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, target, field, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)target;
    (void)field;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

double windowssys_windows_win32_globalization_ucal_getGregorianChange(void* cal, void* perrorcode) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getGregorianChange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, perrorcode);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)cal;
    (void)perrorcode;
    errno = ENOSYS;
    return 0.0;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getHostTimeZone(void* result, int32_t resultcapacity, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getHostTimeZone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(result, resultcapacity, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)result;
    (void)resultcapacity;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucal_getKeywordValuesForLocale(void* key, void* locale, int8_t commonlyused, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getKeywordValuesForLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, locale, commonlyused, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)key;
    (void)locale;
    (void)commonlyused;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getLimit(void* cal, int32_t field, int32_t type, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, field, type, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)field;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucal_getLocaleByType(void* cal, int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getLocaleByType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cal;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

double windowssys_windows_win32_globalization_ucal_getMillis(void* cal, void* status) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getMillis");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, status);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)cal;
    (void)status;
    errno = ENOSYS;
    return 0.0;
#endif
}

double windowssys_windows_win32_globalization_ucal_getNow(void) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getNow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0.0;
#else
    errno = ENOSYS;
    return 0.0;
#endif
}

void* windowssys_windows_win32_globalization_ucal_getTZDataVersion(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getTZDataVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getTimeZoneDisplayName(void* cal, int32_t type, void* locale, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getTimeZoneDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, type, locale, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)type;
    (void)locale;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getTimeZoneID(void* cal, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getTimeZoneID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getTimeZoneIDForWindowsID(void* winid, int32_t len, void* region, void* id, int32_t idcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getTimeZoneIDForWindowsID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(winid, len, region, id, idcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)winid;
    (void)len;
    (void)region;
    (void)id;
    (void)idcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ucal_getTimeZoneTransitionDate(void* cal, int32_t type, void* transition, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getTimeZoneTransitionDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, type, transition, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)type;
    (void)transition;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucal_getType(void* cal, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cal;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getWeekendTransition(void* cal, int32_t dayofweek, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getWeekendTransition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, dayofweek, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)dayofweek;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucal_getWindowsTimeZoneID(void* id, int32_t len, void* winid, int32_t winidcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_getWindowsTimeZoneID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, len, winid, winidcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)len;
    (void)winid;
    (void)winidcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ucal_inDaylightTime(void* cal, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_inDaylightTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ucal_isSet(void* cal, int32_t field) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_isSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, field);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)field;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ucal_isWeekend(void* cal, double date, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_isWeekend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cal, date, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cal;
    (void)date;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucal_open(void* zoneid, int32_t len, void* locale, int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(zoneid, len, locale, type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)zoneid;
    (void)len;
    (void)locale;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucal_openCountryTimeZones(void* country, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_openCountryTimeZones");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(country, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)country;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucal_openTimeZoneIDEnumeration(int32_t zonetype, void* region, void* rawoffset, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_openTimeZoneIDEnumeration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(zonetype, region, rawoffset, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)zonetype;
    (void)region;
    (void)rawoffset;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucal_openTimeZones(void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_openTimeZones");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucal_roll(void* cal, int32_t field, int32_t amount, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_roll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal, field, amount, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    (void)field;
    (void)amount;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_set(void* cal, int32_t field, int32_t value) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_set");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal, field, value);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    (void)field;
    (void)value;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_setAttribute(void* cal, int32_t attr, int32_t newvalue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_setAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal, attr, newvalue);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    (void)attr;
    (void)newvalue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_setDate(void* cal, int32_t year, int32_t month, int32_t date, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_setDate");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal, year, month, date, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    (void)year;
    (void)month;
    (void)date;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_setDateTime(void* cal, int32_t year, int32_t month, int32_t date, int32_t hour, int32_t minute, int32_t second, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_setDateTime");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal, year, month, date, hour, minute, second, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    (void)year;
    (void)month;
    (void)date;
    (void)hour;
    (void)minute;
    (void)second;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_setDefaultTimeZone(void* zoneid, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_setDefaultTimeZone");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(zoneid, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)zoneid;
    (void)ec;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_setGregorianChange(void* cal, double date, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_setGregorianChange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal, date, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    (void)date;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_setMillis(void* cal, double datetime, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_setMillis");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal, datetime, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    (void)datetime;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucal_setTimeZone(void* cal, void* zoneid, int32_t len, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucal_setTimeZone");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cal, zoneid, len, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)cal;
    (void)zoneid;
    (void)len;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucasemap_close(void* csm) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(csm);
        return;
    }
    errno = ENOSYS;
#else
    (void)csm;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ucasemap_getBreakIterator(void* csm) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_getBreakIterator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csm);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)csm;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucasemap_getLocale(void* csm) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_getLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csm);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)csm;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_globalization_ucasemap_getOptions(void* csm) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_getOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csm);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)csm;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_globalization_ucasemap_open(void* locale, uint32_t options, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, options, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)options;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucasemap_setBreakIterator(void* csm, void* itertoadopt, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_setBreakIterator");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(csm, itertoadopt, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)csm;
    (void)itertoadopt;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucasemap_setLocale(void* csm, void* locale, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_setLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(csm, locale, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)csm;
    (void)locale;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucasemap_setOptions(void* csm, uint32_t options, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_setOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(csm, options, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)csm;
    (void)options;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucasemap_toTitle(void* csm, void* dest, int32_t destcapacity, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_toTitle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csm, dest, destcapacity, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)csm;
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucasemap_utf8FoldCase(void* csm, void* dest, int32_t destcapacity, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_utf8FoldCase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csm, dest, destcapacity, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)csm;
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucasemap_utf8ToLower(void* csm, void* dest, int32_t destcapacity, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_utf8ToLower");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csm, dest, destcapacity, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)csm;
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucasemap_utf8ToTitle(void* csm, void* dest, int32_t destcapacity, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_utf8ToTitle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csm, dest, destcapacity, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)csm;
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucasemap_utf8ToUpper(void* csm, void* dest, int32_t destcapacity, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucasemap_utf8ToUpper");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(csm, dest, destcapacity, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)csm;
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucfpos_close(void* ucfpos) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ucfpos);
        return;
    }
    errno = ENOSYS;
#else
    (void)ucfpos;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucfpos_constrainCategory(void* ucfpos, int32_t category, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_constrainCategory");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ucfpos, category, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)ucfpos;
    (void)category;
    (void)ec;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucfpos_constrainField(void* ucfpos, int32_t category, int32_t field, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_constrainField");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ucfpos, category, field, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)ucfpos;
    (void)category;
    (void)field;
    (void)ec;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucfpos_getCategory(void* ucfpos, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_getCategory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucfpos, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ucfpos;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucfpos_getField(void* ucfpos, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_getField");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucfpos, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ucfpos;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucfpos_getIndexes(void* ucfpos, void* pstart, void* plimit, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_getIndexes");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ucfpos, pstart, plimit, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)ucfpos;
    (void)pstart;
    (void)plimit;
    (void)ec;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_globalization_ucfpos_getInt64IterationContext(void* ucfpos, void* ec) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_getInt64IterationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucfpos, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ucfpos;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ucfpos_matchesField(void* ucfpos, int32_t category, int32_t field, void* ec) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_matchesField");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucfpos, category, field, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ucfpos;
    (void)category;
    (void)field;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucfpos_open(void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucfpos_reset(void* ucfpos, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_reset");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ucfpos, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)ucfpos;
    (void)ec;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucfpos_setInt64IterationContext(void* ucfpos, int64_t context, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_setInt64IterationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ucfpos, context, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)ucfpos;
    (void)context;
    (void)ec;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucfpos_setState(void* ucfpos, int32_t category, int32_t field, int32_t start, int32_t limit, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucfpos_setState");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ucfpos, category, field, start, limit, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)ucfpos;
    (void)category;
    (void)field;
    (void)start;
    (void)limit;
    (void)ec;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_cbFromUWriteBytes(void* args, void* source, int32_t length, int32_t offsetindex, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_cbFromUWriteBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(args, source, length, offsetindex, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)args;
    (void)source;
    (void)length;
    (void)offsetindex;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_cbFromUWriteSub(void* args, int32_t offsetindex, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_cbFromUWriteSub");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(args, offsetindex, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)args;
    (void)offsetindex;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_cbFromUWriteUChars(void* args, void* source, void* sourcelimit, int32_t offsetindex, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_cbFromUWriteUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(args, source, sourcelimit, offsetindex, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)args;
    (void)source;
    (void)sourcelimit;
    (void)offsetindex;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_cbToUWriteSub(void* args, int32_t offsetindex, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_cbToUWriteSub");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(args, offsetindex, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)args;
    (void)offsetindex;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_cbToUWriteUChars(void* args, void* source, int32_t length, int32_t offsetindex, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_cbToUWriteUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(args, source, length, offsetindex, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)args;
    (void)source;
    (void)length;
    (void)offsetindex;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_close(void* converter) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_compareNames(void* name1, void* name2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_compareNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name1, name2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name1;
    (void)name2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_convert(void* toconvertername, void* fromconvertername, void* target, int32_t targetcapacity, void* source, int32_t sourcelength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_convert");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(toconvertername, fromconvertername, target, targetcapacity, source, sourcelength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)toconvertername;
    (void)fromconvertername;
    (void)target;
    (void)targetcapacity;
    (void)source;
    (void)sourcelength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucnv_convertEx(void* targetcnv, void* sourcecnv, void* target, void* targetlimit, void* source, void* sourcelimit, void* pivotstart, void* pivotsource, void* pivottarget, void* pivotlimit, int8_t reset, int8_t flush, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, int8_t, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_convertEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(targetcnv, sourcecnv, target, targetlimit, source, sourcelimit, pivotstart, pivotsource, pivottarget, pivotlimit, reset, flush, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)targetcnv;
    (void)sourcecnv;
    (void)target;
    (void)targetlimit;
    (void)source;
    (void)sourcelimit;
    (void)pivotstart;
    (void)pivotsource;
    (void)pivottarget;
    (void)pivotlimit;
    (void)reset;
    (void)flush;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

uint16_t windowssys_windows_win32_globalization_ucnv_countAliases(void* alias, void* perrorcode) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_countAliases");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(alias, perrorcode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)alias;
    (void)perrorcode;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_countAvailable(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_countAvailable");
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

uint16_t windowssys_windows_win32_globalization_ucnv_countStandards(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_countStandards");
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

void* windowssys_windows_win32_globalization_ucnv_detectUnicodeSignature(void* source, int32_t sourcelength, void* signaturelength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_detectUnicodeSignature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, sourcelength, signaturelength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)source;
    (void)sourcelength;
    (void)signaturelength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucnv_fixFileSeparator(void* cnv, void* source, int32_t sourcelen) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_fixFileSeparator");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cnv, source, sourcelen);
        return;
    }
    errno = ENOSYS;
#else
    (void)cnv;
    (void)source;
    (void)sourcelen;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_flushCache(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_flushCache");
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

int32_t windowssys_windows_win32_globalization_ucnv_fromAlgorithmic(void* cnv, int32_t algorithmictype, void* target, int32_t targetcapacity, void* source, int32_t sourcelength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_fromAlgorithmic");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnv, algorithmictype, target, targetcapacity, source, sourcelength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnv;
    (void)algorithmictype;
    (void)target;
    (void)targetcapacity;
    (void)source;
    (void)sourcelength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_fromUChars(void* cnv, void* dest, int32_t destcapacity, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_fromUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnv, dest, destcapacity, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnv;
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_fromUCountPending(void* cnv, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_fromUCountPending");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnv, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnv;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucnv_fromUnicode(void* converter, void* target, void* targetlimit, void* source, void* sourcelimit, void* offsets, int8_t flush, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_fromUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, target, targetlimit, source, sourcelimit, offsets, flush, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)target;
    (void)targetlimit;
    (void)source;
    (void)sourcelimit;
    (void)offsets;
    (void)flush;
    (void)err;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_getAlias(void* alias, uint16_t n, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getAlias");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(alias, n, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)alias;
    (void)n;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucnv_getAliases(void* alias, void* aliases, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getAliases");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(alias, aliases, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)alias;
    (void)aliases;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_getAvailableName(int32_t n) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getAvailableName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(n);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)n;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_getCCSID(void* converter, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getCCSID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(converter, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)converter;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_getCanonicalName(void* alias, void* standard, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getCanonicalName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(alias, standard, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)alias;
    (void)standard;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_getDefaultName(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getDefaultName");
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

int32_t windowssys_windows_win32_globalization_ucnv_getDisplayName(void* converter, void* displaylocale, void* displayname, int32_t displaynamecapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(converter, displaylocale, displayname, displaynamecapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)converter;
    (void)displaylocale;
    (void)displayname;
    (void)displaynamecapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucnv_getFromUCallBack(void* converter, void* action, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getFromUCallBack");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, action, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)action;
    (void)context;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_getInvalidChars(void* converter, void* errbytes, void* len, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getInvalidChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, errbytes, len, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)errbytes;
    (void)len;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_getInvalidUChars(void* converter, void* erruchars, void* len, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getInvalidUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, erruchars, len, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)erruchars;
    (void)len;
    (void)err;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_ucnv_getMaxCharSize(void* converter) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getMaxCharSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(converter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)converter;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ucnv_getMinCharSize(void* converter) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getMinCharSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(converter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)converter;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_getName(void* converter, void* err) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(converter, err);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)converter;
    (void)err;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_getNextUChar(void* converter, void* source, void* sourcelimit, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getNextUChar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(converter, source, sourcelimit, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)converter;
    (void)source;
    (void)sourcelimit;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_getPlatform(void* converter, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getPlatform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(converter, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)converter;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_getStandard(uint16_t n, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getStandard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(n, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)n;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_getStandardName(void* name, void* standard, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getStandardName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, standard, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    (void)standard;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucnv_getStarters(void* converter, void* starters, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getStarters");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, starters, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)starters;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_getSubstChars(void* converter, void* subchars, void* len, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getSubstChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, subchars, len, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)subchars;
    (void)len;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_getToUCallBack(void* converter, void* action, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getToUCallBack");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, action, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)action;
    (void)context;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_getType(void* converter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(converter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)converter;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucnv_getUnicodeSet(void* cnv, void* setfillin, int32_t whichset, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_getUnicodeSet");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cnv, setfillin, whichset, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)cnv;
    (void)setfillin;
    (void)whichset;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_ucnv_isAmbiguous(void* cnv) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_isAmbiguous");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnv;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ucnv_isFixedWidth(void* cnv, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_isFixedWidth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnv, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnv;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_open(void* convertername, void* err) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(convertername, err);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)convertername;
    (void)err;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_openAllNames(void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_openAllNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_openCCSID(int32_t codepage, int32_t platform, void* err) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_openCCSID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, platform, err);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)codepage;
    (void)platform;
    (void)err;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_openPackage(void* packagename, void* convertername, void* err) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_openPackage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagename, convertername, err);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)packagename;
    (void)convertername;
    (void)err;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_openStandardNames(void* convname, void* standard, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_openStandardNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(convname, standard, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)convname;
    (void)standard;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_openU(void* name, void* err) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_openU");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, err);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    (void)err;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucnv_reset(void* converter) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_reset");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_resetFromUnicode(void* converter) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_resetFromUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_resetToUnicode(void* converter) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_resetToUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ucnv_safeClone(void* cnv, void* stackbuffer, void* pbuffersize, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_safeClone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnv, stackbuffer, pbuffersize, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)cnv;
    (void)stackbuffer;
    (void)pbuffersize;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucnv_setDefaultName(void* name) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_setDefaultName");
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

void windowssys_windows_win32_globalization_ucnv_setFallback(void* cnv, int8_t usesfallback) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_setFallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cnv, usesfallback);
        return;
    }
    errno = ENOSYS;
#else
    (void)cnv;
    (void)usesfallback;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_setFromUCallBack(void* converter, void* newaction, void* newcontext, void* oldaction, void* oldcontext, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_setFromUCallBack");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, newaction, newcontext, oldaction, oldcontext, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)newaction;
    (void)newcontext;
    (void)oldaction;
    (void)oldcontext;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_setSubstChars(void* converter, void* subchars, int8_t len, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_setSubstChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, subchars, len, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)subchars;
    (void)len;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_setSubstString(void* cnv, void* s, int32_t length, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_setSubstString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cnv, s, length, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)cnv;
    (void)s;
    (void)length;
    (void)err;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucnv_setToUCallBack(void* converter, void* newaction, void* newcontext, void* oldaction, void* oldcontext, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_setToUCallBack");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, newaction, newcontext, oldaction, oldcontext, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)newaction;
    (void)newcontext;
    (void)oldaction;
    (void)oldcontext;
    (void)err;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_toAlgorithmic(int32_t algorithmictype, void* cnv, void* target, int32_t targetcapacity, void* source, int32_t sourcelength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_toAlgorithmic");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(algorithmictype, cnv, target, targetcapacity, source, sourcelength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)algorithmictype;
    (void)cnv;
    (void)target;
    (void)targetcapacity;
    (void)source;
    (void)sourcelength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_toUChars(void* cnv, void* dest, int32_t destcapacity, void* src, int32_t srclength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_toUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnv, dest, destcapacity, src, srclength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnv;
    (void)dest;
    (void)destcapacity;
    (void)src;
    (void)srclength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnv_toUCountPending(void* cnv, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_toUCountPending");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnv, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnv;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucnv_toUnicode(void* converter, void* target, void* targetlimit, void* source, void* sourcelimit, void* offsets, int8_t flush, void* err) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_toUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(converter, target, targetlimit, source, sourcelimit, offsets, flush, err);
        return;
    }
    errno = ENOSYS;
#else
    (void)converter;
    (void)target;
    (void)targetlimit;
    (void)source;
    (void)sourcelimit;
    (void)offsets;
    (void)flush;
    (void)err;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_ucnv_usesFallback(void* cnv) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnv_usesFallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cnv;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucnvsel_close(void* sel) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnvsel_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sel);
        return;
    }
    errno = ENOSYS;
#else
    (void)sel;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ucnvsel_open(void* converterlist, int32_t converterlistsize, void* excludedcodepoints, int32_t whichset, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnvsel_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(converterlist, converterlistsize, excludedcodepoints, whichset, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)converterlist;
    (void)converterlistsize;
    (void)excludedcodepoints;
    (void)whichset;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucnvsel_openFromSerialized(void* buffer, int32_t length, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnvsel_openFromSerialized");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, length, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)buffer;
    (void)length;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucnvsel_selectForString(void* sel, void* s, int32_t length, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnvsel_selectForString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sel, s, length, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sel;
    (void)s;
    (void)length;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucnvsel_selectForUTF8(void* sel, void* s, int32_t length, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnvsel_selectForUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sel, s, length, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sel;
    (void)s;
    (void)length;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucnvsel_serialize(void* sel, void* buffer, int32_t buffercapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucnvsel_serialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sel, buffer, buffercapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sel;
    (void)buffer;
    (void)buffercapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_cloneBinary(void* coll, void* buffer, int32_t capacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_cloneBinary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, buffer, capacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)buffer;
    (void)capacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucol_close(void* coll) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coll);
        return;
    }
    errno = ENOSYS;
#else
    (void)coll;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucol_closeElements(void* elems) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_closeElements");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(elems);
        return;
    }
    errno = ENOSYS;
#else
    (void)elems;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_countAvailable(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_countAvailable");
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

int8_t windowssys_windows_win32_globalization_ucol_equal(void* coll, void* source, int32_t sourcelength, void* target, int32_t targetlength) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_equal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, source, sourcelength, target, targetlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)source;
    (void)sourcelength;
    (void)target;
    (void)targetlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getAttribute(void* coll, int32_t attr, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, attr, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)attr;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucol_getAvailable(int32_t localeindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)localeindex;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getBound(void* source, int32_t sourcelength, int32_t boundtype, uint32_t nooflevels, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getBound");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, sourcelength, boundtype, nooflevels, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)source;
    (void)sourcelength;
    (void)boundtype;
    (void)nooflevels;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucol_getContractionsAndExpansions(void* coll, void* contractions, void* expansions, int8_t addprefixes, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getContractionsAndExpansions");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coll, contractions, expansions, addprefixes, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)coll;
    (void)contractions;
    (void)expansions;
    (void)addprefixes;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getDisplayName(void* objloc, void* disploc, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objloc, disploc, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objloc;
    (void)disploc;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getEquivalentReorderCodes(int32_t reordercode, void* dest, int32_t destcapacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getEquivalentReorderCodes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reordercode, dest, destcapacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reordercode;
    (void)dest;
    (void)destcapacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getFunctionalEquivalent(void* result, int32_t resultcapacity, void* keyword, void* locale, void* isavailable, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getFunctionalEquivalent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(result, resultcapacity, keyword, locale, isavailable, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)result;
    (void)resultcapacity;
    (void)keyword;
    (void)locale;
    (void)isavailable;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucol_getKeywordValues(void* keyword, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getKeywordValues");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyword, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)keyword;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucol_getKeywordValuesForLocale(void* key, void* locale, int8_t commonlyused, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getKeywordValuesForLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, locale, commonlyused, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)key;
    (void)locale;
    (void)commonlyused;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucol_getKeywords(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getKeywords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucol_getLocaleByType(void* coll, int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getLocaleByType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)coll;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getMaxExpansion(void* elems, int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getMaxExpansion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(elems, order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)elems;
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getMaxVariable(void* coll) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getMaxVariable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getOffset(void* elems) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(elems);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)elems;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getReorderCodes(void* coll, void* dest, int32_t destcapacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getReorderCodes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, dest, destcapacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)dest;
    (void)destcapacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucol_getRules(void* coll, void* length) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getRules");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, length);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)coll;
    (void)length;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getRulesEx(void* coll, int32_t delta, void* buffer, int32_t bufferlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getRulesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, delta, buffer, bufferlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)delta;
    (void)buffer;
    (void)bufferlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getSortKey(void* coll, void* source, int32_t sourcelength, void* result, int32_t resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getSortKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, source, sourcelength, result, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)source;
    (void)sourcelength;
    (void)result;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_getStrength(void* coll) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getStrength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucol_getTailoredSet(void* coll, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getTailoredSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)coll;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucol_getUCAVersion(void* coll, void* info) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getUCAVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coll, info);
        return;
    }
    errno = ENOSYS;
#else
    (void)coll;
    (void)info;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_globalization_ucol_getVariableTop(void* coll, void* status) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getVariableTop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, status);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)coll;
    (void)status;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_globalization_ucol_getVersion(void* coll, void* info) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_getVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coll, info);
        return;
    }
    errno = ENOSYS;
#else
    (void)coll;
    (void)info;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_ucol_greater(void* coll, void* source, int32_t sourcelength, void* target, int32_t targetlength) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_greater");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, source, sourcelength, target, targetlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)source;
    (void)sourcelength;
    (void)target;
    (void)targetlength;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ucol_greaterOrEqual(void* coll, void* source, int32_t sourcelength, void* target, int32_t targetlength) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_greaterOrEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, source, sourcelength, target, targetlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)source;
    (void)sourcelength;
    (void)target;
    (void)targetlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_keyHashCode(void* key, int32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_keyHashCode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)key;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_mergeSortkeys(void* src1, int32_t src1length, void* src2, int32_t src2length, void* dest, int32_t destcapacity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_mergeSortkeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(src1, src1length, src2, src2length, dest, destcapacity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)src1;
    (void)src1length;
    (void)src2;
    (void)src2length;
    (void)dest;
    (void)destcapacity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_next(void* elems, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_next");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(elems, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)elems;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_nextSortKeyPart(void* coll, void* iter, void* state, void* dest, int32_t count, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_nextSortKeyPart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, iter, state, dest, count, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)iter;
    (void)state;
    (void)dest;
    (void)count;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucol_open(void* loc, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loc, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)loc;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucol_openAvailableLocales(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_openAvailableLocales");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucol_openBinary(void* bin, int32_t length, void* base, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_openBinary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bin, length, base, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)bin;
    (void)length;
    (void)base;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucol_openElements(void* coll, void* text, int32_t textlength, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_openElements");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, text, textlength, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)coll;
    (void)text;
    (void)textlength;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucol_openRules(void* rules, int32_t ruleslength, int32_t normalizationmode, int32_t strength, void* parseerror, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_openRules");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rules, ruleslength, normalizationmode, strength, parseerror, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)rules;
    (void)ruleslength;
    (void)normalizationmode;
    (void)strength;
    (void)parseerror;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_previous(void* elems, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_previous");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(elems, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)elems;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_primaryOrder(int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_primaryOrder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucol_reset(void* elems) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_reset");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(elems);
        return;
    }
    errno = ENOSYS;
#else
    (void)elems;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ucol_safeClone(void* coll, void* stackbuffer, void* pbuffersize, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_safeClone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, stackbuffer, pbuffersize, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)coll;
    (void)stackbuffer;
    (void)pbuffersize;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_secondaryOrder(int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_secondaryOrder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucol_setAttribute(void* coll, int32_t attr, int32_t value, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_setAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coll, attr, value, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)coll;
    (void)attr;
    (void)value;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucol_setMaxVariable(void* coll, int32_t group, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_setMaxVariable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coll, group, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)coll;
    (void)group;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucol_setOffset(void* elems, int32_t offset, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_setOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(elems, offset, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)elems;
    (void)offset;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucol_setReorderCodes(void* coll, void* reordercodes, int32_t reordercodeslength, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_setReorderCodes");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coll, reordercodes, reordercodeslength, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)coll;
    (void)reordercodes;
    (void)reordercodeslength;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucol_setStrength(void* coll, int32_t strength) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_setStrength");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(coll, strength);
        return;
    }
    errno = ENOSYS;
#else
    (void)coll;
    (void)strength;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucol_setText(void* elems, void* text, int32_t textlength, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_setText");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(elems, text, textlength, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)elems;
    (void)text;
    (void)textlength;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_strcoll(void* coll, void* source, int32_t sourcelength, void* target, int32_t targetlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_strcoll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, source, sourcelength, target, targetlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)source;
    (void)sourcelength;
    (void)target;
    (void)targetlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_strcollIter(void* coll, void* siter, void* titer, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_strcollIter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, siter, titer, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)siter;
    (void)titer;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_strcollUTF8(void* coll, void* source, int32_t sourcelength, void* target, int32_t targetlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_strcollUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(coll, source, sourcelength, target, targetlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)coll;
    (void)source;
    (void)sourcelength;
    (void)target;
    (void)targetlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucol_tertiaryOrder(int32_t order) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucol_tertiaryOrder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(order);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)order;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_ucpmap_get(void* map, int32_t c) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucpmap_get");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(map, c);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)map;
    (void)c;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_ucpmap_getRange(void* map, int32_t start, int32_t option, uint32_t surrogatevalue, void* filter, void* context, void* pvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucpmap_getRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(map, start, option, surrogatevalue, filter, context, pvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)map;
    (void)start;
    (void)option;
    (void)surrogatevalue;
    (void)filter;
    (void)context;
    (void)pvalue;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucptrie_close(void* trie) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucptrie_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(trie);
        return;
    }
    errno = ENOSYS;
#else
    (void)trie;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_globalization_ucptrie_get(void* trie, int32_t c) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucptrie_get");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie, c);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)trie;
    (void)c;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_ucptrie_getRange(void* trie, int32_t start, int32_t option, uint32_t surrogatevalue, void* filter, void* context, void* pvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucptrie_getRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie, start, option, surrogatevalue, filter, context, pvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)trie;
    (void)start;
    (void)option;
    (void)surrogatevalue;
    (void)filter;
    (void)context;
    (void)pvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucptrie_getType(void* trie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucptrie_getType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)trie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucptrie_getValueWidth(void* trie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucptrie_getValueWidth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)trie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucptrie_internalSmallIndex(void* trie, int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucptrie_internalSmallIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)trie;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucptrie_internalSmallU8Index(void* trie, int32_t lt1, uint8_t t2, uint8_t t3) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint8_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucptrie_internalSmallU8Index");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie, lt1, t2, t3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)trie;
    (void)lt1;
    (void)t2;
    (void)t3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucptrie_internalU8PrevIndex(void* trie, int32_t c, void* start, void* src) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucptrie_internalU8PrevIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie, c, start, src);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)trie;
    (void)c;
    (void)start;
    (void)src;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucptrie_openFromBinary(int32_t type, int32_t valuewidth, void* data, int32_t length, void* pactuallength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucptrie_openFromBinary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type, valuewidth, data, length, pactuallength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)type;
    (void)valuewidth;
    (void)data;
    (void)length;
    (void)pactuallength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucptrie_toBinary(void* trie, void* data, int32_t capacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucptrie_toBinary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie, data, capacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)trie;
    (void)data;
    (void)capacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ucsdet_close(void* ucsd) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ucsd);
        return;
    }
    errno = ENOSYS;
#else
    (void)ucsd;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ucsdet_detect(void* ucsd, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_detect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucsd, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ucsd;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucsdet_detectAll(void* ucsd, void* matchesfound, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_detectAll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucsd, matchesfound, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ucsd;
    (void)matchesfound;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int8_t windowssys_windows_win32_globalization_ucsdet_enableInputFilter(void* ucsd, int8_t filter) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_enableInputFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucsd, filter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ucsd;
    (void)filter;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucsdet_getAllDetectableCharsets(void* ucsd, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_getAllDetectableCharsets");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucsd, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ucsd;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucsdet_getConfidence(void* ucsm, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_getConfidence");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucsm, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ucsm;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucsdet_getLanguage(void* ucsm, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_getLanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucsm, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ucsm;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucsdet_getName(void* ucsm, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_getName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucsm, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ucsm;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucsdet_getUChars(void* ucsm, void* buf, int32_t cap, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_getUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucsm, buf, cap, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ucsm;
    (void)buf;
    (void)cap;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ucsdet_isInputFilterEnabled(void* ucsd) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_isInputFilterEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ucsd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ucsd;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucsdet_open(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ucsdet_setDeclaredEncoding(void* ucsd, void* encoding, int32_t length, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_setDeclaredEncoding");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ucsd, encoding, length, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)ucsd;
    (void)encoding;
    (void)length;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ucsdet_setText(void* ucsd, void* textin, int32_t len, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucsdet_setText");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ucsd, textin, len, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)ucsd;
    (void)textin;
    (void)len;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ucurr_countCurrencies(void* locale, double date, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_countCurrencies");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, date, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)date;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucurr_forLocale(void* locale, void* buff, int32_t buffcapacity, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_forLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, buff, buffcapacity, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)buff;
    (void)buffcapacity;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucurr_forLocaleAndDate(void* locale, double date, int32_t arg_2_index, void* buff, int32_t buffcapacity, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_forLocaleAndDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, date, arg_2_index, buff, buffcapacity, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)date;
    (void)arg_2_index;
    (void)buff;
    (void)buffcapacity;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucurr_getDefaultFractionDigits(void* currency, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_getDefaultFractionDigits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currency, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)currency;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ucurr_getDefaultFractionDigitsForUsage(void* currency, int32_t usage, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_getDefaultFractionDigitsForUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currency, usage, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)currency;
    (void)usage;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucurr_getKeywordValuesForLocale(void* key, void* locale, int8_t commonlyused, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_getKeywordValuesForLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, locale, commonlyused, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)key;
    (void)locale;
    (void)commonlyused;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucurr_getName(void* currency, void* locale, int32_t namestyle, void* ischoiceformat, void* len, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_getName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currency, locale, namestyle, ischoiceformat, len, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)currency;
    (void)locale;
    (void)namestyle;
    (void)ischoiceformat;
    (void)len;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ucurr_getNumericCode(void* currency) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_getNumericCode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currency);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)currency;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucurr_getPluralName(void* currency, void* locale, void* ischoiceformat, void* pluralcount, void* len, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_getPluralName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currency, locale, ischoiceformat, pluralcount, len, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)currency;
    (void)locale;
    (void)ischoiceformat;
    (void)pluralcount;
    (void)len;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

double windowssys_windows_win32_globalization_ucurr_getRoundingIncrement(void* currency, void* ec) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_getRoundingIncrement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currency, ec);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)currency;
    (void)ec;
    errno = ENOSYS;
    return 0.0;
#endif
}

double windowssys_windows_win32_globalization_ucurr_getRoundingIncrementForUsage(void* currency, int32_t usage, void* ec) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_getRoundingIncrementForUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currency, usage, ec);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)currency;
    (void)usage;
    (void)ec;
    errno = ENOSYS;
    return 0.0;
#endif
}

int8_t windowssys_windows_win32_globalization_ucurr_isAvailable(void* isocode, double from, double to, void* errorcode) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, double, double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_isAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(isocode, from, to, errorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)isocode;
    (void)from;
    (void)to;
    (void)errorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ucurr_openISOCurrencies(uint32_t currtype, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_openISOCurrencies");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currtype, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)currtype;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ucurr_register(void* isocode, void* locale, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_register");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(isocode, locale, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)isocode;
    (void)locale;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int8_t windowssys_windows_win32_globalization_ucurr_unregister(void* key, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ucurr_unregister");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)key;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_udat_adoptNumberFormat(void* fmt, void* numberformattoadopt) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_adoptNumberFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, numberformattoadopt);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)numberformattoadopt;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udat_adoptNumberFormatForFields(void* fmt, void* fields, void* numberformattoset, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_adoptNumberFormatForFields");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, fields, numberformattoset, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)fields;
    (void)numberformattoset;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udat_applyPattern(void* format, int8_t localized, void* pattern, int32_t patternlength) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_applyPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(format, localized, pattern, patternlength);
        return;
    }
    errno = ENOSYS;
#else
    (void)format;
    (void)localized;
    (void)pattern;
    (void)patternlength;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_udat_clone(void* fmt, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_udat_close(void* format) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(format);
        return;
    }
    errno = ENOSYS;
#else
    (void)format;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_udat_countAvailable(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_countAvailable");
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

int32_t windowssys_windows_win32_globalization_udat_countSymbols(void* fmt, int32_t type) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_countSymbols");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, type);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)type;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_udat_format(void* format, double datetoformat, void* result, int32_t resultlength, void* position, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_format");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, datetoformat, result, resultlength, position, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)datetoformat;
    (void)result;
    (void)resultlength;
    (void)position;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_udat_formatCalendar(void* format, void* calendar, void* result, int32_t capacity, void* position, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_formatCalendar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, calendar, result, capacity, position, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)calendar;
    (void)result;
    (void)capacity;
    (void)position;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_udat_formatCalendarForFields(void* format, void* calendar, void* result, int32_t capacity, void* fpositer, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_formatCalendarForFields");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, calendar, result, capacity, fpositer, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)calendar;
    (void)result;
    (void)capacity;
    (void)fpositer;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_udat_formatForFields(void* format, double datetoformat, void* result, int32_t resultlength, void* fpositer, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_formatForFields");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, datetoformat, result, resultlength, fpositer, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)datetoformat;
    (void)result;
    (void)resultlength;
    (void)fpositer;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

double windowssys_windows_win32_globalization_udat_get2DigitYearStart(void* fmt, void* status) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_get2DigitYearStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return 0.0;
#endif
}

void* windowssys_windows_win32_globalization_udat_getAvailable(int32_t localeindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_getAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)localeindex;
    errno = ENOSYS;
    return NULL;
#endif
}

int8_t windowssys_windows_win32_globalization_udat_getBooleanAttribute(void* fmt, int32_t attr, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_getBooleanAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, attr, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)attr;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_udat_getCalendar(void* fmt) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_getCalendar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_udat_getContext(void* fmt, int32_t type, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_getContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, type, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_udat_getLocaleByType(void* fmt, int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_getLocaleByType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_udat_getNumberFormat(void* fmt) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_getNumberFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_udat_getNumberFormatForField(void* fmt, uint16_t field) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_getNumberFormatForField");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, field);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)field;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_udat_getSymbols(void* fmt, int32_t type, int32_t symbolindex, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_getSymbols");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, type, symbolindex, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)type;
    (void)symbolindex;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_udat_isLenient(void* fmt) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_isLenient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_udat_open(int32_t timestyle, int32_t datestyle, void* locale, void* tzid, int32_t tzidlength, void* pattern, int32_t patternlength, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timestyle, datestyle, locale, tzid, tzidlength, pattern, patternlength, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)timestyle;
    (void)datestyle;
    (void)locale;
    (void)tzid;
    (void)tzidlength;
    (void)pattern;
    (void)patternlength;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

double windowssys_windows_win32_globalization_udat_parse(void* format, void* text, int32_t textlength, void* parsepos, void* status) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_parse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, text, textlength, parsepos, status);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)format;
    (void)text;
    (void)textlength;
    (void)parsepos;
    (void)status;
    errno = ENOSYS;
    return 0.0;
#endif
}

void windowssys_windows_win32_globalization_udat_parseCalendar(void* format, void* calendar, void* text, int32_t textlength, void* parsepos, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_parseCalendar");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(format, calendar, text, textlength, parsepos, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)format;
    (void)calendar;
    (void)text;
    (void)textlength;
    (void)parsepos;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udat_set2DigitYearStart(void* fmt, double d, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_set2DigitYearStart");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, d, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)d;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udat_setBooleanAttribute(void* fmt, int32_t attr, int8_t newvalue, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_setBooleanAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, attr, newvalue, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)attr;
    (void)newvalue;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udat_setCalendar(void* fmt, void* calendartoset) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_setCalendar");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, calendartoset);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)calendartoset;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udat_setContext(void* fmt, int32_t value, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_setContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, value, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)value;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udat_setLenient(void* fmt, int8_t islenient) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_setLenient");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, islenient);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)islenient;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udat_setNumberFormat(void* fmt, void* numberformattoset) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_setNumberFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, numberformattoset);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)numberformattoset;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udat_setSymbols(void* format, int32_t type, int32_t symbolindex, void* value, int32_t valuelength, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_setSymbols");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(format, type, symbolindex, value, valuelength, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)format;
    (void)type;
    (void)symbolindex;
    (void)value;
    (void)valuelength;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_udat_toCalendarDateField(int32_t field) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_toCalendarDateField");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(field);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)field;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_udat_toPattern(void* fmt, int8_t localized, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int8_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udat_toPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, localized, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)localized;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_udatpg_addPattern(void* dtpg, void* pattern, int32_t patternlength, int8_t override, void* conflictingpattern, int32_t capacity, void* plength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int8_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_addPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, pattern, patternlength, override, conflictingpattern, capacity, plength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dtpg;
    (void)pattern;
    (void)patternlength;
    (void)override;
    (void)conflictingpattern;
    (void)capacity;
    (void)plength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_udatpg_clone(void* dtpg, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dtpg;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_udatpg_close(void* dtpg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dtpg);
        return;
    }
    errno = ENOSYS;
#else
    (void)dtpg;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_udatpg_getAppendItemFormat(void* dtpg, int32_t field, void* plength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_getAppendItemFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, field, plength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dtpg;
    (void)field;
    (void)plength;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_udatpg_getAppendItemName(void* dtpg, int32_t field, void* plength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_getAppendItemName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, field, plength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dtpg;
    (void)field;
    (void)plength;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_udatpg_getBaseSkeleton(void* unuseddtpg, void* pattern, int32_t length, void* baseskeleton, int32_t capacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_getBaseSkeleton");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unuseddtpg, pattern, length, baseskeleton, capacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unuseddtpg;
    (void)pattern;
    (void)length;
    (void)baseskeleton;
    (void)capacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_udatpg_getBestPattern(void* dtpg, void* skeleton, int32_t length, void* bestpattern, int32_t capacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_getBestPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, skeleton, length, bestpattern, capacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dtpg;
    (void)skeleton;
    (void)length;
    (void)bestpattern;
    (void)capacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_udatpg_getBestPatternWithOptions(void* dtpg, void* skeleton, int32_t length, int32_t options, void* bestpattern, int32_t capacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_getBestPatternWithOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, skeleton, length, options, bestpattern, capacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dtpg;
    (void)skeleton;
    (void)length;
    (void)options;
    (void)bestpattern;
    (void)capacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_udatpg_getDateTimeFormat(void* dtpg, void* plength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_getDateTimeFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, plength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dtpg;
    (void)plength;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_udatpg_getDecimal(void* dtpg, void* plength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_getDecimal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, plength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dtpg;
    (void)plength;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_udatpg_getFieldDisplayName(void* dtpg, int32_t field, int32_t width, void* fieldname, int32_t capacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_getFieldDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, field, width, fieldname, capacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dtpg;
    (void)field;
    (void)width;
    (void)fieldname;
    (void)capacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_udatpg_getPatternForSkeleton(void* dtpg, void* skeleton, int32_t skeletonlength, void* plength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_getPatternForSkeleton");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, skeleton, skeletonlength, plength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dtpg;
    (void)skeleton;
    (void)skeletonlength;
    (void)plength;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_udatpg_getSkeleton(void* unuseddtpg, void* pattern, int32_t length, void* skeleton, int32_t capacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_getSkeleton");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unuseddtpg, pattern, length, skeleton, capacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unuseddtpg;
    (void)pattern;
    (void)length;
    (void)skeleton;
    (void)capacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_udatpg_open(void* locale, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_udatpg_openBaseSkeletons(void* dtpg, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_openBaseSkeletons");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dtpg;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_udatpg_openEmpty(void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_openEmpty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_udatpg_openSkeletons(void* dtpg, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_openSkeletons");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dtpg;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_udatpg_replaceFieldTypes(void* dtpg, void* pattern, int32_t patternlength, void* skeleton, int32_t skeletonlength, void* dest, int32_t destcapacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_replaceFieldTypes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, pattern, patternlength, skeleton, skeletonlength, dest, destcapacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dtpg;
    (void)pattern;
    (void)patternlength;
    (void)skeleton;
    (void)skeletonlength;
    (void)dest;
    (void)destcapacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_udatpg_replaceFieldTypesWithOptions(void* dtpg, void* pattern, int32_t patternlength, void* skeleton, int32_t skeletonlength, int32_t options, void* dest, int32_t destcapacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_replaceFieldTypesWithOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dtpg, pattern, patternlength, skeleton, skeletonlength, options, dest, destcapacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dtpg;
    (void)pattern;
    (void)patternlength;
    (void)skeleton;
    (void)skeletonlength;
    (void)options;
    (void)dest;
    (void)destcapacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_udatpg_setAppendItemFormat(void* dtpg, int32_t field, void* value, int32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_setAppendItemFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dtpg, field, value, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)dtpg;
    (void)field;
    (void)value;
    (void)length;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udatpg_setAppendItemName(void* dtpg, int32_t field, void* value, int32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_setAppendItemName");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dtpg, field, value, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)dtpg;
    (void)field;
    (void)value;
    (void)length;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udatpg_setDateTimeFormat(void* dtpg, void* dtformat, int32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_setDateTimeFormat");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dtpg, dtformat, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)dtpg;
    (void)dtformat;
    (void)length;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udatpg_setDecimal(void* dtpg, void* decimal, int32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udatpg_setDecimal");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dtpg, decimal, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)dtpg;
    (void)decimal;
    (void)length;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udtitvfmt_close(void* formatter) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udtitvfmt_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(formatter);
        return;
    }
    errno = ENOSYS;
#else
    (void)formatter;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_udtitvfmt_closeResult(void* uresult) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udtitvfmt_closeResult");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uresult);
        return;
    }
    errno = ENOSYS;
#else
    (void)uresult;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_udtitvfmt_format(void* formatter, double fromdate, double todate, void* result, int32_t resultcapacity, void* position, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, double, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udtitvfmt_format");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(formatter, fromdate, todate, result, resultcapacity, position, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)formatter;
    (void)fromdate;
    (void)todate;
    (void)result;
    (void)resultcapacity;
    (void)position;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_udtitvfmt_open(void* locale, void* skeleton, int32_t skeletonlength, void* tzid, int32_t tzidlength, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udtitvfmt_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, skeleton, skeletonlength, tzid, tzidlength, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)skeleton;
    (void)skeletonlength;
    (void)tzid;
    (void)tzidlength;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_udtitvfmt_openResult(void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udtitvfmt_openResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_udtitvfmt_resultAsValue(void* uresult, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "udtitvfmt_resultAsValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uresult, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uresult;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_uenum_close(void* en) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uenum_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(en);
        return;
    }
    errno = ENOSYS;
#else
    (void)en;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uenum_count(void* en, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uenum_count");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(en, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)en;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uenum_next(void* en, void* resultlength, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uenum_next");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(en, resultlength, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)en;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uenum_openCharStringsEnumeration(void* strings, int32_t count, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uenum_openCharStringsEnumeration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strings, count, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)strings;
    (void)count;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uenum_openUCharStringsEnumeration(void* strings, int32_t count, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uenum_openUCharStringsEnumeration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strings, count, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)strings;
    (void)count;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_uenum_reset(void* en, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uenum_reset");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(en, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)en;
    (void)status;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_uenum_unext(void* en, void* resultlength, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uenum_unext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(en, resultlength, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)en;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ufieldpositer_close(void* fpositer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufieldpositer_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fpositer);
        return;
    }
    errno = ENOSYS;
#else
    (void)fpositer;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ufieldpositer_next(void* fpositer, void* beginindex, void* endindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufieldpositer_next");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fpositer, beginindex, endindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fpositer;
    (void)beginindex;
    (void)endindex;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ufieldpositer_open(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufieldpositer_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ufmt_close(void* fmt) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ufmt_getArrayItemByIndex(void* fmt, int32_t n, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_getArrayItemByIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, n, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)n;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ufmt_getArrayLength(void* fmt, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_getArrayLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

double windowssys_windows_win32_globalization_ufmt_getDate(void* fmt, void* status) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_getDate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return 0.0;
#endif
}

void* windowssys_windows_win32_globalization_ufmt_getDecNumChars(void* fmt, void* len, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_getDecNumChars");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, len, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)len;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

double windowssys_windows_win32_globalization_ufmt_getDouble(void* fmt, void* status) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_getDouble");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return 0.0;
#endif
}

int64_t windowssys_windows_win32_globalization_ufmt_getInt64(void* fmt, void* status) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_getInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ufmt_getLong(void* fmt, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_getLong");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ufmt_getObject(void* fmt, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_getObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ufmt_getType(void* fmt, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_getType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ufmt_getUChars(void* fmt, void* len, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_getUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, len, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)len;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int8_t windowssys_windows_win32_globalization_ufmt_isNumeric(void* fmt) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_isNumeric");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ufmt_open(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmt_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ufmtval_getString(void* ufmtval, void* plength, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmtval_getString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ufmtval, plength, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ufmtval;
    (void)plength;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

int8_t windowssys_windows_win32_globalization_ufmtval_nextPosition(void* ufmtval, void* ucfpos, void* ec) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ufmtval_nextPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ufmtval, ucfpos, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ufmtval;
    (void)ucfpos;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ugender_getInstance(void* locale, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ugender_getInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ugender_getListGender(void* genderinfo, void* genders, int32_t size, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ugender_getListGender");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(genderinfo, genders, size, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)genderinfo;
    (void)genders;
    (void)size;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uidna_close(void* idna) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uidna_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(idna);
        return;
    }
    errno = ENOSYS;
#else
    (void)idna;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uidna_labelToASCII(void* idna, void* label, int32_t length, void* dest, int32_t capacity, void* pinfo, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uidna_labelToASCII");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idna, label, length, dest, capacity, pinfo, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idna;
    (void)label;
    (void)length;
    (void)dest;
    (void)capacity;
    (void)pinfo;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uidna_labelToASCII_UTF8(void* idna, void* label, int32_t length, void* dest, int32_t capacity, void* pinfo, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uidna_labelToASCII_UTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idna, label, length, dest, capacity, pinfo, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idna;
    (void)label;
    (void)length;
    (void)dest;
    (void)capacity;
    (void)pinfo;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uidna_labelToUnicode(void* idna, void* label, int32_t length, void* dest, int32_t capacity, void* pinfo, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uidna_labelToUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idna, label, length, dest, capacity, pinfo, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idna;
    (void)label;
    (void)length;
    (void)dest;
    (void)capacity;
    (void)pinfo;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uidna_labelToUnicodeUTF8(void* idna, void* label, int32_t length, void* dest, int32_t capacity, void* pinfo, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uidna_labelToUnicodeUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idna, label, length, dest, capacity, pinfo, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idna;
    (void)label;
    (void)length;
    (void)dest;
    (void)capacity;
    (void)pinfo;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uidna_nameToASCII(void* idna, void* name, int32_t length, void* dest, int32_t capacity, void* pinfo, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uidna_nameToASCII");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idna, name, length, dest, capacity, pinfo, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idna;
    (void)name;
    (void)length;
    (void)dest;
    (void)capacity;
    (void)pinfo;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uidna_nameToASCII_UTF8(void* idna, void* name, int32_t length, void* dest, int32_t capacity, void* pinfo, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uidna_nameToASCII_UTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idna, name, length, dest, capacity, pinfo, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idna;
    (void)name;
    (void)length;
    (void)dest;
    (void)capacity;
    (void)pinfo;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uidna_nameToUnicode(void* idna, void* name, int32_t length, void* dest, int32_t capacity, void* pinfo, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uidna_nameToUnicode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idna, name, length, dest, capacity, pinfo, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idna;
    (void)name;
    (void)length;
    (void)dest;
    (void)capacity;
    (void)pinfo;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uidna_nameToUnicodeUTF8(void* idna, void* name, int32_t length, void* dest, int32_t capacity, void* pinfo, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uidna_nameToUnicodeUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idna, name, length, dest, capacity, pinfo, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idna;
    (void)name;
    (void)length;
    (void)dest;
    (void)capacity;
    (void)pinfo;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uidna_openUTS46(uint32_t options, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uidna_openUTS46");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(options, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)options;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uiter_current32(void* iter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uiter_current32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iter;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_uiter_getState(void* iter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uiter_getState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)iter;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_uiter_next32(void* iter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uiter_next32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uiter_previous32(void* iter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uiter_previous32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(iter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)iter;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uiter_setState(void* iter, uint32_t state, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uiter_setState");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(iter, state, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)iter;
    (void)state;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uiter_setString(void* iter, void* s, int32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uiter_setString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(iter, s, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)iter;
    (void)s;
    (void)length;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uiter_setUTF16BE(void* iter, void* s, int32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uiter_setUTF16BE");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(iter, s, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)iter;
    (void)s;
    (void)length;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uiter_setUTF8(void* iter, void* s, int32_t length) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uiter_setUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(iter, s, length);
        return;
    }
    errno = ENOSYS;
#else
    (void)iter;
    (void)s;
    (void)length;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uldn_close(void* ldn) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ldn);
        return;
    }
    errno = ENOSYS;
#else
    (void)ldn;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uldn_getContext(void* ldn, int32_t type, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_getContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn, type, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ldn;
    (void)type;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uldn_getDialectHandling(void* ldn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_getDialectHandling");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ldn;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uldn_getLocale(void* ldn) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_getLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ldn;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uldn_keyDisplayName(void* ldn, void* key, void* result, int32_t maxresultsize, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_keyDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn, key, result, maxresultsize, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ldn;
    (void)key;
    (void)result;
    (void)maxresultsize;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uldn_keyValueDisplayName(void* ldn, void* key, void* value, void* result, int32_t maxresultsize, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_keyValueDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn, key, value, result, maxresultsize, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ldn;
    (void)key;
    (void)value;
    (void)result;
    (void)maxresultsize;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uldn_languageDisplayName(void* ldn, void* lang, void* result, int32_t maxresultsize, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_languageDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn, lang, result, maxresultsize, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ldn;
    (void)lang;
    (void)result;
    (void)maxresultsize;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uldn_localeDisplayName(void* ldn, void* locale, void* result, int32_t maxresultsize, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_localeDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn, locale, result, maxresultsize, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ldn;
    (void)locale;
    (void)result;
    (void)maxresultsize;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uldn_open(void* locale, int32_t dialecthandling, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, dialecthandling, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)dialecthandling;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uldn_openForContext(void* locale, void* contexts, int32_t length, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_openForContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, contexts, length, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)contexts;
    (void)length;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uldn_regionDisplayName(void* ldn, void* region, void* result, int32_t maxresultsize, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_regionDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn, region, result, maxresultsize, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ldn;
    (void)region;
    (void)result;
    (void)maxresultsize;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uldn_scriptCodeDisplayName(void* ldn, int32_t scriptcode, void* result, int32_t maxresultsize, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_scriptCodeDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn, scriptcode, result, maxresultsize, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ldn;
    (void)scriptcode;
    (void)result;
    (void)maxresultsize;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uldn_scriptDisplayName(void* ldn, void* script, void* result, int32_t maxresultsize, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_scriptDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn, script, result, maxresultsize, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ldn;
    (void)script;
    (void)result;
    (void)maxresultsize;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uldn_variantDisplayName(void* ldn, void* variant, void* result, int32_t maxresultsize, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uldn_variantDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ldn, variant, result, maxresultsize, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ldn;
    (void)variant;
    (void)result;
    (void)maxresultsize;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ulistfmt_close(void* listfmt) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulistfmt_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listfmt);
        return;
    }
    errno = ENOSYS;
#else
    (void)listfmt;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ulistfmt_closeResult(void* uresult) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulistfmt_closeResult");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uresult);
        return;
    }
    errno = ENOSYS;
#else
    (void)uresult;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ulistfmt_format(void* listfmt, void* strings, void* stringlengths, int32_t stringcount, void* result, int32_t resultcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulistfmt_format");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listfmt, strings, stringlengths, stringcount, result, resultcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)listfmt;
    (void)strings;
    (void)stringlengths;
    (void)stringcount;
    (void)result;
    (void)resultcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ulistfmt_formatStringsToResult(void* listfmt, void* strings, void* stringlengths, int32_t stringcount, void* uresult, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulistfmt_formatStringsToResult");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listfmt, strings, stringlengths, stringcount, uresult, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)listfmt;
    (void)strings;
    (void)stringlengths;
    (void)stringcount;
    (void)uresult;
    (void)status;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ulistfmt_open(void* locale, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulistfmt_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ulistfmt_openForType(void* locale, int32_t type, int32_t width, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulistfmt_openForType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, type, width, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)type;
    (void)width;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ulistfmt_openResult(void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulistfmt_openResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ulistfmt_resultAsValue(void* uresult, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulistfmt_resultAsValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uresult, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uresult;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_acceptLanguage(void* result, int32_t resultavailable, void* outresult, void* acceptlist, int32_t acceptlistcount, void* availablelocales, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_acceptLanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(result, resultavailable, outresult, acceptlist, acceptlistcount, availablelocales, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)result;
    (void)resultavailable;
    (void)outresult;
    (void)acceptlist;
    (void)acceptlistcount;
    (void)availablelocales;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_acceptLanguageFromHTTP(void* result, int32_t resultavailable, void* outresult, void* httpacceptlanguage, void* availablelocales, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_acceptLanguageFromHTTP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(result, resultavailable, outresult, httpacceptlanguage, availablelocales, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)result;
    (void)resultavailable;
    (void)outresult;
    (void)httpacceptlanguage;
    (void)availablelocales;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_addLikelySubtags(void* localeid, void* maximizedlocaleid, int32_t maximizedlocaleidcapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_addLikelySubtags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, maximizedlocaleid, maximizedlocaleidcapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)maximizedlocaleid;
    (void)maximizedlocaleidcapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_canonicalize(void* localeid, void* name, int32_t namecapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_canonicalize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, name, namecapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)name;
    (void)namecapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_countAvailable(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_countAvailable");
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

int32_t windowssys_windows_win32_globalization_uloc_forLanguageTag(void* langtag, void* localeid, int32_t localeidcapacity, void* parsedlength, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_forLanguageTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(langtag, localeid, localeidcapacity, parsedlength, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)langtag;
    (void)localeid;
    (void)localeidcapacity;
    (void)parsedlength;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uloc_getAvailable(int32_t n) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(n);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)n;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getBaseName(void* localeid, void* name, int32_t namecapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getBaseName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, name, namecapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)name;
    (void)namecapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getCharacterOrientation(void* localeid, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getCharacterOrientation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getCountry(void* localeid, void* country, int32_t countrycapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getCountry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, country, countrycapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)country;
    (void)countrycapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uloc_getDefault(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getDefault");
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

int32_t windowssys_windows_win32_globalization_uloc_getDisplayCountry(void* locale, void* displaylocale, void* country, int32_t countrycapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getDisplayCountry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, displaylocale, country, countrycapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)displaylocale;
    (void)country;
    (void)countrycapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getDisplayKeyword(void* keyword, void* displaylocale, void* dest, int32_t destcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getDisplayKeyword");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyword, displaylocale, dest, destcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyword;
    (void)displaylocale;
    (void)dest;
    (void)destcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getDisplayKeywordValue(void* locale, void* keyword, void* displaylocale, void* dest, int32_t destcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getDisplayKeywordValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, keyword, displaylocale, dest, destcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)keyword;
    (void)displaylocale;
    (void)dest;
    (void)destcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getDisplayLanguage(void* locale, void* displaylocale, void* language, int32_t languagecapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getDisplayLanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, displaylocale, language, languagecapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)displaylocale;
    (void)language;
    (void)languagecapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getDisplayName(void* localeid, void* inlocaleid, void* result, int32_t maxresultsize, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getDisplayName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, inlocaleid, result, maxresultsize, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)inlocaleid;
    (void)result;
    (void)maxresultsize;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getDisplayScript(void* locale, void* displaylocale, void* script, int32_t scriptcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getDisplayScript");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, displaylocale, script, scriptcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)displaylocale;
    (void)script;
    (void)scriptcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getDisplayVariant(void* locale, void* displaylocale, void* variant, int32_t variantcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getDisplayVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, displaylocale, variant, variantcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    (void)displaylocale;
    (void)variant;
    (void)variantcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uloc_getISO3Country(void* localeid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getISO3Country");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)localeid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uloc_getISO3Language(void* localeid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getISO3Language");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)localeid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uloc_getISOCountries(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getISOCountries");
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

void* windowssys_windows_win32_globalization_uloc_getISOLanguages(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getISOLanguages");
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

int32_t windowssys_windows_win32_globalization_uloc_getKeywordValue(void* localeid, void* keywordname, void* buffer, int32_t buffercapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getKeywordValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, keywordname, buffer, buffercapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)keywordname;
    (void)buffer;
    (void)buffercapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_uloc_getLCID(void* localeid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getLCID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)localeid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getLanguage(void* localeid, void* language, int32_t languagecapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getLanguage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, language, languagecapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)language;
    (void)languagecapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getLineOrientation(void* localeid, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getLineOrientation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getLocaleForLCID(uint32_t hostid, void* locale, int32_t localecapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getLocaleForLCID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hostid, locale, localecapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hostid;
    (void)locale;
    (void)localecapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getName(void* localeid, void* name, int32_t namecapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, name, namecapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)name;
    (void)namecapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getParent(void* localeid, void* parent, int32_t parentcapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getParent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, parent, parentcapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)parent;
    (void)parentcapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getScript(void* localeid, void* script, int32_t scriptcapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getScript");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, script, scriptcapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)script;
    (void)scriptcapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_getVariant(void* localeid, void* variant, int32_t variantcapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_getVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, variant, variantcapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)variant;
    (void)variantcapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uloc_isRightToLeft(void* locale) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_isRightToLeft");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)locale;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_minimizeSubtags(void* localeid, void* minimizedlocaleid, int32_t minimizedlocaleidcapacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_minimizeSubtags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, minimizedlocaleid, minimizedlocaleidcapacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)minimizedlocaleid;
    (void)minimizedlocaleidcapacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uloc_openAvailableByType(int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_openAvailableByType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uloc_openKeywords(void* localeid, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_openKeywords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)localeid;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_uloc_setDefault(void* localeid, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_setDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(localeid, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)localeid;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_setKeywordValue(void* keywordname, void* keywordvalue, void* buffer, int32_t buffercapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_setKeywordValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keywordname, keywordvalue, buffer, buffercapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keywordname;
    (void)keywordvalue;
    (void)buffer;
    (void)buffercapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uloc_toLanguageTag(void* localeid, void* langtag, int32_t langtagcapacity, int8_t strict, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_toLanguageTag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, langtag, langtagcapacity, strict, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)langtag;
    (void)langtagcapacity;
    (void)strict;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uloc_toLegacyKey(void* keyword) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_toLegacyKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyword);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)keyword;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uloc_toLegacyType(void* keyword, void* value) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_toLegacyType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyword, value);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)keyword;
    (void)value;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uloc_toUnicodeLocaleKey(void* keyword) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_toUnicodeLocaleKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyword);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)keyword;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uloc_toUnicodeLocaleType(void* keyword, void* value) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uloc_toUnicodeLocaleType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyword, value);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)keyword;
    (void)value;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ulocdata_close(void* uld) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uld);
        return;
    }
    errno = ENOSYS;
#else
    (void)uld;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ulocdata_getCLDRVersion(void* versionarray, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_getCLDRVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(versionarray, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)versionarray;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ulocdata_getDelimiter(void* uld, int32_t type, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_getDelimiter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uld, type, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uld;
    (void)type;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ulocdata_getExemplarSet(void* uld, void* fillin, uint32_t options, int32_t extype, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_getExemplarSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uld, fillin, options, extype, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uld;
    (void)fillin;
    (void)options;
    (void)extype;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ulocdata_getLocaleDisplayPattern(void* uld, void* pattern, int32_t patterncapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_getLocaleDisplayPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uld, pattern, patterncapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uld;
    (void)pattern;
    (void)patterncapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ulocdata_getLocaleSeparator(void* uld, void* separator, int32_t separatorcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_getLocaleSeparator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uld, separator, separatorcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uld;
    (void)separator;
    (void)separatorcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ulocdata_getMeasurementSystem(void* localeid, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_getMeasurementSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localeid;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_ulocdata_getNoSubstitute(void* uld) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_getNoSubstitute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uld);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uld;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ulocdata_getPaperSize(void* localeid, void* height, void* width, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_getPaperSize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(localeid, height, width, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)localeid;
    (void)height;
    (void)width;
    (void)status;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ulocdata_open(void* localeid, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeid, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)localeid;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ulocdata_setNoSubstitute(void* uld, int8_t setting) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ulocdata_setNoSubstitute");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uld, setting);
        return;
    }
    errno = ENOSYS;
#else
    (void)uld;
    (void)setting;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_umsg_applyPattern(void* fmt, void* pattern, int32_t patternlength, void* parseerror, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umsg_applyPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, pattern, patternlength, parseerror, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)pattern;
    (void)patternlength;
    (void)parseerror;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_umsg_autoQuoteApostrophe(void* pattern, int32_t patternlength, void* dest, int32_t destcapacity, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umsg_autoQuoteApostrophe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, patternlength, dest, destcapacity, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pattern;
    (void)patternlength;
    (void)dest;
    (void)destcapacity;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_umsg_clone(void* fmt, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umsg_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_umsg_close(void* format) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umsg_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(format);
        return;
    }
    errno = ENOSYS;
#else
    (void)format;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_umsg_getLocale(void* fmt) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umsg_getLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_umsg_open(void* pattern, int32_t patternlength, void* locale, void* parseerror, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umsg_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, patternlength, locale, parseerror, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pattern;
    (void)patternlength;
    (void)locale;
    (void)parseerror;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_umsg_setLocale(void* fmt, void* locale) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umsg_setLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, locale);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)locale;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_umsg_toPattern(void* fmt, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umsg_toPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_umsg_vformat(void* fmt, void* result, int32_t resultlength, void* ap, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umsg_vformat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, result, resultlength, ap, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)result;
    (void)resultlength;
    (void)ap;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_umsg_vparse(void* fmt, void* source, int32_t sourcelength, void* count, void* ap, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umsg_vparse");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, source, sourcelength, count, ap, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)source;
    (void)sourcelength;
    (void)count;
    (void)ap;
    (void)status;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_umutablecptrie_buildImmutable(void* trie, int32_t type, int32_t valuewidth, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umutablecptrie_buildImmutable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie, type, valuewidth, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)trie;
    (void)type;
    (void)valuewidth;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_umutablecptrie_clone(void* other, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umutablecptrie_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(other, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)other;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_umutablecptrie_close(void* trie) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umutablecptrie_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(trie);
        return;
    }
    errno = ENOSYS;
#else
    (void)trie;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_umutablecptrie_fromUCPMap(void* map, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umutablecptrie_fromUCPMap");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(map, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)map;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_umutablecptrie_fromUCPTrie(void* trie, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umutablecptrie_fromUCPTrie");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)trie;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_globalization_umutablecptrie_get(void* trie, int32_t c) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umutablecptrie_get");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie, c);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)trie;
    (void)c;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_umutablecptrie_getRange(void* trie, int32_t start, int32_t option, uint32_t surrogatevalue, void* filter, void* context, void* pvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umutablecptrie_getRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trie, start, option, surrogatevalue, filter, context, pvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)trie;
    (void)start;
    (void)option;
    (void)surrogatevalue;
    (void)filter;
    (void)context;
    (void)pvalue;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_umutablecptrie_open(uint32_t initialvalue, uint32_t errorvalue, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umutablecptrie_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initialvalue, errorvalue, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)initialvalue;
    (void)errorvalue;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_umutablecptrie_set(void* trie, int32_t c, uint32_t value, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umutablecptrie_set");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(trie, c, value, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)trie;
    (void)c;
    (void)value;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_umutablecptrie_setRange(void* trie, int32_t start, int32_t end, uint32_t value, void* perrorcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "umutablecptrie_setRange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(trie, start, end, value, perrorcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)trie;
    (void)start;
    (void)end;
    (void)value;
    (void)perrorcode;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_unorm2_append(void* norm2, void* first, int32_t firstlength, int32_t firstcapacity, void* second, int32_t secondlength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_append");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, first, firstlength, firstcapacity, second, secondlength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)first;
    (void)firstlength;
    (void)firstcapacity;
    (void)second;
    (void)secondlength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_unorm2_close(void* norm2) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(norm2);
        return;
    }
    errno = ENOSYS;
#else
    (void)norm2;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_unorm2_composePair(void* norm2, int32_t a, int32_t b) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_composePair");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, a, b);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)a;
    (void)b;
    errno = ENOSYS;
    return -1;
#endif
}

uint8_t windowssys_windows_win32_globalization_unorm2_getCombiningClass(void* norm2, int32_t c) {
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_getCombiningClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, c);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)norm2;
    (void)c;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_globalization_unorm2_getDecomposition(void* norm2, int32_t c, void* decomposition, int32_t capacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_getDecomposition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, c, decomposition, capacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)c;
    (void)decomposition;
    (void)capacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_unorm2_getInstance(void* packagename, void* name, int32_t mode, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_getInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagename, name, mode, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)packagename;
    (void)name;
    (void)mode;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_unorm2_getNFCInstance(void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_getNFCInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_unorm2_getNFDInstance(void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_getNFDInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_unorm2_getNFKCCasefoldInstance(void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_getNFKCCasefoldInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_unorm2_getNFKCInstance(void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_getNFKCInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_unorm2_getNFKDInstance(void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_getNFKDInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_unorm2_getRawDecomposition(void* norm2, int32_t c, void* decomposition, int32_t capacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_getRawDecomposition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, c, decomposition, capacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)c;
    (void)decomposition;
    (void)capacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_unorm2_hasBoundaryAfter(void* norm2, int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_hasBoundaryAfter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_unorm2_hasBoundaryBefore(void* norm2, int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_hasBoundaryBefore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_unorm2_isInert(void* norm2, int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_isInert");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_unorm2_isNormalized(void* norm2, void* s, int32_t length, void* perrorcode) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_isNormalized");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, s, length, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)s;
    (void)length;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unorm2_normalize(void* norm2, void* src, int32_t length, void* dest, int32_t capacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_normalize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, src, length, dest, capacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)src;
    (void)length;
    (void)dest;
    (void)capacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unorm2_normalizeSecondAndAppend(void* norm2, void* first, int32_t firstlength, int32_t firstcapacity, void* second, int32_t secondlength, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_normalizeSecondAndAppend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, first, firstlength, firstcapacity, second, secondlength, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)first;
    (void)firstlength;
    (void)firstcapacity;
    (void)second;
    (void)secondlength;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_unorm2_openFiltered(void* norm2, void* filterset, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_openFiltered");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, filterset, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)norm2;
    (void)filterset;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_unorm2_quickCheck(void* norm2, void* s, int32_t length, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_quickCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, s, length, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)s;
    (void)length;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unorm2_spanQuickCheckYes(void* norm2, void* s, int32_t length, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm2_spanQuickCheckYes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(norm2, s, length, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)norm2;
    (void)s;
    (void)length;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unorm_compare(void* s1, int32_t length1, void* s2, int32_t length2, uint32_t options, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unorm_compare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s1, length1, s2, length2, options, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s1;
    (void)length1;
    (void)s2;
    (void)length2;
    (void)options;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_unum_applyPattern(void* format, int8_t localized, void* pattern, int32_t patternlength, void* parseerror, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_applyPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(format, localized, pattern, patternlength, parseerror, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)format;
    (void)localized;
    (void)pattern;
    (void)patternlength;
    (void)parseerror;
    (void)status;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_unum_clone(void* fmt, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_unum_close(void* fmt) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_countAvailable(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_countAvailable");
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

int32_t windowssys_windows_win32_globalization_unum_format(void* fmt, int32_t number, void* result, int32_t resultlength, void* pos, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_format");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, number, result, resultlength, pos, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)number;
    (void)result;
    (void)resultlength;
    (void)pos;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_formatDecimal(void* fmt, void* number, int32_t length, void* result, int32_t resultlength, void* pos, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_formatDecimal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, number, length, result, resultlength, pos, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)number;
    (void)length;
    (void)result;
    (void)resultlength;
    (void)pos;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_formatDouble(void* fmt, double number, void* result, int32_t resultlength, void* pos, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_formatDouble");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, number, result, resultlength, pos, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)number;
    (void)result;
    (void)resultlength;
    (void)pos;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_formatDoubleCurrency(void* fmt, double number, void* currency, void* result, int32_t resultlength, void* pos, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_formatDoubleCurrency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, number, currency, result, resultlength, pos, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)number;
    (void)currency;
    (void)result;
    (void)resultlength;
    (void)pos;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_formatDoubleForFields(void* format, double number, void* result, int32_t resultlength, void* fpositer, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_formatDoubleForFields");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(format, number, result, resultlength, fpositer, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)format;
    (void)number;
    (void)result;
    (void)resultlength;
    (void)fpositer;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_formatInt64(void* fmt, int64_t number, void* result, int32_t resultlength, void* pos, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_formatInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, number, result, resultlength, pos, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)number;
    (void)result;
    (void)resultlength;
    (void)pos;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_formatUFormattable(void* fmt, void* number, void* result, int32_t resultlength, void* pos, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_formatUFormattable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, number, result, resultlength, pos, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)number;
    (void)result;
    (void)resultlength;
    (void)pos;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_getAttribute(void* fmt, int32_t attr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_getAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, attr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)attr;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_unum_getAvailable(int32_t localeindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_getAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localeindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)localeindex;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_getContext(void* fmt, int32_t type, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_getContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, type, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

double windowssys_windows_win32_globalization_unum_getDoubleAttribute(void* fmt, int32_t attr) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_getDoubleAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, attr);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)fmt;
    (void)attr;
    errno = ENOSYS;
    return 0.0;
#endif
}

void* windowssys_windows_win32_globalization_unum_getLocaleByType(void* fmt, int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_getLocaleByType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_getSymbol(void* fmt, int32_t symbol, void* buffer, int32_t size, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_getSymbol");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, symbol, buffer, size, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)symbol;
    (void)buffer;
    (void)size;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_getTextAttribute(void* fmt, int32_t tag, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_getTextAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, tag, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)tag;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_unum_open(int32_t style, void* pattern, int32_t patternlength, void* locale, void* parseerr, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(style, pattern, patternlength, locale, parseerr, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)style;
    (void)pattern;
    (void)patternlength;
    (void)locale;
    (void)parseerr;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_parse(void* fmt, void* text, int32_t textlength, void* parsepos, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_parse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, text, textlength, parsepos, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)text;
    (void)textlength;
    (void)parsepos;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_parseDecimal(void* fmt, void* text, int32_t textlength, void* parsepos, void* outbuf, int32_t outbuflength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_parseDecimal");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, text, textlength, parsepos, outbuf, outbuflength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)text;
    (void)textlength;
    (void)parsepos;
    (void)outbuf;
    (void)outbuflength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

double windowssys_windows_win32_globalization_unum_parseDouble(void* fmt, void* text, int32_t textlength, void* parsepos, void* status) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_parseDouble");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, text, textlength, parsepos, status);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)fmt;
    (void)text;
    (void)textlength;
    (void)parsepos;
    (void)status;
    errno = ENOSYS;
    return 0.0;
#endif
}

double windowssys_windows_win32_globalization_unum_parseDoubleCurrency(void* fmt, void* text, int32_t textlength, void* parsepos, void* currency, void* status) {
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_parseDoubleCurrency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, text, textlength, parsepos, currency, status);
    }
    errno = ENOSYS;
    return 0.0;
#else
    (void)fmt;
    (void)text;
    (void)textlength;
    (void)parsepos;
    (void)currency;
    (void)status;
    errno = ENOSYS;
    return 0.0;
#endif
}

int64_t windowssys_windows_win32_globalization_unum_parseInt64(void* fmt, void* text, int32_t textlength, void* parsepos, void* status) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_parseInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, text, textlength, parsepos, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)text;
    (void)textlength;
    (void)parsepos;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_unum_parseToUFormattable(void* fmt, void* result, void* text, int32_t textlength, void* parsepos, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_parseToUFormattable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, result, text, textlength, parsepos, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fmt;
    (void)result;
    (void)text;
    (void)textlength;
    (void)parsepos;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_unum_setAttribute(void* fmt, int32_t attr, int32_t newvalue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_setAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, attr, newvalue);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)attr;
    (void)newvalue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_unum_setContext(void* fmt, int32_t value, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_setContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, value, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)value;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_unum_setDoubleAttribute(void* fmt, int32_t attr, double newvalue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_setDoubleAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, attr, newvalue);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)attr;
    (void)newvalue;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_unum_setSymbol(void* fmt, int32_t symbol, void* value, int32_t length, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_setSymbol");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, symbol, value, length, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)symbol;
    (void)value;
    (void)length;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_unum_setTextAttribute(void* fmt, int32_t tag, void* newvalue, int32_t newvaluelength, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_setTextAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fmt, tag, newvalue, newvaluelength, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)fmt;
    (void)tag;
    (void)newvalue;
    (void)newvaluelength;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_unum_toPattern(void* fmt, int8_t ispatternlocalized, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int8_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unum_toPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fmt, ispatternlocalized, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fmt;
    (void)ispatternlocalized;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_unumf_close(void* uformatter) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uformatter);
        return;
    }
    errno = ENOSYS;
#else
    (void)uformatter;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_unumf_closeResult(void* uresult) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_closeResult");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uresult);
        return;
    }
    errno = ENOSYS;
#else
    (void)uresult;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_unumf_formatDecimal(void* uformatter, void* value, int32_t valuelen, void* uresult, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_formatDecimal");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uformatter, value, valuelen, uresult, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)uformatter;
    (void)value;
    (void)valuelen;
    (void)uresult;
    (void)ec;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_unumf_formatDouble(void* uformatter, double value, void* uresult, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_formatDouble");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uformatter, value, uresult, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)uformatter;
    (void)value;
    (void)uresult;
    (void)ec;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_unumf_formatInt(void* uformatter, int64_t value, void* uresult, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_formatInt");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uformatter, value, uresult, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)uformatter;
    (void)value;
    (void)uresult;
    (void)ec;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_unumf_openForSkeletonAndLocale(void* skeleton, int32_t skeletonlen, void* locale, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_openForSkeletonAndLocale");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(skeleton, skeletonlen, locale, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)skeleton;
    (void)skeletonlen;
    (void)locale;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_unumf_openForSkeletonAndLocaleWithError(void* skeleton, int32_t skeletonlen, void* locale, void* perror, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_openForSkeletonAndLocaleWithError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(skeleton, skeletonlen, locale, perror, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)skeleton;
    (void)skeletonlen;
    (void)locale;
    (void)perror;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_unumf_openResult(void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_openResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_unumf_resultAsValue(void* uresult, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_resultAsValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uresult, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uresult;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_unumf_resultGetAllFieldPositions(void* uresult, void* ufpositer, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_resultGetAllFieldPositions");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uresult, ufpositer, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)uresult;
    (void)ufpositer;
    (void)ec;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_unumf_resultNextFieldPosition(void* uresult, void* ufpos, void* ec) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_resultNextFieldPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uresult, ufpos, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uresult;
    (void)ufpos;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_unumf_resultToString(void* uresult, void* buffer, int32_t buffercapacity, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumf_resultToString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uresult, buffer, buffercapacity, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uresult;
    (void)buffer;
    (void)buffercapacity;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_unumsys_close(void* unumsys) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumsys_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(unumsys);
        return;
    }
    errno = ENOSYS;
#else
    (void)unumsys;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_unumsys_getDescription(void* unumsys, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumsys_getDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unumsys, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unumsys;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_unumsys_getName(void* unumsys) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumsys_getName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unumsys);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)unumsys;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_unumsys_getRadix(void* unumsys) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumsys_getRadix");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unumsys);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unumsys;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_unumsys_isAlgorithmic(void* unumsys) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumsys_isAlgorithmic");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unumsys);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unumsys;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_unumsys_open(void* locale, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumsys_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_unumsys_openAvailableNames(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumsys_openAvailableNames");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_unumsys_openByName(void* name, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "unumsys_openByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_uplrules_close(void* uplrules) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uplrules_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uplrules);
        return;
    }
    errno = ENOSYS;
#else
    (void)uplrules;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_uplrules_getKeywords(void* uplrules, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uplrules_getKeywords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uplrules, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uplrules;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uplrules_open(void* locale, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uplrules_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uplrules_openForType(void* locale, int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uplrules_openForType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uplrules_select(void* uplrules, double number, void* keyword, int32_t capacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uplrules_select");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uplrules, number, keyword, capacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uplrules;
    (void)number;
    (void)keyword;
    (void)capacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uplrules_selectFormatted(void* uplrules, void* number, void* keyword, int32_t capacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uplrules_selectFormatted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uplrules, number, keyword, capacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uplrules;
    (void)number;
    (void)keyword;
    (void)capacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_appendReplacement(void* regexp, void* replacementtext, int32_t replacementlength, void* destbuf, void* destcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_appendReplacement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, replacementtext, replacementlength, destbuf, destcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)replacementtext;
    (void)replacementlength;
    (void)destbuf;
    (void)destcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uregex_appendReplacementUText(void* regexp, void* replacementtext, void* dest, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_appendReplacementUText");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, replacementtext, dest, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)replacementtext;
    (void)dest;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_appendTail(void* regexp, void* destbuf, void* destcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_appendTail");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, destbuf, destcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)destbuf;
    (void)destcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uregex_appendTailUText(void* regexp, void* dest, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_appendTailUText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, dest, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)regexp;
    (void)dest;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregex_clone(void* regexp, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_uregex_close(void* regexp) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_end(void* regexp, int32_t groupnum, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_end");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, groupnum, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)groupnum;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_globalization_uregex_end64(void* regexp, int32_t groupnum, void* status) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_end64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, groupnum, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)groupnum;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_find(void* regexp, int32_t startindex, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_find");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, startindex, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)startindex;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_find64(void* regexp, int64_t startindex, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_find64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, startindex, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)startindex;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_findNext(void* regexp, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_findNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_flags(void* regexp, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_flags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uregex_getFindProgressCallback(void* regexp, void* callback, void* context, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_getFindProgressCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, callback, context, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)callback;
    (void)context;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_getMatchCallback(void* regexp, void* callback, void* context, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_getMatchCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, callback, context, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)callback;
    (void)context;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_getStackLimit(void* regexp, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_getStackLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uregex_getText(void* regexp, void* textlength, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_getText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, textlength, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)regexp;
    (void)textlength;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_getTimeLimit(void* regexp, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_getTimeLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uregex_getUText(void* regexp, void* dest, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_getUText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, dest, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)regexp;
    (void)dest;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_group(void* regexp, int32_t groupnum, void* dest, int32_t destcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_group");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, groupnum, dest, destcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)groupnum;
    (void)dest;
    (void)destcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_groupCount(void* regexp, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_groupCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_groupNumberFromCName(void* regexp, void* groupname, int32_t namelength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_groupNumberFromCName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, groupname, namelength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)groupname;
    (void)namelength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_groupNumberFromName(void* regexp, void* groupname, int32_t namelength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_groupNumberFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, groupname, namelength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)groupname;
    (void)namelength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uregex_groupUText(void* regexp, int32_t groupnum, void* dest, void* grouplength, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_groupUText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, groupnum, dest, grouplength, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)regexp;
    (void)groupnum;
    (void)dest;
    (void)grouplength;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_hasAnchoringBounds(void* regexp, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_hasAnchoringBounds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_hasTransparentBounds(void* regexp, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_hasTransparentBounds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_hitEnd(void* regexp, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_hitEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_lookingAt(void* regexp, int32_t startindex, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_lookingAt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, startindex, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)startindex;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_lookingAt64(void* regexp, int64_t startindex, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_lookingAt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, startindex, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)startindex;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_matches(void* regexp, int32_t startindex, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_matches");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, startindex, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)startindex;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_matches64(void* regexp, int64_t startindex, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_matches64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, startindex, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)startindex;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uregex_open(void* pattern, int32_t patternlength, uint32_t flags, void* pe, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, patternlength, flags, pe, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pattern;
    (void)patternlength;
    (void)flags;
    (void)pe;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregex_openC(void* pattern, uint32_t flags, void* pe, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_openC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, flags, pe, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pattern;
    (void)flags;
    (void)pe;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregex_openUText(void* pattern, uint32_t flags, void* pe, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_openUText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, flags, pe, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pattern;
    (void)flags;
    (void)pe;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregex_pattern(void* regexp, void* patlength, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_pattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, patlength, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)regexp;
    (void)patlength;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregex_patternUText(void* regexp, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_patternUText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_uregex_refreshUText(void* regexp, void* text, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_refreshUText");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, text, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)text;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_regionEnd(void* regexp, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_regionEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_globalization_uregex_regionEnd64(void* regexp, void* status) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_regionEnd64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_regionStart(void* regexp, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_regionStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_globalization_uregex_regionStart64(void* regexp, void* status) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_regionStart64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_replaceAll(void* regexp, void* replacementtext, int32_t replacementlength, void* destbuf, int32_t destcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_replaceAll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, replacementtext, replacementlength, destbuf, destcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)replacementtext;
    (void)replacementlength;
    (void)destbuf;
    (void)destcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uregex_replaceAllUText(void* regexp, void* replacement, void* dest, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_replaceAllUText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, replacement, dest, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)regexp;
    (void)replacement;
    (void)dest;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_replaceFirst(void* regexp, void* replacementtext, int32_t replacementlength, void* destbuf, int32_t destcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_replaceFirst");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, replacementtext, replacementlength, destbuf, destcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)replacementtext;
    (void)replacementlength;
    (void)destbuf;
    (void)destcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uregex_replaceFirstUText(void* regexp, void* replacement, void* dest, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_replaceFirstUText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, replacement, dest, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)regexp;
    (void)replacement;
    (void)dest;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int8_t windowssys_windows_win32_globalization_uregex_requireEnd(void* regexp, void* status) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_requireEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uregex_reset(void* regexp, int32_t arg_1_index, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_reset");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, arg_1_index, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)arg_1_index;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_reset64(void* regexp, int64_t arg_1_index, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_reset64");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, arg_1_index, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)arg_1_index;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_setFindProgressCallback(void* regexp, void* callback, void* context, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_setFindProgressCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, callback, context, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)callback;
    (void)context;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_setMatchCallback(void* regexp, void* callback, void* context, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_setMatchCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, callback, context, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)callback;
    (void)context;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_setRegion(void* regexp, int32_t regionstart, int32_t regionlimit, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_setRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, regionstart, regionlimit, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)regionstart;
    (void)regionlimit;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_setRegion64(void* regexp, int64_t regionstart, int64_t regionlimit, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_setRegion64");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, regionstart, regionlimit, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)regionstart;
    (void)regionlimit;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_setRegionAndStart(void* regexp, int64_t regionstart, int64_t regionlimit, int64_t startindex, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_setRegionAndStart");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, regionstart, regionlimit, startindex, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)regionstart;
    (void)regionlimit;
    (void)startindex;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_setStackLimit(void* regexp, int32_t limit, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_setStackLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, limit, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)limit;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_setText(void* regexp, void* text, int32_t textlength, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_setText");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, text, textlength, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)text;
    (void)textlength;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_setTimeLimit(void* regexp, int32_t limit, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_setTimeLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, limit, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)limit;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_setUText(void* regexp, void* text, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_setUText");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, text, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)text;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_split(void* regexp, void* destbuf, int32_t destcapacity, void* requiredcapacity, void* destfields, int32_t destfieldscapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_split");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, destbuf, destcapacity, requiredcapacity, destfields, destfieldscapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)destbuf;
    (void)destcapacity;
    (void)requiredcapacity;
    (void)destfields;
    (void)destfieldscapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_splitUText(void* regexp, void* destfields, int32_t destfieldscapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_splitUText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, destfields, destfieldscapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)destfields;
    (void)destfieldscapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uregex_start(void* regexp, int32_t groupnum, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_start");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, groupnum, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)groupnum;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_globalization_uregex_start64(void* regexp, int32_t groupnum, void* status) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_start64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regexp, groupnum, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)regexp;
    (void)groupnum;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uregex_useAnchoringBounds(void* regexp, int8_t b, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_useAnchoringBounds");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, b, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)b;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uregex_useTransparentBounds(void* regexp, int8_t b, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregex_useTransparentBounds");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(regexp, b, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)regexp;
    (void)b;
    (void)status;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_uregion_areEqual(void* uregion, void* otherregion) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_areEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uregion, otherregion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uregion;
    (void)otherregion;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uregion_contains(void* uregion, void* otherregion) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_contains");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uregion, otherregion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uregion;
    (void)otherregion;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uregion_getAvailable(int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregion_getContainedRegions(void* uregion, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getContainedRegions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uregion, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uregion;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregion_getContainedRegionsOfType(void* uregion, int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getContainedRegionsOfType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uregion, type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uregion;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregion_getContainingRegion(void* uregion) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getContainingRegion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uregion);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uregion;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregion_getContainingRegionOfType(void* uregion, int32_t type) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getContainingRegionOfType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uregion, type);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uregion;
    (void)type;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uregion_getNumericCode(void* uregion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getNumericCode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uregion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uregion;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uregion_getPreferredValues(void* uregion, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getPreferredValues");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uregion, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uregion;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregion_getRegionCode(void* uregion) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getRegionCode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uregion);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)uregion;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregion_getRegionFromCode(void* regioncode, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getRegionFromCode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(regioncode, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)regioncode;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uregion_getRegionFromNumericCode(int32_t code, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getRegionFromNumericCode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(code, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)code;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uregion_getType(void* uregion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uregion_getType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uregion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uregion;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ureldatefmt_close(void* reldatefmt) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ureldatefmt_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(reldatefmt);
        return;
    }
    errno = ENOSYS;
#else
    (void)reldatefmt;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ureldatefmt_closeResult(void* ufrdt) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ureldatefmt_closeResult");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ufrdt);
        return;
    }
    errno = ENOSYS;
#else
    (void)ufrdt;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_ureldatefmt_combineDateAndTime(void* reldatefmt, void* relativedatestring, int32_t relativedatestringlen, void* timestring, int32_t timestringlen, void* result, int32_t resultcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ureldatefmt_combineDateAndTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reldatefmt, relativedatestring, relativedatestringlen, timestring, timestringlen, result, resultcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reldatefmt;
    (void)relativedatestring;
    (void)relativedatestringlen;
    (void)timestring;
    (void)timestringlen;
    (void)result;
    (void)resultcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ureldatefmt_format(void* reldatefmt, double offset, int32_t unit, void* result, int32_t resultcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ureldatefmt_format");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reldatefmt, offset, unit, result, resultcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reldatefmt;
    (void)offset;
    (void)unit;
    (void)result;
    (void)resultcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_ureldatefmt_formatNumeric(void* reldatefmt, double offset, int32_t unit, void* result, int32_t resultcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ureldatefmt_formatNumeric");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reldatefmt, offset, unit, result, resultcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reldatefmt;
    (void)offset;
    (void)unit;
    (void)result;
    (void)resultcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_ureldatefmt_formatNumericToResult(void* reldatefmt, double offset, int32_t unit, void* result, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ureldatefmt_formatNumericToResult");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(reldatefmt, offset, unit, result, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)reldatefmt;
    (void)offset;
    (void)unit;
    (void)result;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_ureldatefmt_formatToResult(void* reldatefmt, double offset, int32_t unit, void* result, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, double, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ureldatefmt_formatToResult");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(reldatefmt, offset, unit, result, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)reldatefmt;
    (void)offset;
    (void)unit;
    (void)result;
    (void)status;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ureldatefmt_open(void* locale, void* nftoadopt, int32_t width, int32_t capitalizationcontext, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ureldatefmt_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(locale, nftoadopt, width, capitalizationcontext, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)locale;
    (void)nftoadopt;
    (void)width;
    (void)capitalizationcontext;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ureldatefmt_openResult(void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ureldatefmt_openResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ureldatefmt_resultAsValue(void* ufrdt, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icu.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ureldatefmt_resultAsValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ufrdt, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ufrdt;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ures_close(void* resourcebundle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resourcebundle);
        return;
    }
    errno = ENOSYS;
#else
    (void)resourcebundle;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_ures_getBinary(void* resourcebundle, void* len, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getBinary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, len, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resourcebundle;
    (void)len;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_getByIndex(void* resourcebundle, int32_t indexr, void* fillin, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getByIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, indexr, fillin, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resourcebundle;
    (void)indexr;
    (void)fillin;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_getByKey(void* resourcebundle, void* key, void* fillin, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getByKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, key, fillin, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resourcebundle;
    (void)key;
    (void)fillin;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ures_getInt(void* resourcebundle, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcebundle;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ures_getIntVector(void* resourcebundle, void* len, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getIntVector");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, len, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resourcebundle;
    (void)len;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_getKey(void* resourcebundle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resourcebundle;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_getLocaleByType(void* resourcebundle, int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getLocaleByType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resourcebundle;
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_getNextResource(void* resourcebundle, void* fillin, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getNextResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, fillin, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resourcebundle;
    (void)fillin;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_getNextString(void* resourcebundle, void* len, void* key, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getNextString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, len, key, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resourcebundle;
    (void)len;
    (void)key;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ures_getSize(void* resourcebundle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcebundle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ures_getString(void* resourcebundle, void* len, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, len, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resourcebundle;
    (void)len;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_getStringByIndex(void* resourcebundle, int32_t indexs, void* len, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getStringByIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, indexs, len, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resourcebundle;
    (void)indexs;
    (void)len;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_getStringByKey(void* resb, void* key, void* len, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getStringByKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resb, key, len, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resb;
    (void)key;
    (void)len;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_ures_getType(void* resourcebundle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcebundle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_globalization_ures_getUInt(void* resourcebundle, void* status) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getUInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle, status);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)resourcebundle;
    (void)status;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_globalization_ures_getUTF8String(void* resb, void* dest, void* length, int8_t forcecopy, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getUTF8String");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resb, dest, length, forcecopy, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resb;
    (void)dest;
    (void)length;
    (void)forcecopy;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_getUTF8StringByIndex(void* resb, int32_t stringindex, void* dest, void* plength, int8_t forcecopy, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getUTF8StringByIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resb, stringindex, dest, plength, forcecopy, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resb;
    (void)stringindex;
    (void)dest;
    (void)plength;
    (void)forcecopy;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_getUTF8StringByKey(void* resb, void* key, void* dest, void* plength, int8_t forcecopy, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getUTF8StringByKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resb, key, dest, plength, forcecopy, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)resb;
    (void)key;
    (void)dest;
    (void)plength;
    (void)forcecopy;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ures_getVersion(void* resb, void* versioninfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_getVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resb, versioninfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)resb;
    (void)versioninfo;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_ures_hasNext(void* resourcebundle) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_hasNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcebundle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcebundle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_ures_open(void* packagename, void* locale, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagename, locale, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)packagename;
    (void)locale;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_openAvailableLocales(void* packagename, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_openAvailableLocales");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagename, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)packagename;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_openDirect(void* packagename, void* locale, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_openDirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagename, locale, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)packagename;
    (void)locale;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_ures_openU(void* packagename, void* locale, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_openU");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagename, locale, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)packagename;
    (void)locale;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_ures_resetIterator(void* resourcebundle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ures_resetIterator");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resourcebundle);
        return;
    }
    errno = ENOSYS;
#else
    (void)resourcebundle;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_uscript_breaksBetweenLetters(int32_t script) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_breaksBetweenLetters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(script);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)script;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uscript_getCode(void* nameorabbrorlocale, void* fillin, int32_t capacity, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_getCode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nameorabbrorlocale, fillin, capacity, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nameorabbrorlocale;
    (void)fillin;
    (void)capacity;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uscript_getName(int32_t scriptcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_getName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scriptcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)scriptcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uscript_getSampleString(int32_t script, void* dest, int32_t capacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_getSampleString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(script, dest, capacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)script;
    (void)dest;
    (void)capacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uscript_getScript(int32_t codepoint, void* err) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_getScript");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepoint, err);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)codepoint;
    (void)err;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uscript_getScriptExtensions(int32_t c, void* scripts, int32_t capacity, void* errorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_getScriptExtensions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c, scripts, capacity, errorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    (void)scripts;
    (void)capacity;
    (void)errorcode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uscript_getShortName(int32_t scriptcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_getShortName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(scriptcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)scriptcode;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uscript_getUsage(int32_t script) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_getUsage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(script);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)script;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uscript_hasScript(int32_t c, int32_t sc) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_hasScript");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(c, sc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)c;
    (void)sc;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uscript_isCased(int32_t script) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_isCased");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(script);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)script;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uscript_isRightToLeft(int32_t script) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uscript_isRightToLeft");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(script);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)script;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_usearch_close(void* searchiter) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(searchiter);
        return;
    }
    errno = ENOSYS;
#else
    (void)searchiter;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_first(void* strsrch, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_first");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_following(void* strsrch, int32_t position, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_following");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch, position, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    (void)position;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_getAttribute(void* strsrch, int32_t attribute) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_getAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch, attribute);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    (void)attribute;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_usearch_getBreakIterator(void* strsrch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_getBreakIterator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)strsrch;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_usearch_getCollator(void* strsrch) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_getCollator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)strsrch;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_getMatchedLength(void* strsrch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_getMatchedLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_getMatchedStart(void* strsrch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_getMatchedStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_getMatchedText(void* strsrch, void* result, int32_t resultcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_getMatchedText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch, result, resultcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    (void)result;
    (void)resultcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_getOffset(void* strsrch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_getOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_usearch_getPattern(void* strsrch, void* length) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_getPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch, length);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)strsrch;
    (void)length;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_usearch_getText(void* strsrch, void* length) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_getText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch, length);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)strsrch;
    (void)length;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_last(void* strsrch, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_last");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_next(void* strsrch, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_next");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_usearch_open(void* pattern, int32_t patternlength, void* text, int32_t textlength, void* locale, void* breakiter, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, patternlength, text, textlength, locale, breakiter, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pattern;
    (void)patternlength;
    (void)text;
    (void)textlength;
    (void)locale;
    (void)breakiter;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_usearch_openFromCollator(void* pattern, int32_t patternlength, void* text, int32_t textlength, void* collator, void* breakiter, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_openFromCollator");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, patternlength, text, textlength, collator, breakiter, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pattern;
    (void)patternlength;
    (void)text;
    (void)textlength;
    (void)collator;
    (void)breakiter;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_preceding(void* strsrch, int32_t position, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_preceding");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch, position, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    (void)position;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_usearch_previous(void* strsrch, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_previous");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(strsrch, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)strsrch;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_usearch_reset(void* strsrch) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_reset");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(strsrch);
        return;
    }
    errno = ENOSYS;
#else
    (void)strsrch;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_usearch_setAttribute(void* strsrch, int32_t attribute, int32_t value, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_setAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(strsrch, attribute, value, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)strsrch;
    (void)attribute;
    (void)value;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_usearch_setBreakIterator(void* strsrch, void* breakiter, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_setBreakIterator");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(strsrch, breakiter, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)strsrch;
    (void)breakiter;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_usearch_setCollator(void* strsrch, void* collator, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_setCollator");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(strsrch, collator, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)strsrch;
    (void)collator;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_usearch_setOffset(void* strsrch, int32_t position, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_setOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(strsrch, position, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)strsrch;
    (void)position;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_usearch_setPattern(void* strsrch, void* pattern, int32_t patternlength, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_setPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(strsrch, pattern, patternlength, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)strsrch;
    (void)pattern;
    (void)patternlength;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_usearch_setText(void* strsrch, void* text, int32_t textlength, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usearch_setText");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(strsrch, text, textlength, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)strsrch;
    (void)text;
    (void)textlength;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_add(void* set, int32_t c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_add");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, c);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_addAll(void* set, void* additionalset) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_addAll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, additionalset);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)additionalset;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_addAllCodePoints(void* set, void* str, int32_t strlen) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_addAllCodePoints");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, str, strlen);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)str;
    (void)strlen;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_addRange(void* set, int32_t start, int32_t end) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_addRange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, start, end);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)start;
    (void)end;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_addString(void* set, void* str, int32_t strlen) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_addString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, str, strlen);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)str;
    (void)strlen;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_applyIntPropertyValue(void* set, int32_t prop, int32_t value, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_applyIntPropertyValue");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, prop, value, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)prop;
    (void)value;
    (void)ec;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_applyPattern(void* set, void* pattern, int32_t patternlength, uint32_t options, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_applyPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, pattern, patternlength, options, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)pattern;
    (void)patternlength;
    (void)options;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uset_applyPropertyAlias(void* set, void* prop, int32_t proplength, void* value, int32_t valuelength, void* ec) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_applyPropertyAlias");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, prop, proplength, value, valuelength, ec);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)prop;
    (void)proplength;
    (void)value;
    (void)valuelength;
    (void)ec;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_charAt(void* set, int32_t charindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_charAt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, charindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)charindex;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uset_clear(void* set) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_clear");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_uset_clone(void* set) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)set;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uset_cloneAsThawed(void* set) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_cloneAsThawed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)set;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_uset_close(void* set) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_closeOver(void* set, int32_t attributes) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_closeOver");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, attributes);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)attributes;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_compact(void* set) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_compact");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_complement(void* set) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_complement");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_complementAll(void* set, void* complement) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_complementAll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, complement);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)complement;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_contains(void* set, int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_contains");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_containsAll(void* set1, void* set2) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_containsAll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set1, set2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set1;
    (void)set2;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_containsAllCodePoints(void* set, void* str, int32_t strlen) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_containsAllCodePoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, str, strlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)str;
    (void)strlen;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_containsNone(void* set1, void* set2) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_containsNone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set1, set2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set1;
    (void)set2;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_containsRange(void* set, int32_t start, int32_t end) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_containsRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, start, end);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)start;
    (void)end;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_containsSome(void* set1, void* set2) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_containsSome");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set1, set2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set1;
    (void)set2;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_containsString(void* set, void* str, int32_t strlen) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_containsString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, str, strlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)str;
    (void)strlen;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_equals(void* set1, void* set2) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_equals");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set1, set2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set1;
    (void)set2;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uset_freeze(void* set) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_freeze");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_getItem(void* set, int32_t itemindex, void* start, void* end, void* str, int32_t strcapacity, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_getItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, itemindex, start, end, str, strcapacity, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)itemindex;
    (void)start;
    (void)end;
    (void)str;
    (void)strcapacity;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_getItemCount(void* set) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_getItemCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_getSerializedRange(void* set, int32_t rangeindex, void* pstart, void* pend) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_getSerializedRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, rangeindex, pstart, pend);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)rangeindex;
    (void)pstart;
    (void)pend;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_getSerializedRangeCount(void* set) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_getSerializedRangeCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_getSerializedSet(void* fillset, void* src, int32_t srclength) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_getSerializedSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fillset, src, srclength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fillset;
    (void)src;
    (void)srclength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_indexOf(void* set, int32_t c) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_indexOf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_isEmpty(void* set) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_isEmpty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_isFrozen(void* set) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_isFrozen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uset_open(int32_t start, int32_t end) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(start, end);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)start;
    (void)end;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uset_openEmpty(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_openEmpty");
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

void* windowssys_windows_win32_globalization_uset_openPattern(void* pattern, int32_t patternlength, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_openPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, patternlength, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pattern;
    (void)patternlength;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uset_openPatternOptions(void* pattern, int32_t patternlength, uint32_t options, void* ec) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_openPatternOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, patternlength, options, ec);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pattern;
    (void)patternlength;
    (void)options;
    (void)ec;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_uset_remove(void* set, int32_t c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_remove");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, c);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)c;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_removeAll(void* set, void* removeset) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_removeAll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, removeset);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)removeset;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_removeAllStrings(void* set) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_removeAllStrings");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_removeRange(void* set, int32_t start, int32_t end) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_removeRange");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, start, end);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)start;
    (void)end;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_removeString(void* set, void* str, int32_t strlen) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_removeString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, str, strlen);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)str;
    (void)strlen;
    errno = ENOSYS;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_resemblesPattern(void* pattern, int32_t patternlength, int32_t pos) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_resemblesPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pattern, patternlength, pos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pattern;
    (void)patternlength;
    (void)pos;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uset_retain(void* set, int32_t start, int32_t end) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_retain");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, start, end);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)start;
    (void)end;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_retainAll(void* set, void* retain) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_retainAll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, retain);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)retain;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_serialize(void* set, void* dest, int32_t destcapacity, void* perrorcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_serialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, dest, destcapacity, perrorcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)dest;
    (void)destcapacity;
    (void)perrorcode;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_uset_serializedContains(void* set, int32_t c) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_serializedContains");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, c);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)c;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uset_set(void* set, int32_t start, int32_t end) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_set");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(set, start, end);
        return;
    }
    errno = ENOSYS;
#else
    (void)set;
    (void)start;
    (void)end;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uset_setSerializedToOne(void* fillset, int32_t c) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_setSerializedToOne");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(fillset, c);
        return;
    }
    errno = ENOSYS;
#else
    (void)fillset;
    (void)c;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_size(void* set) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_size");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_span(void* set, void* s, int32_t length, int32_t spancondition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_span");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, s, length, spancondition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)s;
    (void)length;
    (void)spancondition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_spanBack(void* set, void* s, int32_t length, int32_t spancondition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_spanBack");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, s, length, spancondition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)s;
    (void)length;
    (void)spancondition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_spanBackUTF8(void* set, void* s, int32_t length, int32_t spancondition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_spanBackUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, s, length, spancondition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)s;
    (void)length;
    (void)spancondition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_spanUTF8(void* set, void* s, int32_t length, int32_t spancondition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_spanUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, s, length, spancondition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)s;
    (void)length;
    (void)spancondition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uset_toPattern(void* set, void* result, int32_t resultcapacity, int8_t escapeunprintable, void* ec) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uset_toPattern");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(set, result, resultcapacity, escapeunprintable, ec);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)set;
    (void)result;
    (void)resultcapacity;
    (void)escapeunprintable;
    (void)ec;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_areConfusable(void* sc, void* id1, int32_t length1, void* id2, int32_t length2, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_areConfusable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, id1, length1, id2, length2, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    (void)id1;
    (void)length1;
    (void)id2;
    (void)length2;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_areConfusableUTF8(void* sc, void* id1, int32_t length1, void* id2, int32_t length2, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_areConfusableUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, id1, length1, id2, length2, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    (void)id1;
    (void)length1;
    (void)id2;
    (void)length2;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_check(void* sc, void* id, int32_t length, void* position, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_check");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, id, length, position, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    (void)id;
    (void)length;
    (void)position;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_check2(void* sc, void* id, int32_t length, void* checkresult, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_check2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, id, length, checkresult, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    (void)id;
    (void)length;
    (void)checkresult;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_check2UTF8(void* sc, void* id, int32_t length, void* checkresult, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_check2UTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, id, length, checkresult, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    (void)id;
    (void)length;
    (void)checkresult;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_checkUTF8(void* sc, void* id, int32_t length, void* position, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_checkUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, id, length, position, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    (void)id;
    (void)length;
    (void)position;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uspoof_clone(void* sc, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sc;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_uspoof_close(void* sc) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sc);
        return;
    }
    errno = ENOSYS;
#else
    (void)sc;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uspoof_closeCheckResult(void* checkresult) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_closeCheckResult");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(checkresult);
        return;
    }
    errno = ENOSYS;
#else
    (void)checkresult;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_uspoof_getAllowedChars(void* sc, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getAllowedChars");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sc;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uspoof_getAllowedLocales(void* sc, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getAllowedLocales");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)sc;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_getCheckResultChecks(void* checkresult, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getCheckResultChecks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(checkresult, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)checkresult;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uspoof_getCheckResultNumerics(void* checkresult, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getCheckResultNumerics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(checkresult, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)checkresult;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_getCheckResultRestrictionLevel(void* checkresult, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getCheckResultRestrictionLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(checkresult, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)checkresult;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_getChecks(void* sc, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getChecks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uspoof_getInclusionSet(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getInclusionSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uspoof_getRecommendedSet(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getRecommendedSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_getRestrictionLevel(void* sc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getRestrictionLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_getSkeleton(void* sc, uint32_t type, void* id, int32_t length, void* dest, int32_t destcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getSkeleton");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, type, id, length, dest, destcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    (void)type;
    (void)id;
    (void)length;
    (void)dest;
    (void)destcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_getSkeletonUTF8(void* sc, uint32_t type, void* id, int32_t length, void* dest, int32_t destcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_getSkeletonUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, type, id, length, dest, destcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    (void)type;
    (void)id;
    (void)length;
    (void)dest;
    (void)destcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_uspoof_open(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uspoof_openCheckResult(void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_openCheckResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uspoof_openFromSerialized(void* data, int32_t length, void* pactuallength, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_openFromSerialized");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data, length, pactuallength, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)data;
    (void)length;
    (void)pactuallength;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_uspoof_openFromSource(void* confusables, int32_t confusableslen, void* confusableswholescript, int32_t confusableswholescriptlen, void* errtype, void* pe, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_openFromSource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(confusables, confusableslen, confusableswholescript, confusableswholescriptlen, errtype, pe, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)confusables;
    (void)confusableslen;
    (void)confusableswholescript;
    (void)confusableswholescriptlen;
    (void)errtype;
    (void)pe;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_uspoof_serialize(void* sc, void* data, int32_t capacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_serialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sc, data, capacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sc;
    (void)data;
    (void)capacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_uspoof_setAllowedChars(void* sc, void* chars, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_setAllowedChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sc, chars, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)sc;
    (void)chars;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uspoof_setAllowedLocales(void* sc, void* localeslist, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_setAllowedLocales");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sc, localeslist, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)sc;
    (void)localeslist;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uspoof_setChecks(void* sc, int32_t checks, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_setChecks");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sc, checks, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)sc;
    (void)checks;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_uspoof_setRestrictionLevel(void* sc, int32_t restrictionlevel) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "uspoof_setRestrictionLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(sc, restrictionlevel);
        return;
    }
    errno = ENOSYS;
#else
    (void)sc;
    (void)restrictionlevel;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_usprep_close(void* profile) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usprep_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(profile);
        return;
    }
    errno = ENOSYS;
#else
    (void)profile;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_usprep_open(void* path, void* filename, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usprep_open");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(path, filename, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)path;
    (void)filename;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_usprep_openByType(int32_t type, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usprep_openByType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)type;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_usprep_prepare(void* prep, void* src, int32_t srclength, void* dest, int32_t destcapacity, int32_t options, void* parseerror, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "usprep_prepare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prep, src, srclength, dest, destcapacity, options, parseerror, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prep;
    (void)src;
    (void)srclength;
    (void)dest;
    (void)destcapacity;
    (void)options;
    (void)parseerror;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_utext_char32At(void* ut, int64_t nativeindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_char32At");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut, nativeindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    (void)nativeindex;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_utext_clone(void* dest, void* src, int8_t deep, int8_t readonly, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int8_t, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dest, src, deep, readonly, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dest;
    (void)src;
    (void)deep;
    (void)readonly;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_utext_close(void* ut) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_close");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ut;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_utext_copy(void* ut, int64_t nativestart, int64_t nativelimit, int64_t destindex, int8_t move, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_copy");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ut, nativestart, nativelimit, destindex, move, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)ut;
    (void)nativestart;
    (void)nativelimit;
    (void)destindex;
    (void)move;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_utext_current32(void* ut) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_current32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_utext_equals(void* a, void* b) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_equals");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(a, b);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)a;
    (void)b;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_utext_extract(void* ut, int64_t nativestart, int64_t nativelimit, void* dest, int32_t destcapacity, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_extract");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut, nativestart, nativelimit, dest, destcapacity, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    (void)nativestart;
    (void)nativelimit;
    (void)dest;
    (void)destcapacity;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_utext_freeze(void* ut) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_freeze");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ut);
        return;
    }
    errno = ENOSYS;
#else
    (void)ut;
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_globalization_utext_getNativeIndex(void* ut) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_getNativeIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_globalization_utext_getPreviousNativeIndex(void* ut) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_getPreviousNativeIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_utext_hasMetaData(void* ut) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_hasMetaData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_utext_isLengthExpensive(void* ut) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_isLengthExpensive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_utext_isWritable(void* ut) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_isWritable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    errno = ENOSYS;
    return -1;
#endif
}

int8_t windowssys_windows_win32_globalization_utext_moveIndex32(void* ut, int32_t delta) {
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_moveIndex32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut, delta);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    (void)delta;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_globalization_utext_nativeLength(void* ut) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_nativeLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_utext_next32(void* ut) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_next32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_utext_next32From(void* ut, int64_t nativeindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_next32From");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut, nativeindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    (void)nativeindex;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_utext_openUChars(void* ut, void* s, int64_t length, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_openUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut, s, length, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ut;
    (void)s;
    (void)length;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_utext_openUTF8(void* ut, void* s, int64_t length, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_openUTF8");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut, s, length, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ut;
    (void)s;
    (void)length;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_utext_previous32(void* ut) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_previous32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_utext_previous32From(void* ut, int64_t nativeindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_previous32From");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut, nativeindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    (void)nativeindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_utext_replace(void* ut, int64_t nativestart, int64_t nativelimit, void* replacementtext, int32_t replacementlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_replace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut, nativestart, nativelimit, replacementtext, replacementlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ut;
    (void)nativestart;
    (void)nativelimit;
    (void)replacementtext;
    (void)replacementlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_utext_setNativeIndex(void* ut, int64_t nativeindex) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_setNativeIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ut, nativeindex);
        return;
    }
    errno = ENOSYS;
#else
    (void)ut;
    (void)nativeindex;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_globalization_utext_setup(void* ut, int32_t extraspace, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utext_setup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ut, extraspace, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ut;
    (void)extraspace;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_globalization_utf8_appendCharSafeBody(void* s, int32_t i, int32_t length, int32_t c, void* piserror) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utf8_appendCharSafeBody");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, i, length, c, piserror);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)i;
    (void)length;
    (void)c;
    (void)piserror;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_utf8_back1SafeBody(void* s, int32_t start, int32_t i) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utf8_back1SafeBody");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, start, i);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)start;
    (void)i;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_utf8_nextCharSafeBody(void* s, void* pi, int32_t length, int32_t c, int8_t strict) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utf8_nextCharSafeBody");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, pi, length, c, strict);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)pi;
    (void)length;
    (void)c;
    (void)strict;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_globalization_utf8_prevCharSafeBody(void* s, int32_t start, void* pi, int32_t c, int8_t strict) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utf8_prevCharSafeBody");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(s, start, pi, c, strict);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)s;
    (void)start;
    (void)pi;
    (void)c;
    (void)strict;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_globalization_utmscale_fromInt64(int64_t othertime, int32_t timescale, void* status) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utmscale_fromInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(othertime, timescale, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)othertime;
    (void)timescale;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_globalization_utmscale_getTimeScaleValue(int32_t timescale, int32_t value, void* status) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utmscale_getTimeScaleValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timescale, value, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timescale;
    (void)value;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_globalization_utmscale_toInt64(int64_t universaltime, int32_t timescale, void* status) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utmscale_toInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(universaltime, timescale, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)universaltime;
    (void)timescale;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_utrace_functionName(int32_t fnnumber) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrace_functionName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fnnumber);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)fnnumber;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_utrace_getFunctions(void* context, void* e, void* x, void* d) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrace_getFunctions");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, e, x, d);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)e;
    (void)x;
    (void)d;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_utrace_getLevel(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrace_getLevel");
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

void windowssys_windows_win32_globalization_utrace_setFunctions(void* context, void* e, void* x, void* d) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrace_setFunctions");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context, e, x, d);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    (void)e;
    (void)x;
    (void)d;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_utrace_setLevel(int32_t tracelevel) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrace_setLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(tracelevel);
        return;
    }
    errno = ENOSYS;
#else
    (void)tracelevel;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_utrace_vformat(void* outbuf, int32_t capacity, int32_t indent, void* fmt, void* args) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuuc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrace_vformat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(outbuf, capacity, indent, fmt, args);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)outbuf;
    (void)capacity;
    (void)indent;
    (void)fmt;
    (void)args;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_globalization_utrans_clone(void* trans, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trans, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)trans;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_utrans_close(void* trans) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_close");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(trans);
        return;
    }
    errno = ENOSYS;
#else
    (void)trans;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_utrans_countAvailableIDs(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_countAvailableIDs");
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

void* windowssys_windows_win32_globalization_utrans_getSourceSet(void* trans, int8_t ignorefilter, void* fillin, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_getSourceSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trans, ignorefilter, fillin, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)trans;
    (void)ignorefilter;
    (void)fillin;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_utrans_getUnicodeID(void* trans, void* resultlength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_getUnicodeID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trans, resultlength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)trans;
    (void)resultlength;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_utrans_openIDs(void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_openIDs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_utrans_openInverse(void* trans, void* status) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_openInverse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trans, status);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)trans;
    (void)status;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_globalization_utrans_openU(void* id, int32_t idlength, int32_t dir, void* rules, int32_t ruleslength, void* parseerror, void* perrorcode) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_openU");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, idlength, dir, rules, ruleslength, parseerror, perrorcode);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)id;
    (void)idlength;
    (void)dir;
    (void)rules;
    (void)ruleslength;
    (void)parseerror;
    (void)perrorcode;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_globalization_utrans_register(void* adoptedtrans, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_register");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(adoptedtrans, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)adoptedtrans;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_utrans_setFilter(void* trans, void* filterpattern, int32_t filterpatternlen, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_setFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(trans, filterpattern, filterpatternlen, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)trans;
    (void)filterpattern;
    (void)filterpatternlen;
    (void)status;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_globalization_utrans_toRules(void* trans, int8_t escapeunprintable, void* result, int32_t resultlength, void* status) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int8_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_toRules");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(trans, escapeunprintable, result, resultlength, status);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)trans;
    (void)escapeunprintable;
    (void)result;
    (void)resultlength;
    (void)status;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_globalization_utrans_trans(void* trans, void* rep, void* repfunc, int32_t start, void* limit, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_trans");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(trans, rep, repfunc, start, limit, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)trans;
    (void)rep;
    (void)repfunc;
    (void)start;
    (void)limit;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_utrans_transIncremental(void* trans, void* rep, void* repfunc, void* pos, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_transIncremental");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(trans, rep, repfunc, pos, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)trans;
    (void)rep;
    (void)repfunc;
    (void)pos;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_utrans_transIncrementalUChars(void* trans, void* text, void* textlength, int32_t textcapacity, void* pos, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_transIncrementalUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(trans, text, textlength, textcapacity, pos, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)trans;
    (void)text;
    (void)textlength;
    (void)textcapacity;
    (void)pos;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_utrans_transUChars(void* trans, void* text, void* textlength, int32_t textcapacity, int32_t start, void* limit, void* status) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_transUChars");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(trans, text, textlength, textcapacity, start, limit, status);
        return;
    }
    errno = ENOSYS;
#else
    (void)trans;
    (void)text;
    (void)textlength;
    (void)textcapacity;
    (void)start;
    (void)limit;
    (void)status;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_globalization_utrans_unregisterID(void* id, int32_t idlength) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("icuin.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "utrans_unregisterID");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(id, idlength);
        return;
    }
    errno = ENOSYS;
#else
    (void)id;
    (void)idlength;
    errno = ENOSYS;
#endif
}

