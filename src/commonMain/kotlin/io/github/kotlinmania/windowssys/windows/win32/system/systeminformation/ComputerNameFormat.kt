// port-lint: source Windows/Win32/System/SystemInformation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

public typealias COMPUTER_NAME_FORMAT = Int

public const val ComputerNameNetBIOS: COMPUTER_NAME_FORMAT = 0
public const val ComputerNameDnsHostname: COMPUTER_NAME_FORMAT = 1
public const val ComputerNameDnsDomain: COMPUTER_NAME_FORMAT = 2
public const val ComputerNameDnsFullyQualified: COMPUTER_NAME_FORMAT = 3
public const val ComputerNamePhysicalNetBIOS: COMPUTER_NAME_FORMAT = 4
public const val ComputerNamePhysicalDnsHostname: COMPUTER_NAME_FORMAT = 5
public const val ComputerNamePhysicalDnsDomain: COMPUTER_NAME_FORMAT = 6
public const val ComputerNamePhysicalDnsFullyQualified: COMPUTER_NAME_FORMAT = 7
public const val ComputerNameMax: COMPUTER_NAME_FORMAT = 8
