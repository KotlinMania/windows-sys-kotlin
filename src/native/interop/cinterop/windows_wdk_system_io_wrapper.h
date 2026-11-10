#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_IO_WINDOWS_WDK_SYSTEM_IO_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_IO_WINDOWS_WDK_SYSTEM_IO_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_system_io_ntDeviceIoControlFile(void* filehandle, void* event, void* apcroutine, void* apccontext, void* iostatusblock, uint32_t iocontrolcode, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_IO_WINDOWS_WDK_SYSTEM_IO_WRAPPER_H */
