## Internet Protocol Suite (TCP/IP)

### Overview

The Internet protocol suite, commonly known as TCP/IP, organizes communication protocols used in computer networks. It includes the Transmission Control Protocol (TCP), User Datagram Protocol (UDP), and Internet Protocol (IP). It organizes into four layers: link, internet, transport, and application.

### History

- DARPA initiated ARPANET in 1969, leading to the development of TCP/IP.
- Bob Kahn and Vinton Cerf developed TCP/IP in the early 1970s.
- TCP was split into TCP and IP in 1978.
- TCP/IP was adopted as the standard for military networks in 1982.
- Migration from NCP to TCP/IP was completed in 1983.
- TCP/IP gained commercial adoption in the mid-1980s.

### Protocol Layers

1. **Link Layer**: Deals with data within a single network segment.
2. **Internet Layer**: Provides internetworking between independent networks.
3. **Transport Layer**: Handles host-to-host communication.
4. **Application Layer**: Facilitates process-to-process data exchange.

### Key Principles

- **End-to-end principle**: Intelligence at the edges of the network.
- **Robustness principle**: Conservative sending, liberal receiving.
- **Encapsulation**: Abstraction of protocols and services.

### Implementation

TCP/IP can run on any computing platform and includes protocols like IP, ARP, ICMP, TCP, UDP, and IGMP.

### Comparison with OSI Model

- TCP/IP's layers are not strictly equivalent to OSI layers.
- TCP/IP's application layer combines functions of OSI's application, presentation, and session layers.
- TCP/IP's network layer includes routing protocols, unlike OSI.

### Implementations

TCP/IP has been implemented on virtually every computing platform. A minimal implementation includes IP, ARP, ICMP, TCP, UDP, and possibly IPv6 components.




## Internet Control Message Protocol (ICMP)

### Overview
- **Purpose**: ICMP serves as a supporting protocol in the Internet protocol suite, facilitating error messages and operational information exchange between network devices.
- **Layer**: ICMP operates at the network layer of the OSI model.
- **Integration**: It is closely integrated with IPv4.
  
### Message Structure
- **Header**: Contains fields like Type, Code, and Checksum.
- **Data Section**: Variable-sized, depending on the specific ICMP message type.
  
### Control Messages
- **Notable Types**:
  - Echo Reply
  - Destination Unreachable
  - Time Exceeded
  - Redirect Message

### Datagram Structure
- **Encapsulation**: ICMP packets are encapsulated within IPv4 packets.
- **Contents**: ICMP header follows the IPv4 header and precedes the data section.

### Security Implications
- **Exploitation**: ICMP can be exploited for attacks like denial-of-service (DoS) attacks.
- **Deprecation**: Certain ICMP functionalities have been deprecated due to inefficiencies or security concerns.

| Type  | Code | Status       | Description                                       | Why                                                       |
| ----- | ---- | ------------ | ------------------------------------------------- | --------------------------------------------------------- |
| 0     | 0    |              | Echo reply (used to ping)                         | Control message for ping functionality                    |
| 1-2   |      | unassigned   | Reserved                                          | Reserved for future use                                   |
| 3     | 0    |              | **Destination network unreachable**               | **Destination network unreachable**                       |
|       | 1    |              | Destination host unreachable                      | Destination host is unreachable                           |
|       | 2    |              | Destination protocol unreachable                  | Destination protocol is unreachable                       |
|       | 3    |              | Destination port unreachable                      | Destination port is unreachable                           |
|       | 4    |              | Fragmentation required, and DF flag set           | Fragmentation required, but DF flag set                   |
|       | 5    |              | Source route failed                               | Source route failed                                       |
|       | 6    |              | Destination network unknown                       | Destination network is unknown                            |
|       | 7    |              | Destination host unknown                          | Destination host is unknown                               |
|       | 8    |              | Source host isolated                              | Source host is isolated                                   |
|       | 9    |              | Network administratively prohibited               | Network administratively prohibited                       |
|       | 10   |              | Host administratively prohibited                  | Host administratively prohibited                          |
|       | 11   |              | Network unreachable for ToS                       | Network unreachable for Type of Service                   |
|       | 12   |              | Host unreachable for ToS                          | Host unreachable for Type of Service                      |
|       | 13   |              | Communication administratively prohibited         | Communication administratively prohibited                 |
|       | 14   |              | Host Precedence Violation                         | Host Precedence Violation                                 |
|       | 15   |              | Precedence cutoff in effect                       | Precedence cutoff in effect                               |
| 4     | 0    | deprecated   | Source quench (congestion control)                | Congestion control mechanism, deprecated by RFC 1812      |
| 5     | 0    |              | Redirect Datagram for the Network                 | Redirect Datagram for the Network                         |
|       | 1    |              | Redirect Datagram for the Host                    | Redirect Datagram for the Host                            |
|       | 2    |              | Redirect Datagram for the ToS & network           | Redirect Datagram for the Type of Service & network       |
|       | 3    |              | Redirect Datagram for the ToS & host              | Redirect Datagram for the Type of Service & host          |
|       | 6    | deprecated   | Alternate Host Address                            | Deprecated - Alternate Host Address                       |
|       | 7    | unassigned   | Reserved                                          | Reserved for future use                                   |
| 8     | 0    |              | Echo request (used to ping)                       | Control message for ping functionality                    |
| 9     | 0    |              | Router Advertisement                              | Router Advertisement                                      |
| 10    | 0    |              | Router discovery/selection/solicitation           | Router discovery/selection/solicitation                   |
| 11    | 0    |              | TTL expired in transit                            | Time to Live expired in transit                           |
|       | 1    |              | Fragment reassembly time exceeded                 | Fragment reassembly time exceeded                         |
| 12    | 0    |              | Pointer indicates the error                       | Pointer indicates the error                               |
|       | 1    |              | Missing a required option                         | Missing a required option                                 |
|       | 2    |              | Bad length                                        | Bad length                                                |
| 13    | 0    |              | Timestamp                                         | Timestamp                                                 |
| 14    | 0    |              | Timestamp reply                                   | Timestamp reply                                           |
| 15    | 0    | deprecated   | Information Request                               | Deprecated - Information Request                          |
| 16    | 0    | deprecated   | Information Reply                                 | Deprecated - Information Reply                            |
| 17    | 0    | deprecated   | Address Mask Request                              | Deprecated - Address Mask Request                         |
| 18    | 0    | deprecated   | Address Mask Reply                                | Deprecated - Address Mask Reply                           |
| 19    |      | reserved     | Reserved for security                             | Reserved for security                                     |
| 20-29 |      | reserved     | Reserved for robustness experiment                | Reserved for robustness experiment                        |
| 30    | 0    | deprecated   | Information Request                               | Deprecated - Information Request                          |
| 31    |      | deprecated   | Datagram Conversion Error                         | Deprecated - Datagram Conversion Error                    |
| 32    |      | deprecated   | Mobile Host Redirect                              | Deprecated - Mobile Host Redirect                         |
| 33    |      | deprecated   | Where-Are-You (originally meant for IPv6)         | Deprecated - Where-Are-You (originally for IPv6)          |
| 34    |      | deprecated   | Here-I-Am (originally meant for IPv6)             | Deprecated - Here-I-Am (originally for IPv6)              |
| 35    |      | deprecated   | Mobile Registration Request                       | Deprecated - Mobile Registration Request                  |
| 36    |      | deprecated   | Mobile Registration Reply                         | Deprecated - Mobile Registration Reply                    |
| 37    |      | deprecated   | Domain Name Request                               | Deprecated - Domain Name Request                          |
| 38    |      | deprecated   | Domain Name Reply                                 | Deprecated - Domain Name Reply                            |
| 39    |      | deprecated   | SKIP Algorithm Discovery Protocol                 | Deprecated - SKIP Algorithm Discovery Protocol            |
| 40    |      |              | Photuris, Security failures                       | Photuris, Security failures                               |
| 41    |      | experimental | ICMP for experimental mobility protocols          | Experimental - ICMP for experimental mobility protocols   |
| 42    | 0    |              | Request Extended Echo (XPing - see Extended Ping) | Request Extended Echo (XPing) - see Extended Ping (Xping) |
| 43    | 0    |              | Extended Echo Reply                               | Extended Echo Reply                                       |
|       | 1    |              | Malformed Query                                   | Malformed Query                                           |
|       | 2    |              | No Such Interface                                 | No Such Interface                                         |
|       | 3    |              | No Such                                           |                                                           |
|       |      |              |                                                   |                                                           |


