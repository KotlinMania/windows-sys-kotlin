#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_serialcommunication_comDBClaimNextFreePort(void* hcomdb, void* comnumber);
int32_t windowssys_windows_win32_devices_serialcommunication_comDBClaimPort(void* hcomdb, uint32_t comnumber, int32_t forceclaim, void* forced);
int32_t windowssys_windows_win32_devices_serialcommunication_comDBClose(void* hcomdb);
int32_t windowssys_windows_win32_devices_serialcommunication_comDBGetCurrentPortUsage(void* hcomdb, void* buffer, uint32_t buffersize, uint32_t reporttype, void* maxportsreported);
int32_t windowssys_windows_win32_devices_serialcommunication_comDBOpen(void* phcomdb);
int32_t windowssys_windows_win32_devices_serialcommunication_comDBReleasePort(void* hcomdb, uint32_t comnumber);
int32_t windowssys_windows_win32_devices_serialcommunication_comDBResizeDatabase(void* hcomdb, uint32_t newsize);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WRAPPER_H */
