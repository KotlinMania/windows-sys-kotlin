#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_serialcommunication_ComDBClaimNextFreePort(void* hcomdb, void* comnumber);
int32_t windowssys_windows_win32_devices_serialcommunication_ComDBClaimPort(void* hcomdb, uint32_t comnumber, int32_t forceclaim, void* forced);
int32_t windowssys_windows_win32_devices_serialcommunication_ComDBClose(void* hcomdb);
int32_t windowssys_windows_win32_devices_serialcommunication_ComDBGetCurrentPortUsage(void* hcomdb, void* buffer, uint32_t buffersize, uint32_t reporttype, void* maxportsreported);
int32_t windowssys_windows_win32_devices_serialcommunication_ComDBOpen(void* phcomdb);
int32_t windowssys_windows_win32_devices_serialcommunication_ComDBReleasePort(void* hcomdb, uint32_t comnumber);
int32_t windowssys_windows_win32_devices_serialcommunication_ComDBResizeDatabase(void* hcomdb, uint32_t newsize);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WINDOWS_WIN32_DEVICES_SERIALCOMMUNICATION_WRAPPER_H */
