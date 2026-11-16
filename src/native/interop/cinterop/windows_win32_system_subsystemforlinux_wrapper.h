#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemSubsystemforlinuxWslConfigureDistribution(void* distributionname, uint32_t defaultuid, int32_t wsldistributionflags);
int32_t windowssysWindowsWin32SystemSubsystemforlinuxWslGetDistributionConfiguration(void* distributionname, void* distributionversion, void* defaultuid, void* wsldistributionflags, void* defaultenvironmentvariables, void* defaultenvironmentvariablecount);
int32_t windowssysWindowsWin32SystemSubsystemforlinuxWslIsDistributionRegistered(void* distributionname);
int32_t windowssysWindowsWin32SystemSubsystemforlinuxWslLaunch(void* distributionname, void* command, int32_t usecurrentworkingdirectory, void* arg3Stdin, void* arg4Stdout, void* arg5Stderr, void* process);
int32_t windowssysWindowsWin32SystemSubsystemforlinuxWslLaunchInteractive(void* distributionname, void* command, int32_t usecurrentworkingdirectory, void* exitcode);
int32_t windowssysWindowsWin32SystemSubsystemforlinuxWslRegisterDistribution(void* distributionname, void* targzfilename);
int32_t windowssysWindowsWin32SystemSubsystemforlinuxWslUnregisterDistribution(void* distributionname);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WINDOWS_WIN32_SYSTEM_SUBSYSTEMFORLINUX_WRAPPER_H */
