#ifndef WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock(void* lock, bool fwrite, void* lockstate);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag(void* virtualaddress, uint32_t length, uint32_t tag);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer(void* timer, void* timercancelled);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty(void* ndisvchandle, void* protocolpartycontext, void* callparameters, void* ndispartyhandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily(void* ndisafhandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall(void* ndisvchandle, void* ndispartyhandle, void* buffer, uint32_t size);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap(void* ndissaphandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty(void* ndispartyhandle, void* buffer, uint32_t size);
void windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete(int32_t status, void* ndisvchandle, void* callparameters);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall(void* ndisvchandle, void* callparameters, void* protocolpartycontext, void* ndispartyhandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS(void* ndisvchandle, void* callparameters);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap(void* ndisafhandle, void* protocolsapcontext, void* sap, void* ndissaphandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration(void* configurationhandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile(void* filehandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc(void* ndisvchandle, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete(int32_t status, void* ndispartyhandle, void* callmgrpartycontext, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete(int32_t status, void* ndisafhandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete(int32_t status, void* ndisvchandle, void* ndispartyhandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc(void* ndisvchandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete(int32_t status, void* ndissaphandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected(void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall(void* ndissaphandle, void* ndisvchandle, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange(void* ndisvchandle, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall(int32_t closestatus, void* ndisvchandle, void* buffer, uint32_t size);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty(int32_t dropstatus, void* ndispartyhandle, void* buffer, uint32_t size);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete(int32_t status, void* ndispartyhandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete(int32_t status, void* ndisvchandle, void* ndispartyhandle, void* callmgrpartycontext, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete(int32_t status, void* ndisvchandle, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete(int32_t status, void* ndisafhandle, void* callmgrafcontext);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete(int32_t status, void* ndissaphandle, void* callmgrsapcontext);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName(void* ndisvchandle, void* baseinstancename, void* vcinstancename);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc(void* ndisbindinghandle, void* ndisafhandle, void* protocolvccontext, void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc(void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId(void* ndisvchandle, void* tapicallid);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer(void* status, void* ndisdmahandle, void* buffer, uint32_t offset, uint32_t length, bool writetodevice);
void windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer(void* status, void* buffer, void* poolhandle, void* memorydescriptor, uint32_t offset, uint32_t length);
void windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack(void);
void windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory(void* virtualaddress, uint32_t length, uint32_t memoryflags);
uint8_t windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId(void);
void windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts(void* pidlecount, void* pkernelanduser, void* pindex);
void windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage(void* pcpuusage);
void* windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress(void* ndisroutinename);
uint32_t windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment(void);
uint32_t windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion(void);
void windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport(void* driverhandle, void* protocolhandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance(void* driverhandle, void* deviceinstance);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance(void* ndisminiporthandle);
void* windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext(void* ndisbindinghandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx(void* driverhandle, void* driverinstance, void* devicecontext);
void windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent(void* event);
void windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock(void* lock);
void windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString(void* destination, void* source);
void windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer(void* timer, void* timerfunction, void* functioncontext);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory(void* miniportadapterhandle, uint32_t length, bool cached, void* virtualaddress, void* physicaladdress);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync(void* miniportadapterhandle, uint32_t length, bool cached, void* context);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer(void* timer, void* timercancelled);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog(void* loghandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc(void* ndisvchandle, void* callparameters);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc(void* miniportadapterhandle, void* ndisafhandle, void* miniportvccontext, void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc(void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc(void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily(void* miniportadapterhandle, void* addressfamily, void* cmcharacteristics, uint32_t sizeofcmcharacteristics);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete(int32_t status, void* ndisvchandle, void* callparameters);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete(int32_t status, void* ndisvchandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog(void* miniportadapterhandle, uint32_t size, void* loghandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel(void* miniportdmahandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange(void* miniportadapterhandle, uint32_t initialport, uint32_t numberofports, void* portoffset);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog(void* loghandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory(void* miniportadapterhandle, uint32_t length, bool cached, void* virtualaddress, int64_t physicaladdress);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty(void* miniportadapterhandle, void* physicaldeviceobject, void* functionaldeviceobject, void* nextdeviceobject, void* allocatedresources, void* allocatedresourcestranslated);
uint32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment(void* miniportadapterhandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer(void* timer, void* miniportadapterhandle, void* timerfunction, void* functioncontext);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace(void* virtualaddress, void* miniportadapterhandle, int64_t physicaladdress, uint32_t length);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName(void* padapterinstancename, void* miniporthandle);
uint32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter(void* miniportdmahandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel(void* miniportdmahandle, void* miniportadapterhandle, uint32_t dmachannel, bool dma32bitaddresses, void* dmadescription, uint32_t maximumlength);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange(void* portoffset, void* miniportadapterhandle, uint32_t initialport, uint32_t numberofports);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport(void* miniporthandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer(void* timer, uint32_t millisecondperiod);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep(uint32_t microsecondstosleep);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace(void* miniportadapterhandle, void* virtualaddress, uint32_t length);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData(void* loghandle, void* logbuffer, uint32_t logbuffersize);
void windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile(void* status, void* mappedbuffer, void* filehandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex(void* status, void* configurationhandle, uint32_t arg_2_index, void* keyname, void* keyhandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName(void* status, void* configurationhandle, void* subkeyname, void* subkeyhandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile(void* status, void* filehandle, void* filelength, void* filename, int64_t highestacceptableaddress);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName(void* padapterinstancename, void* ndisbindinghandle);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName(void* padapterinstancename, void* bindingcontext);
void windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings(void* ndisprotocolhandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration(void* status, void* parametervalue, void* configurationhandle, void* keyword, int32_t parametertype);
void windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress(void* status, void* networkaddress, void* networkaddresslength, void* configurationhandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack(void* registercallback, void* pnphandler);
void windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock(void* lock, void* lockstate);
void windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent(void* event);
void windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent(void* event);
void windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer(void* ndistimer, uint32_t millisecondsperiod);
void windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer(void* timer, uint32_t millisecondstodelay);
void windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx(void* ndistimer, uint32_t millisecondstodelay, void* functioncontext);
void windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer(void* status, void* ndisdmahandle, void* buffer, uint32_t offset, uint32_t length, bool writetodevice);
int8_t windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount(void);
void windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile(void* filehandle);
void windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory(void* ndisadapterhandle, uint32_t length, void* virtualaddress, int64_t physicaladdress);
bool windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent(void* event, uint32_t mstowait);
void windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration(void* status, void* configurationhandle, void* keyword, void* parametervalue);
void windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry(void* ndisadapterhandle, uint32_t errorcode, uint32_t numberoferrorvalues, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry(void* loghandle, int32_t eventcode, uint32_t uniqueeventvalue, uint16_t numstrings, void* stringslist, uint32_t datasize, void* data);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WINDOWS_WDK_NETWORKMANAGEMENT_NDIS_WRAPPER_H */
