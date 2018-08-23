package ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * vxlan encapsulation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * identity vxlan {
 *   base eth-encapsulation-type;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/vxlan</i>
 *
 */
public interface Vxlan
    extends
    EthEncapsulationType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vxlan");


}

