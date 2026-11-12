#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_POWER_WINDOWS_WIN32_SYSTEM_POWER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_POWER_WINDOWS_WIN32_SYSTEM_POWER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemPowerCallNtPowerInformation(int32_t informationlevel, void* inputbuffer, uint32_t inputbufferlength, void* outputbuffer, uint32_t outputbufferlength);
bool windowssysWindowsWin32SystemPowerCanUserWritePwrScheme(void);
bool windowssysWindowsWin32SystemPowerDeletePwrScheme(uint32_t uiid);
bool windowssysWindowsWin32SystemPowerDevicePowerClose(void);
bool windowssysWindowsWin32SystemPowerDevicePowerEnumDevices(uint32_t queryindex, uint32_t queryinterpretationflags, uint32_t queryflags, void* preturnbuffer, void* pbuffersize);
bool windowssysWindowsWin32SystemPowerDevicePowerOpen(uint32_t debugmask);
uint32_t windowssysWindowsWin32SystemPowerDevicePowerSetDeviceState(void* devicedescription, uint32_t setflags, void* setdata);
bool windowssysWindowsWin32SystemPowerEnumPwrSchemes(void* lpfn, int64_t lparam);
bool windowssysWindowsWin32SystemPowerGetActivePwrScheme(void* puiid);
bool windowssysWindowsWin32SystemPowerGetCurrentPowerPolicies(void* pglobalpowerpolicy, void* ppowerpolicy);
int32_t windowssysWindowsWin32SystemPowerGetDevicePowerState(void* hdevice, void* pfon);
bool windowssysWindowsWin32SystemPowerGetPwrCapabilities(void* lpspc);
bool windowssysWindowsWin32SystemPowerGetPwrDiskSpindownRange(void* puimax, void* puimin);
int32_t windowssysWindowsWin32SystemPowerGetSystemPowerStatus(void* lpsystempowerstatus);
bool windowssysWindowsWin32SystemPowerIsAdminOverrideActive(void* papp);
bool windowssysWindowsWin32SystemPowerIsPwrHibernateAllowed(void);
bool windowssysWindowsWin32SystemPowerIsPwrShutdownAllowed(void);
bool windowssysWindowsWin32SystemPowerIsPwrSuspendAllowed(void);
int32_t windowssysWindowsWin32SystemPowerIsSystemResumeAutomatic(void);
uint32_t windowssysWindowsWin32SystemPowerPowerCanRestoreIndividualDefaultPowerScheme(void* schemeguid);
int32_t windowssysWindowsWin32SystemPowerPowerClearRequest(void* powerrequest, int32_t requesttype);
uint32_t windowssysWindowsWin32SystemPowerPowerCreatePossibleSetting(void* rootsystempowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex);
void* windowssysWindowsWin32SystemPowerPowerCreateRequest(void* context);
uint32_t windowssysWindowsWin32SystemPowerPowerCreateSetting(void* rootsystempowerkey, void* subgroupofpowersettingsguid, void* powersettingguid);
uint32_t windowssysWindowsWin32SystemPowerPowerDeleteScheme(void* rootpowerkey, void* schemeguid);
int32_t windowssysWindowsWin32SystemPowerPowerDeterminePlatformRole(void);
int32_t windowssysWindowsWin32SystemPowerPowerDeterminePlatformRoleEx(uint32_t version);
uint32_t windowssysWindowsWin32SystemPowerPowerDuplicateScheme(void* rootpowerkey, void* sourceschemeguid, void* destinationschemeguid);
uint32_t windowssysWindowsWin32SystemPowerPowerEnumerate(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, int32_t accessflags, uint32_t arg4Index, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerGetActiveScheme(void* userrootpowerkey, void* activepolicyguid);
uint32_t windowssysWindowsWin32SystemPowerPowerImportPowerScheme(void* rootpowerkey, void* importfilenamepath, void* destinationschemeguid);
bool windowssysWindowsWin32SystemPowerPowerIsSettingRangeDefined(void* subkeyguid, void* settingguid);
uint32_t windowssysWindowsWin32SystemPowerPowerOpenSystemPowerKey(void* phsystempowerkey, uint32_t access, int32_t openexisting);
uint32_t windowssysWindowsWin32SystemPowerPowerOpenUserPowerKey(void* phuserpowerkey, uint32_t access, int32_t openexisting);
uint32_t windowssysWindowsWin32SystemPowerPowerReadACDefaultIndex(void* rootpowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* acdefaultindex);
uint32_t windowssysWindowsWin32SystemPowerPowerReadACValue(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerReadACValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* acvalueindex);
uint32_t windowssysWindowsWin32SystemPowerPowerReadDCDefaultIndex(void* rootpowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* dcdefaultindex);
uint32_t windowssysWindowsWin32SystemPowerPowerReadDCValue(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerReadDCValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* dcvalueindex);
uint32_t windowssysWindowsWin32SystemPowerPowerReadDescription(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerReadFriendlyName(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerReadIconResourceSpecifier(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerReadPossibleDescription(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerReadPossibleFriendlyName(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerReadPossibleValue(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* type, uint32_t possiblesettingindex, void* buffer, void* buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerReadSettingAttributes(void* subgroupguid, void* powersettingguid);
uint32_t windowssysWindowsWin32SystemPowerPowerReadValueIncrement(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valueincrement);
uint32_t windowssysWindowsWin32SystemPowerPowerReadValueMax(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valuemaximum);
uint32_t windowssysWindowsWin32SystemPowerPowerReadValueMin(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* valueminimum);
uint32_t windowssysWindowsWin32SystemPowerPowerReadValueUnitsSpecifier(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, void* buffersize);
int32_t windowssysWindowsWin32SystemPowerPowerRegisterForEffectivePowerModeNotifications(uint32_t version, void* callback, void* context, void* registrationhandle);
uint32_t windowssysWindowsWin32SystemPowerPowerRegisterSuspendResumeNotification(uint32_t flags, void* recipient, void* registrationhandle);
uint32_t windowssysWindowsWin32SystemPowerPowerRemovePowerSetting(void* powersettingsubkeyguid, void* powersettingguid);
uint32_t windowssysWindowsWin32SystemPowerPowerReplaceDefaultPowerSchemes(void);
uint32_t windowssysWindowsWin32SystemPowerPowerReportThermalEvent(void* event);
uint32_t windowssysWindowsWin32SystemPowerPowerRestoreDefaultPowerSchemes(void);
uint32_t windowssysWindowsWin32SystemPowerPowerRestoreIndividualDefaultPowerScheme(void* schemeguid);
uint32_t windowssysWindowsWin32SystemPowerPowerSetActiveScheme(void* userrootpowerkey, void* schemeguid);
int32_t windowssysWindowsWin32SystemPowerPowerSetRequest(void* powerrequest, int32_t requesttype);
uint32_t windowssysWindowsWin32SystemPowerPowerSettingAccessCheck(int32_t accessflags, void* powerguid);
uint32_t windowssysWindowsWin32SystemPowerPowerSettingAccessCheckEx(int32_t accessflags, void* powerguid, uint32_t accesstype);
uint32_t windowssysWindowsWin32SystemPowerPowerSettingRegisterNotification(void* settingguid, uint32_t flags, void* recipient, void* registrationhandle);
uint32_t windowssysWindowsWin32SystemPowerPowerSettingUnregisterNotification(int64_t registrationhandle);
int32_t windowssysWindowsWin32SystemPowerPowerUnregisterFromEffectivePowerModeNotifications(void* registrationhandle);
uint32_t windowssysWindowsWin32SystemPowerPowerUnregisterSuspendResumeNotification(int64_t registrationhandle);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteACDefaultIndex(void* rootsystempowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t defaultacindex);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteACValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t acvalueindex);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteDCDefaultIndex(void* rootsystempowerkey, void* schemepersonalityguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t defaultdcindex);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteDCValueIndex(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t dcvalueindex);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteDescription(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteFriendlyName(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteIconResourceSpecifier(void* rootpowerkey, void* schemeguid, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerWritePossibleDescription(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerWritePossibleFriendlyName(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerWritePossibleValue(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t type, uint32_t possiblesettingindex, void* buffer, uint32_t buffersize);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteSettingAttributes(void* subgroupguid, void* powersettingguid, uint32_t attributes);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteValueIncrement(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valueincrement);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteValueMax(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valuemaximum);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteValueMin(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, uint32_t valueminimum);
uint32_t windowssysWindowsWin32SystemPowerPowerWriteValueUnitsSpecifier(void* rootpowerkey, void* subgroupofpowersettingsguid, void* powersettingguid, void* buffer, uint32_t buffersize);
bool windowssysWindowsWin32SystemPowerReadGlobalPwrPolicy(void* pglobalpowerpolicy);
bool windowssysWindowsWin32SystemPowerReadProcessorPwrScheme(uint32_t uiid, void* pmachineprocessorpowerpolicy);
bool windowssysWindowsWin32SystemPowerReadPwrScheme(uint32_t uiid, void* ppowerpolicy);
int64_t windowssysWindowsWin32SystemPowerRegisterPowerSettingNotification(void* hrecipient, void* powersettingguid, uint32_t flags);
int64_t windowssysWindowsWin32SystemPowerRegisterSuspendResumeNotification(void* hrecipient, uint32_t flags);
int32_t windowssysWindowsWin32SystemPowerRequestWakeupLatency(int32_t latency);
bool windowssysWindowsWin32SystemPowerSetActivePwrScheme(uint32_t uiid, void* pglobalpowerpolicy, void* ppowerpolicy);
bool windowssysWindowsWin32SystemPowerSetSuspendState(bool bhibernate, bool bforce, bool bwakeupeventsdisabled);
int32_t windowssysWindowsWin32SystemPowerSetSystemPowerState(int32_t fsuspend, int32_t fforce);
uint32_t windowssysWindowsWin32SystemPowerSetThreadExecutionState(uint32_t esflags);
int32_t windowssysWindowsWin32SystemPowerUnregisterPowerSettingNotification(int64_t handle);
int32_t windowssysWindowsWin32SystemPowerUnregisterSuspendResumeNotification(int64_t handle);
bool windowssysWindowsWin32SystemPowerValidatePowerPolicies(void* pglobalpowerpolicy, void* ppowerpolicy);
bool windowssysWindowsWin32SystemPowerWriteGlobalPwrPolicy(void* pglobalpowerpolicy);
bool windowssysWindowsWin32SystemPowerWriteProcessorPwrScheme(uint32_t uiid, void* pmachineprocessorpowerpolicy);
bool windowssysWindowsWin32SystemPowerWritePwrScheme(void* puiid, void* lpszschemename, void* lpszdescription, void* lpscheme);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_POWER_WINDOWS_WIN32_SYSTEM_POWER_WRAPPER_H */
