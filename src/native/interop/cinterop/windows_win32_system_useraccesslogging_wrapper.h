#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_USERACCESSLOGGING_WINDOWS_WIN32_SYSTEM_USERACCESSLOGGING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_USERACCESSLOGGING_WINDOWS_WIN32_SYSTEM_USERACCESSLOGGING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_useraccesslogging_UalInstrument(void* data);
int32_t windowssys_windows_win32_system_useraccesslogging_UalRegisterProduct(void* wszproductname, void* wszrolename, void* wszguid);
int32_t windowssys_windows_win32_system_useraccesslogging_UalStart(void* data);
int32_t windowssys_windows_win32_system_useraccesslogging_UalStop(void* data);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_USERACCESSLOGGING_WINDOWS_WIN32_SYSTEM_USERACCESSLOGGING_WRAPPER_H */
